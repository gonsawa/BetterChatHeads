package me.goncalocruz.betterchatheads.listeners

import me.goncalocruz.betterchatheads.player.MojangPlayer
import me.goncalocruz.betterchatheads.player.PlayerCache
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

class PlayerJoinListener: Listener {
    @EventHandler
    fun onPlayerJoin(event: PlayerJoinEvent) {
        PlayerCache.save(MojangPlayer.trimUUID(event.player.uniqueId.toString()))
    }
}