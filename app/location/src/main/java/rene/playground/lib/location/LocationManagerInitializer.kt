package rene.playground.lib.location

import android.content.Context
import android.util.Log
import androidx.startup.Initializer

class LocationManagerInitializer : Initializer<LocationManager> {
    override fun create(context: Context): LocationManager {
        Log.d(TAG, "create()")
        return LocationManager().apply { initialize() }
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        Log.d(TAG, "dependencies()")
        return emptyList()
    }

    private companion object {
        const val TAG = "LocManagerInitializer"
    }
}
