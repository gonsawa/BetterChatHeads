package me.goncalocruz.betterchatheads.player

import com.github.kittinunf.fuel.httpGet
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import java.util.Base64


object MojangPlayer {
    fun getBasicPlayerProfile(username: String): BasicPlayerProfile? {
        var playerProfile: BasicPlayerProfile? = null
        val httpAsync = "https://api.mojang.com/users/profiles/minecraft/".plus(username)
            .httpGet()
            .responseString { _, response, result ->
                if (response.statusCode == 200) {
                    playerProfile = Json.decodeFromString<BasicPlayerProfile>(result.get())
                }
            }
        httpAsync.join()
        return playerProfile
    }

    fun getPlayerProfile(uuid: String): PlayerProfile? {
        var playerProfile: PlayerProfile? = null
        val httpAsync = "https://sessionserver.mojang.com/session/minecraft/profile/".plus(uuid)
            .httpGet()
            .responseString { _, response, result ->
                if (response.statusCode == 200) {
                    playerProfile = Json.decodeFromString<PlayerProfile>(result.get())
                }
            }
        httpAsync.join()
        return playerProfile
    }

    fun getSkinURL(uuid: String): String? {
        val playerProfile = getPlayerProfile(uuid)
        return if (playerProfile != null) {
            val decodedValue = String(Base64.getDecoder().decode(playerProfile.properties[0].value))
            val property = Json.decodeFromString<PlayerProperty>(decodedValue)
            property.textures.getSkinUrl()
        } else {
            null
        }
    }

    fun trimUUID(uuid: String): String {
        return uuid.replace("-", "")
    }

    fun unTrimUUID(uuid: String): String {
        return uuid.substring(0, 8) + "-" + uuid.substring(8, 12) + "-" + uuid.substring(12, 16) + "-" + uuid.substring(16, 20) + "-" + uuid.substring(20, 32)
    }
}

fun main() {
    val playerProfile = MojangPlayer.getBasicPlayerProfile("gonsawa_")!!
    println(MojangPlayer.getSkinURL(playerProfile.id))
}
