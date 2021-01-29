package rene.playground.jetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.startup.AppInitializer
import rene.playground.jetpack.initializer.ExampleLoggerInitializer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // automatic initialization is disabled
        // use AppInitializer to manually initialize ExampleLoggerInitializer
        AppInitializer.getInstance(this)
            .initializeComponent(ExampleLoggerInitializer::class.java)
    }
}
