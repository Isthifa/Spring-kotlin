package com.example.springrestusingkotlin.service

import com.example.springrestusingkotlin.Entity.User
import com.example.springrestusingkotlin.Repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl : UserService{

    @Autowired
    lateinit var userRepository: UserRepository
    override fun saveUser(user: User): User {

        return userRepository.save(user)
        TODO("Not yet implemented")
    }

    override fun getUser(): List<User> {
        return userRepository.findAll()

    }


}