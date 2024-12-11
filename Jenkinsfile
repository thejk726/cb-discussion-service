@Library('deploy-conf') _
node() {
    try {
        String ANSI_GREEN = "\u001B[32m"
        String ANSI_NORMAL = "\u001B[0m"
        String ANSI_BOLD = "\u001B[1m"
        String ANSI_RED = "\u001B[31m"
        String ANSI_YELLOW = "\u001B[33m"

        ansiColor('xterm') {
                stage('Checkout') {
                    if (!env.hub_org) {
                        println(ANSI_BOLD + ANSI_RED + "Uh Oh! Please set a Jenkins environment variable named hub_org with value as registery/sunbidrded" + ANSI_NORMAL)
                        error 'Please resolve the errors and rerun..'
                    } else
                        println(ANSI_BOLD + ANSI_GREEN + "Found environment variable named hub_org with value as: " + hub_org + ANSI_NORMAL)
                }
				
                cleanWs()
                checkout scm
                commit_hash = sh(script: 'git rev-parse --short HEAD', returnStdout: true).trim()
	        build_tag = sh(script: "echo " + params.github_release_tag.split('/')[-1] + "_" + commit_hash + "_" + env.BUILD_NUMBER, returnStdout: true).trim()
                echo "build_tag: " + build_tag

if(params.enable_code_analysis){
            stage('Script fetch'){
               build job: "Build/CodeReview/${JOB_BASE_NAME}", wait: true
	    //   dir("${WORKSPACE}/sonarqube"){
		// sh '''
		//   if [ ! -d ".git" ]; then
		//   git init
		//   fi
		  
		//   if ! git remote get-url origin > /dev/null 2>&1; then
		//   git remote add origin https://github.com/thejk726/sunbird-devops.git
		//   fi

		//   git config core.sparseCheckout true
		//   echo "code_analysis/script.sh" > .git/info/sparse-checkout
		//   git pull origin code_analysis_test
		// '''
	    //   }
            }

	    // stage('Code analysis'){
	    // withCredentials([string(credentialsId: 'sonar_token', variable: 'SONAR_LOGIN')]){
	    //  withSonarQubeEnv('sonar-server'){
		// sh '''
		//   ./sonarqube/code_analysis/script.sh ${SONAR_LOGIN}
		// '''
	    //  }
	    // }
	    // }
        }



        stage('docker-pre-build') {
            sh '''
	
	    docker build -f ./Dockerfile.build -t $docker_pre_build .
	    docker run --name $docker_pre_build $docker_pre_build:latest && docker cp $docker_pre_build:/opt/target/cb-discussion-service-0.0.1-SNAPSHOT.jar .
	    sleep 1
	    docker rm -f $docker_pre_build
	    docker rmi -f $docker_pre_build
            '''
        }
        stage('Build') {
                env.NODE_ENV = "build"
                print "Environment will be : ${env.NODE_ENV}"
                sh('chmod 777 build.sh')
                sh("bash -x build.sh ${build_tag} ${env.NODE_NAME} ${docker_server}")
            }
                        stage('ArchiveArtifacts') {
                    archiveArtifacts "metadata.json"
											 
													 
                    currentBuild.description = "${build_tag}"
                }

      }
        
	}
    catch (err) {
        currentBuild.result = "FAILURE"
        throw err
    }
    finally {
     //   email_notify()
    }
}
