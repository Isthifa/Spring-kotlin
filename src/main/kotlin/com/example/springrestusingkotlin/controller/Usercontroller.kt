package com.example.springrestusingkotlin.controller

import com.example.springrestusingkotlin.Entity.User
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class Usercontroller {

        @GetMapping("/user")
        fun getUser(): ResponseEntity<String> {
            return ResponseEntity.ok("Hello User")
        }
    //save user details in database
    @PostMapping("/user")
    fun saveUser(@RequestBody user: User): ResponseEntity<User> {
        return ResponseEntity.ok(user)
    }
}