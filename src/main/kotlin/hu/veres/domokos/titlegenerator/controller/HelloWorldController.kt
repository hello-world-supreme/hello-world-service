package hu.veres.domokos.titlegenerator.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import hu.veres.domokos.exclamation.mark.ExclamationMarkClient
import hu.veres.domokos.titlegenerator.model.HelloResponse
import org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientAutoConfiguration
import org.springframework.web.reactive.function.client.WebClient

@RestController
class HelloWorldController(val exclamationMarkClient: ExclamationMarkClient, val webClient: WebClient) {

    @GetMapping("hello" )
    fun hello(): String {
        val exclamationMark = exclamationMarkClient.exclamationMark.message;
        val hello = webClient.get().uri("http://localhost:8082/hello").retrieve().bodyToMono(HelloResponse::class.java).block();

        return hello!!.message + " world" + exclamationMark;
    }

}