package com.coco.order

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ConfigProperties {

    @Bean
    @ConfigurationProperties(prefix = "redis")
    fun redisProperties() = RedisProperties()


    class RedisProperties {
        lateinit var host: String
        lateinit var port: String
        lateinit var sellingStockKey: String
    }
}