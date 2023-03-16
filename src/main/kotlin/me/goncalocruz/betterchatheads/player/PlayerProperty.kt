package me.goncalocruz.betterchatheads.player

import kotlinx.serialization.Serializable

@Serializable
data class PlayerProperty(
    val timestamp: Long,
    val profileId: String,
    val profileName: String,
    val textures: Textures
) {
    @Serializable
    data class Textures(
        val SKIN: Texture? = null,
        val CAPE: Texture? = null
    ) {
        @Serializable
        data class Texture(
            val url: String,
            val metadata: Metadata? = null
        ) {
            @Serializable
            data class Metadata(
                val model: String
            )
        }
        fun getSkinUrl(): String? {
            return SKIN?.url
        }
    }
}

