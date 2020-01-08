package hu.veres.domokos.titlegenerator.config

import hu.veres.domokos.exclamation.mark.ExclamationMarkClient
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class GrpcClientConfig {

    @Bean
    fun exclamationMarkClient(): ExclamationMarkClient {
        return ExclamationMarkClient();
    }

}