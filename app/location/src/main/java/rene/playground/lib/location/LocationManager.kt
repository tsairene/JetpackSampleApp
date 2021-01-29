package rene.playground.lib.location

import android.util.Log

class LocationManager {
    init {
        Log.i(TAG, "init")
    }

    fun initialize() {
        Log.i(TAG, "initialize")
    }

    fun getCurrentLocation() {
        Log.i(TAG, "getCurrentLocation")
    }

    private companion object {
        const val TAG: String = "LocationManager"
    }
}