package rene.playground.lib.map

import android.content.Context
import android.util.Log
import androidx.startup.Initializer

class MapManagerInitializer : Initializer<MapManager> {
    override fun create(context: Context): MapManager {
        Log.d(TAG, "create()")
        return rene.playground.lib.map.MapManager()
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        Log.d(TAG, "dependencies()")
        return emptyList()
    }

    private companion object {
        const val TAG = "MapManagerInitializer"
    }
}