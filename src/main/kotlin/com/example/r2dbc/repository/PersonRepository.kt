package com.example.r2dbc.repository

import com.example.r2dbc.model.Person
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface PersonRepository: CoroutineCrudRepository<Person, Long> {
}