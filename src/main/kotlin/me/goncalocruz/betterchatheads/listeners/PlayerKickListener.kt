package me.goncalocruz.betterchatheads.listeners

import me.goncalocruz.betterchatheads.player.MojangPlayer
import me.goncalocruz.betterchatheads.player.PlayerCache
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerKickEvent

class PlayerKickListener: Listener {
    @EventHandler
    fun onPlayerLeave(event: PlayerKickEvent) {
        PlayerCache.remove(MojangPlayer.trimUUID(event.player.uniqueId.toString()))
    }
}