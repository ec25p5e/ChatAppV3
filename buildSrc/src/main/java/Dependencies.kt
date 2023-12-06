object Version {
    const val compileSdk = 33
    const val minSdk = 29
    const val versionCode = 1
}

object Deps {
    private const val coreVersion = "1.9.0"
    private const val lifecycleVersion = "2.6.2"

    const val core = "androidx.core:core-ktx:${coreVersion}"
    const val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:${lifecycleVersion}"

}

object App {
    const val coreModule = "com.ec25p5e.chatapp.core"
}