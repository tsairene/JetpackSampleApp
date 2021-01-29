package rene.playground.jetpack.initializer

import android.content.Context
import android.util.Log
import androidx.startup.Initializer
import androidx.work.WorkManager
import rene.playground.jetpack.ExampleLogger

// Initializes ExampleLogger.
class ExampleLoggerInitializer : Initializer<ExampleLogger> {
    override fun create(context: Context): ExampleLogger {
        Log.d(TAG, "create")
        // WorkManager.getInstance() is non-null only after
        // WorkManager is initialized.
        return ExampleLogger(WorkManager.getInstance(context))
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        Log.d(TAG, "dependencies")
        // Defines a dependency on WorkManagerInitializer so it can be
        // initialized after WorkManager is initialized.
        return listOf(WorkManagerInitializer::class.java)
    }

    private companion object {
        const val TAG = "LoggerInitializer"
    }
}
