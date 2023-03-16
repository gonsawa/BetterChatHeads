package me.goncalocruz.betterchatheads

import me.goncalocruz.betterchatheads.listeners.ChatListener
import me.goncalocruz.betterchatheads.listeners.PlayerJoinListener
import me.goncalocruz.betterchatheads.listeners.PlayerKickListener
import org.bukkit.plugin.java.JavaPlugin

class BCHPlugin : JavaPlugin(){
    override fun onEnable() {
        server.pluginManager.registerEvents(PlayerJoinListener(), this)
        server.pluginManager.registerEvents(PlayerKickListener(), this)
        server.pluginManager.registerEvents(ChatListener(), this)
    }
}