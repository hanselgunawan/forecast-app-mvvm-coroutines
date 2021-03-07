# Forecast App with MVVM + Coroutines

## Dependencies
```
ext.kotlin_version = "1.4.21"
ext.room_version = "2.2.6"
ext.navigation_version = "2.3.3"

// Kodein (for KOtlin DEpendency INjection) is a DI framework. 
// It allows you to bind your business unit interfaces with their implementation 
// and thus having each business unit being independent.
ext.kodein_version = "6.5.5"
ext.lifecycle_version = "2.3.0"
ext.retrofit_version = "2.9.0"
```

```
// Navigation
implementation "androidx.navigation:navigation-fragment-ktx:$navigation_version"
implementation "androidx.navigation:navigation-ui-ktx:$navigation_version"

// Room
implementation "androidx.room:room-runtime:$room_version"
kapt "androidx.room:room-compiler:$room_version"

// Gson
implementation 'com.google.code.gson:gson:2.8.6'

// Kotlin Android Coroutines
implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9'

// Retrofit
implementation "com.squareup.retrofit2:retrofit:$retrofit_version"

// ViewModel
implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
kapt "androidx.lifecycle:lifecycle-compiler:$lifecycle_version"

// Kodein
implementation "org.kodein.di:kodein-di-generic-jvm:$kodein_version"
implementation "org.kodein.di:kodein-di-framework-android:$kodein_version"

// DateTime support for older Android versions
// Java8 Time Library, such as: Joda Time
// This is used to support older Android that doesn't have Java8
implementation 'com.jakewharton.threetenabp:threetenabp:1.3.0'

// Glide
implementation 'com.github.bumptech.glide:glide:4.12.0'
annotationProcessor 'com.github.bumptech.glide:compiler:4.12.0'

// Groupie RecyclerView
// Simple RecyclerView Library to do complex things in a few lines of code
implementation "com.xwray:groupie:$groupie_version"
implementation "com.xwray:groupie-viewbinding:$groupie_version"

// Preference
// Build interactive settings screens without needing to interact with device storage or manage the UI.
implementation 'androidx.preference:preference-ktx:1.1.1'

// Location
implementation 'com.google.android.gms:play-services-location:18.0.0'
    
// New Material Design
implementation 'com.google.android.material:material:1.3.0'
```
