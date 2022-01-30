package com.example.r2dbc.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("PERSON")
class Person(
    @Id
    var id: Long? = null,
    var name: String,
    var age: Int
)