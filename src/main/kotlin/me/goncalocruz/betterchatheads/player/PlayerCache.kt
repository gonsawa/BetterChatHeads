package me.goncalocruz.betterchatheads.player

import me.goncalocruz.betterchatheads.util.DefaultSkin

object PlayerCache {
    private val cache = mutableMapOf<String, Array<Array<Int>>>()

    fun getSkinMatrix(uuid: String): Array<Array<Int>> {
        if (!cache.containsKey(uuid)) {
            save(uuid)
        }
        return cache[uuid] ?: DefaultSkin.getFromUUID(uuid).matrix
    }

    fun save(uuid: String) {
        cache[uuid] = PlayerSkin.getSkinMatrix(uuid)
    }

    fun remove(uuid: String) {
        cache.remove(uuid)
    }
}