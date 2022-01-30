package com.example.r2dbc

import com.example.r2dbc.model.Person
import com.example.r2dbc.service.PersonService
import kotlinx.coroutines.runBlocking
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class Runner(
    private val personService: PersonService
): ApplicationRunner {
    override fun run(args: ApplicationArguments?) {
        runBlocking {
            //personService.createPerson(Person(null,"second",10))
            val person = personService.findById(3)
            println("person: id=${person?.id} name=${person?.name}, age=${person?.age}")
        }
    }
}