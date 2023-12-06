package com.ec25p5e.chatapp.core.util

typealias SimpleResource = Resource<Unit>

sealed class Resource<T>(val data: T? = null, val uiText: UiText? = null) {
    class Success<T>(data: T?): Resource<T>(data)
    class Error<T>(uiText: UiText?, data: T? = null): Resource<T>(data, uiText)
    class Loading<T>(val isLoading: Boolean = true): Resource<T>(null)
}