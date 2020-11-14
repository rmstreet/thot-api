package br.com.rm.thotapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ThotApiApplication

fun main(args: Array<String>) {
	runApplication<ThotApiApplication>(*args)
}
