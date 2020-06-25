package com.BackApiTest.BackApiTest.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
class DataSourceConfiguration {

    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.username(System.getenv("back_test_db_user"));
        dataSourceBuilder.password(System.getenv("back_test_db_password"));
        dataSourceBuilder.url(System.getenv("back_test_db_url"));

        return dataSourceBuilder.build();
    }
}
