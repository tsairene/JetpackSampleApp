package rene.playground.jetpack

import android.util.Log
import androidx.work.WorkManager

class ExampleLogger(private val workManager: WorkManager) {
    init {
        Log.i(TAG, "init")
    }

    private companion object {
        const val TAG = "ExampleLogger"
    }
}
