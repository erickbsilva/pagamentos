package br.com.alurafood.pagamentos;

import org.springframework.cloud.commons.util.InetUtils;
import org.springframework.cloud.commons.util.InetUtilsProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InetUtilsConfiguration {

    @Bean
    @Primary
    public InetUtils inetUtils() {
        InetUtilsProperties properties = new InetUtilsProperties();
        return new InetUtils(properties);
    }
}

