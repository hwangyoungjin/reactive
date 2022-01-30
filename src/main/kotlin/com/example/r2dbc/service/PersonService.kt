package com.example.r2dbc.service

import com.example.r2dbc.model.Person
import com.example.r2dbc.repository.PersonRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class PersonService(
    private val personRepository: PersonRepository
) {
    suspend fun createPerson(person: Person) {
        personRepository.save(person)
    }

    suspend fun findById(id: Long): Person? {
        return personRepository.findById(id)
    }
}