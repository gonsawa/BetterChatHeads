package me.goncalocruz.betterchatheads.util

import me.goncalocruz.betterchatheads.player.PlayerCache

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.JoinConfiguration
import net.kyori.adventure.text.format.TextColor
import org.bukkit.NamespacedKey


object SkinComponent {

    fun getSkinComponent(uuid: String): Component {
        val components = mutableListOf<Component>()
        val pixels = PlayerCache.getSkinMatrix(uuid)
        for (x in 0 until 8) {
            var pixel = when (x+1) {
                1 -> "\ue001"
                2 -> "\ue002"
                3 -> "\ue003"
                4 -> "\ue004"
                5 -> "\ue005"
                6 -> "\ue006"
                7 -> "\ue007"
                8 -> "\ue008"
                else -> "\ue001"
            }
            for (y in 0 until 8) {
                components.add(
                    Component.text(pixel)
                        .font(NamespacedKey("betterchatheads", "pixel"))
                        .color(TextColor.color(pixels[x][y]))
                )
                components.add(
                    Component.text("\ue001")
                        .font(NamespacedKey("betterchatheads", "negative_space"))
                        .color(TextColor.color(0xFFFFFF))
                )
            }
            if (x != 7) {
                components.add(
                    Component.text("\ue008")
                        .font(NamespacedKey("betterchatheads", "negative_space"))
                        .color(TextColor.color(pixels[x][0])))
            }
        }
        return Component.join(JoinConfiguration.noSeparators(), components)
    }
}