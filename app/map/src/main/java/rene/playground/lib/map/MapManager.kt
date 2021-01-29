package rene.playground.lib.map

import android.util.Log

class MapManager {
    private var isInitialized = false

    init {
        Log.i(TAG, "init")
    }

    fun initialize() {
        Log.i(TAG, "initialize")
        isInitialized = true
    }

    fun show(location: String) {
        if (!isInitialized) {
            throw UninitializedPropertyAccessException()
        }
        Log.i(TAG, "show: $location")
    }

    private companion object {
        const val TAG = "MapManager"
    }
}
