package com.igot.cb.pores.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.time.Duration;

@Configuration
@EnableCaching
public class RedisConfig {

  @Value("${spring.redis.host}")
  private String redisHost;

  @Value("${spring.redis.port}")
  private int redisPort;

  @Bean
  public JedisPool jedisPool() {
    JedisPoolConfig poolConfig = new JedisPoolConfig();
    poolConfig.setMaxIdle(128);
    poolConfig.setMaxTotal(3000);
    poolConfig.setMinIdle(100);
    poolConfig.setTestOnBorrow(true);
    poolConfig.setTestOnReturn(true);
    poolConfig.setTestWhileIdle(true);
    poolConfig.setMinEvictableIdleTime(Duration.ofMillis(120000));
    poolConfig.setTimeBetweenEvictionRuns(Duration.ofMillis(30000));
    poolConfig.setNumTestsPerEvictionRun(3);
    poolConfig.setBlockWhenExhausted(true);
    return  new JedisPool(poolConfig, redisHost, redisPort);
  }

  @Bean
  public RedisTemplate<String, Object> redisTemplateObject(RedisConnectionFactory connectionFactory) {
    RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
    redisTemplate.setConnectionFactory(connectionFactory);
    redisTemplate.setKeySerializer(new StringRedisSerializer());
    redisTemplate.setValueSerializer(new StringRedisSerializer()); // Configure as needed for Object
    return redisTemplate;
  }
}
