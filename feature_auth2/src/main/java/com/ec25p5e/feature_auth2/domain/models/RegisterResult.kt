package com.ec25p5e.feature_auth2.domain.models

import java.text.SimpleDateFormat

data class RegisterResult(
    val emailError: AuthErro? = null,
    val usernameError: AuthError? = null,
    val passwordError: AuthError? = null,
    val result: SimpleResource? = null
)