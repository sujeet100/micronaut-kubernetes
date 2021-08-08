package com.example

import io.micronaut.context.annotation.Value
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.runtime.context.scope.Refreshable

@Controller("/myname")
@Refreshable
class MyNameController(
    @Value("\${my.name}") val name: String,
    @Value("\${my.surname}") val surName: String
) {

    @Get("/")
    fun getMyName(): String {
        return "$name $surName"
    }
}
