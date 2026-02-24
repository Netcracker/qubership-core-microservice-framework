package com.netcracker.cloud.microserviceframework;

import com.netcracker.cloud.restlegacy.restclient.configuration.annotation.EnableControllersAdvice;
import com.netcracker.cloud.restlegacy.restclient.configuration.annotation.EnableMessagesResolving;
import com.netcracker.cloud.routeregistration.resttemplate.EnableRouteRegistrationOnRestTemplate;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableControllersAdvice
@EnableMessagesResolving
@EnableRouteRegistrationOnRestTemplate
public class BaseApplicationOnRestTemplate extends BaseApplicationCommon {
    @Bean
    @ConditionalOnMissingBean
    SecurityFilterChain securityFilterChain(HttpSecurity http) {
        return http
                .authorizeHttpRequests(auth -> auth.anyRequest().permitAll())
                .csrf(AbstractHttpConfigurer::disable)
                .build();
    }
}
