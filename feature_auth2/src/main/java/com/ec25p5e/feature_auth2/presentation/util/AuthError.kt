package com.ec25p5e.feature_auth2.presentation.util

sealed class AuthError: Error() {
    object FieldEmpty: AuthError()
    object InputTooShort: AuthError()
    object InvalidEmail: AuthError()
    object InvalidPassword: AuthError()
}