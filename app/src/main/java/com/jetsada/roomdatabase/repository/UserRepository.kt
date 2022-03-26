package com.jetsada.roomdatabase.repository

import androidx.lifecycle.LiveData
import com.jetsada.roomdatabase.model.User
import com.jetsada.roomdatabase.database.Entity.UserDao

class UserRepository(private val userDao: UserDao) {
    
    fun readAllData(): LiveData<List<User>> = userDao.readAllData()

    suspend fun addUser(user: User) {
        userDao.addUser(user)
    }

    suspend fun updateUser(user: User) {
        userDao.updateUser(user)
    }

    suspend fun deleteUser(user: User) {
        userDao.deleteUser(user)
    }

    suspend fun deleteAllUsers() {
        userDao.deleteAllUsers()
    }



}