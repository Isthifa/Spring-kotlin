package com.example.springrestusingkotlin.service

import com.example.springrestusingkotlin.Entity.User

interface UserService {


    fun saveUser(user: User) : User

    fun getUser(): List<User>
}