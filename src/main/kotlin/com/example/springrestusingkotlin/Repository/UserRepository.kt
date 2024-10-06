package com.example.springrestusingkotlin.Repository

import com.example.springrestusingkotlin.Entity.User
import org.springframework.data.jpa.repository.JpaRepository

abstract class UserRepository : JpaRepository<User, Long> {

}