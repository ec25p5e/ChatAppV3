package com.ec25p5e.chatapp.core.util

sealed class Screen(val route: String) {

    object SplashScreen: Screen("splash_screen")
}