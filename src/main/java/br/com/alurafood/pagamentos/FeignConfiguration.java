package br.com.alurafood.pagamentos;

//import org.springframework.cloud.openfeign.FeignContext;
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import feign.Logger;

@Configuration
public class FeignConfiguration {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

//    @Bean
//    public FeignContext feignContext() {
//        return new FeignContext();
//    }

//    @Bean
//    public Customizer<Resilience4JCircuitBreakerFactory> globalCustomizer() {
//        return factory -> factory.configureDefault(id -> new Resilience4JConfigBuilder(id)
//                .circuitBreakerConfig(CircuitBreakerConfig.ofDefaults())
//                .build());
//    }


}
