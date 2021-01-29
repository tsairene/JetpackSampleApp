package rene.playground.jetpack.initializer

import android.content.Context
import android.util.Log
import androidx.startup.Initializer
import androidx.work.Configuration
import androidx.work.WorkManager

// Initializes WorkManager.
class WorkManagerInitializer : Initializer<WorkManager> {
    override fun create(context: Context): WorkManager {
        Log.d(TAG, "create")
        val configuration = Configuration.Builder().build()
        WorkManager.initialize(context, configuration)
        return WorkManager.getInstance(context)
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        Log.d(TAG, "dependencies")
        // No dependencies on other libraries.
        return emptyList()
    }

    private companion object {
        const val TAG = "WorkManagerInitializer"
    }
}
