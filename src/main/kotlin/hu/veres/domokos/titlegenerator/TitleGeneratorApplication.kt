package hu.veres.domokos.titlegenerator

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TitleGeneratorApplication

fun main(args: Array<String>) {
	runApplication<TitleGeneratorApplication>(*args)
}
