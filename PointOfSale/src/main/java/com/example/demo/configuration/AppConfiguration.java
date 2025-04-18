package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.Executor;

@Configuration
public class AppConfiguration {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    /**
     * Here iam defining custom executor, it will has its own pool, not depend on default Task executor thread pool.
     * for Pdf generation i will use this Executor and for external method calls i will use different executor
     * So lighter tasks won't be delayed due to heavy tasks.
     */
    @Bean(name = "pdfExecutor")
    public Executor pdfExecutor() {
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setCorePoolSize(5);  //corethreads
        threadPoolTaskExecutor.setMaxPoolSize(10); // max threads
        threadPoolTaskExecutor.setQueueCapacity(100); // queue before rejecting tasks
        threadPoolTaskExecutor.setThreadNamePrefix("Async-Thread"); // for logs!
        threadPoolTaskExecutor.initialize();
        return threadPoolTaskExecutor;
    }

    @Bean(name = "externalServiceExecutor")
    public Executor externalServiceExecutor() {
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setCorePoolSize(4);  //corethreads
        threadPoolTaskExecutor.setMaxPoolSize(6); // max threads
        threadPoolTaskExecutor.setQueueCapacity(100); // queue before rejecting tasks
        threadPoolTaskExecutor.setThreadNamePrefix("Service-Async-Thread"); // for logs!
        threadPoolTaskExecutor.initialize();
        return threadPoolTaskExecutor;
    }
}
