package com.example.r2dbc

import com.example.r2dbc.model.Person
import io.r2dbc.spi.ConnectionFactories
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.r2dbc.core.R2dbcEntityTemplate
import org.springframework.data.r2dbc.core.select


@SpringBootApplication
class R2dbcApplication

fun main(args: Array<String>) {
    runApplication<R2dbcApplication>(*args)
}
