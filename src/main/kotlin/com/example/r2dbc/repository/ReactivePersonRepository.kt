package com.example.r2dbc.repository

import com.example.r2dbc.model.Person
import org.springframework.data.repository.reactive.ReactiveSortingRepository

interface ReactivePersonRepository : ReactiveSortingRepository<Person, Long>