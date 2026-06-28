package com.example.myapplication.model

import androidx.annotation.DrawableRes

data class User(
    val id: String,
    val firstName: String,
    val lastName: String,
    val email: String,
    @DrawableRes val avatarRes: Int? = null
) {
    val fullName: String get() = "$firstName $lastName"
}
