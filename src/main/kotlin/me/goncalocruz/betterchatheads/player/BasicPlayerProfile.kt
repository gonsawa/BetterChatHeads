package me.goncalocruz.betterchatheads.player

import kotlinx.serialization.Serializable

@Serializable
data class BasicPlayerProfile(
    val id: String,
    val name: String
)