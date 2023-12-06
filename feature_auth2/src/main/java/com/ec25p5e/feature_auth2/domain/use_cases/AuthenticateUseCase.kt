package com.ec25p5e.feature_auth2.domain.use_cases

import com.ec25p5e.feature_auth2.domain.repository.AuthRepository

class AuthenticateUseCase(
    private val repository: AuthRepository,
) {

    suspend operator fun invoke(): SimpleResource {
        return repository.authenticate()
    }
}