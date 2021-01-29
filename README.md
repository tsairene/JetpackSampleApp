# JetpackSampleApp
Sample App for Android Jetpack App Startup

## Jetpack - App Startup
- [Doc Guide](https://developer.android.com/topic/libraries/app-startup)
- [Release History](https://developer.android.com/jetpack/androidx/releases/startup)
    - offical release 1.0.0 on Oct. 2020

## Sample App
- Please note that example used in the official document `WorkManager` already has it's own initializer so you might get below error:
    ```
    java.lang.IllegalStateException: WorkManager is already initialized.
    Did you try to initialize it manually without disabling WorkManagerInitializer?
    See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.
    ```
    Just simply substitute provider to your own like below:
    ```xml
    <!-- disable default provider -->
    <provider
        android:name="androidx.work.impl.WorkManagerInitializer"
        android:authorities="${applicationId}.workmanager-init"
        android:enabled="false"
        android:exported="false" />
        
    <!-- register custom provider -->
    <provider
        android:name="custom.package.WorkManagerInitializer"
        android:authorities="${applicationId}.WorkManagerInit"/>
    ```
- Demonstrates initialization flow with log
    - tags: ExampleLogger|LoggerInitializer|MapManager|MapManagerInitializer|LocManagerInitializer|LocationManager
    ```
    D/LocManagerInitializer: dependencies()
    D/LocManagerInitializer: create()
    I/LocationManager: init
    I/LocationManager: initialize
    D/MapManagerInitializer: dependencies()
    D/MapManagerInitializer: create()
    I/MapManager: init
    D/LoggerInitializer: dependencies
    D/LoggerInitializer: create
    I/ExampleLogger: init
    ```


