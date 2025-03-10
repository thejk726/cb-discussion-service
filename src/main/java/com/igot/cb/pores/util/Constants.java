package com.igot.cb.pores.util;

/**
 * @author Mahesh RV
 */
public class Constants {

    public static final String KEYSPACE_SUNBIRD = "sunbird";
    public static final String CORE_CONNECTIONS_PER_HOST_FOR_LOCAL = "coreConnectionsPerHostForLocal";
    public static final String CORE_CONNECTIONS_PER_HOST_FOR_REMOTE = "coreConnectionsPerHostForRemote";
    public static final String MAX_CONNECTIONS_PER_HOST_FOR_LOCAL = "maxConnectionsPerHostForLocal";
    public static final String MAX_CONNECTIONS_PER_HOST_FOR_REMOTE = "maxConnectionsPerHostForRemote";
    public static final String MAX_REQUEST_PER_CONNECTION = "maxRequestsPerConnection";
    public static final String HEARTBEAT_INTERVAL = "heartbeatIntervalSeconds";
    public static final String POOL_TIMEOUT = "poolTimeoutMillis";
    public static final String CASSANDRA_CONFIG_HOST = "cassandra.config.host";
    public static final String SUNBIRD_CASSANDRA_CONSISTENCY_LEVEL = "LOCAL_QUORUM";
    public static final String EXCEPTION_MSG_FETCH = "Exception occurred while fetching record from ";
    public static final String INSERT_INTO = "INSERT INTO ";
    public static final String DOT = ".";
    public static final String OPEN_BRACE = "(";
    public static final String VALUES_WITH_BRACE = ") VALUES (";
    public static final String QUE_MARK = "?";
    public static final String COMMA = ",";
    public static final String CLOSING_BRACE = ");";
    public static final String RESPONSE = "response";
    public static final String SUCCESS = "success";
    public static final String FAILED = "Failed";
    public static final String ERROR_MESSAGE = "errmsg";
    public static final String INDEX_TYPE = "_doc";
    public static final String REDIS_KEY_PREFIX = "cbpores_";
    public static final String KEYWORD = ".keyword";
    public static final String ASC = "asc";
    public static final String DOT_SEPARATOR = ".";
    public static final String SHA_256_WITH_RSA = "SHA256withRSA";
    public static final String UNAUTHORIZED = "Unauthorized";
    public static final String SUB = "sub";
    public static final String SSO_URL = "sso.url";
    public static final String SSO_REALM = "sso.realm";
    public static final String ACCESS_TOKEN_PUBLICKEY_BASEPATH = "accesstoken.publickey.basepath";
    public static final String ID = "id";
    public static final String FETCH_RESULT_CONSTANT = ".fetchResult:";
    public static final String URI_CONSTANT = "URI: ";
    public static final String REQUEST_CONSTANT = "Request: ";
    public static final String RESPONSE_CONSTANT = "Response: ";
    public static final String SEARCH_OPERATION_LESS_THAN = "<";
    public static final String SEARCH_OPERATION_GREATER_THAN = ">";
    public static final String SEARCH_OPERATION_LESS_THAN_EQUALS = "<=";
    public static final String SEARCH_OPERATION_GREATER_THAN_EQUALS = ">=";
    public static final String MUST= "must";
    public static final String FILTER= "filter";
    public static final String MUST_NOT="must_not";
    public static final String SHOULD= "should";
    public static final String BOOL="bool";
    public static final String TERM="term";
    public static final String TERMS="terms";
    public static final String MATCH="match";
    public static final String RANGE="range";
    public static final String UNSUPPORTED_QUERY="Unsupported query type";
    public static final String UNSUPPORTED_RANGE= "Unsupported range condition";
    public static final String UPDATE = "UPDATE ";
    public static final String SET = " SET ";
    public static final String WHERE_ID = "where id";
    public static final String EQUAL_WITH_QUE_MARK = " = ? ";
    public static final String SEMICOLON = ";";
    public static final String USER = "user";
    public static final String UNKNOWN_IDENTIFIER = "Unknown identifier ";
    public static final String EXCEPTION_MSG_UPDATE = "Exception occurred while updating record to ";
    public static final String DISCUSSION_VALIDATION_FILE = "/payloadValidation/discussionValidation.json";
    public static final String DISCUSSION_INDEX = "discussion_entity";
    public static final String FAILED_TO_CREATE_DISCUSSION = "Failed to create the discussion";
    public static final String SEARCH_RESULTS = "search_results";
    public static final String DISCUSSION_ID = "discussionId";
    public static final  String DISCUSSION_IS_NOT_ACTIVE = "Discussion is not active";
    public static final String DISCUSSION_UPDATE_VALIDATION_FILE ="/payloadValidation/discussionUpdateValidation.json";
    public static final String USER_DISCUSSION_VOTES = "user_discussion_votes";
    public static final String DISCUSSION_ID_KEY = "discussionid";
    public static final String EXCEPTION_MSG_DELETE = "Exception occurred while deleting record from ";
    public static final String VOTE_COUNT = "voteCount";
    public static final String VOTE_TYPE = "votetype";
    public static final String TAGS = "tags";
    public static final String TARGET_TOPIC = "targetTopic";
    public static final String UP = "up";
    public static final String DOWN = "down";
    public static final String DISCUSSION_CACHE_PREFIX = "discussion_";
    public static final String ANSWER_POSTS = "answerPosts";
    public static final String VOTETYPE= "voteType";
    public static final String USERID= "userid";
    public static final String DISCUSSION_IS_INACTIVE = "Discussion is inactive.";
    public static final String FAILED_TO_VOTE = "failed to update user vote";
    public static final String USER_ALREADY_VOTED = "User already voted %s";
    public static final String MINIMUM_CHARACTERS_NEEDED= "Minimum 3 characters are required to search";
    public static final String FAILED_TO_DELETE_DISCUSSION = "failed to delete discussion";
    public static final String API_VERSION_1 = "1.0";
    public static final String INVALID_AUTH_TOKEN = "invalid auth token Please supply a valid auth token";
    public static final String CREATED_BY = "createdBy";
    public static final String CREATED_ON = "createdOn";
    public static final String ID_NOT_FOUND = "Id not found";
    public static final String INVALID_ID = "Invalid Id";
    public static final String TYPE = "type";
    public static final String TITLE = "title";
    public static final String DESCRIPTION_PAYLOAD = "Description";
    public static final String IS_ACTIVE = "isActive";
    public static final String DELETED_SUCCESSFULLY = "deleted successfully";
    public static final String NO_DATA_FOUND = "No data found";
    public static final String USER_ID_RQST = "userId";
    public static final String REQUEST_PAYLOAD = "requestPayload";
    public static final String JWT_SECRET_KEY = "demand_search_result";
    public static final String FAILED_CONST = "FAILED";
    public static final String X_AUTH_TOKEN = "x-authenticated-user-token";
    public static final String UPDATED_ON = "updatedOn";

    private Constants() {
    }
}
