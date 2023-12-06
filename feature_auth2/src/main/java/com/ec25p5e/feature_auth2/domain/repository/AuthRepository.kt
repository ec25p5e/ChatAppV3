package com.ec25p5e.feature_auth2.domain.repository

interface AuthRepository {

    suspend fun login(
        email: String,
        password: String,
    ): SimpleResource

    suspend fun register(
        email: String,
        username: String,
        password: String,
    ): SimpleResource

    suspend fun authenticate(): SimpleResource
}