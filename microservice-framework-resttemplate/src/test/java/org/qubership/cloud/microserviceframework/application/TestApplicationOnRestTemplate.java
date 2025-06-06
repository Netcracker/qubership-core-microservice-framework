package org.qubership.cloud.microserviceframework.application;

import org.qubership.cloud.dbaas.client.config.EnableServiceDbaasPostgresql;
import org.qubership.cloud.microserviceframework.BaseApplicationOnRestTemplate;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchDataAutoConfiguration;
import org.springframework.cloud.config.client.ConfigClientAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableServiceDbaasPostgresql
@EnableAutoConfiguration(exclude = {ElasticsearchDataAutoConfiguration.class, ConfigClientAutoConfiguration.class})
public class TestApplicationOnRestTemplate extends BaseApplicationOnRestTemplate {
}
