package me.goncalocruz.betterchatheads.listeners

import io.papermc.paper.event.player.AsyncChatDecorateEvent
import me.goncalocruz.betterchatheads.player.MojangPlayer
import me.goncalocruz.betterchatheads.util.SkinComponent
import net.kyori.adventure.text.Component
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener

class ChatListener : Listener {
    @EventHandler
    fun onChat(event: AsyncChatDecorateEvent) {
        event.player()?.let {
            val headComponent = SkinComponent.getSkinComponent(MojangPlayer.trimUUID(it.uniqueId.toString()))
            event.result(headComponent.append(Component.text(" ")).append(event.result()))
        }
    }
}