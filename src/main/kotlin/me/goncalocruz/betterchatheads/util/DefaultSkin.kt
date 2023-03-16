package me.goncalocruz.betterchatheads.util

import me.goncalocruz.betterchatheads.player.MojangPlayer
import java.lang.Math.floorMod
import java.util.UUID

enum class DefaultSkin(val matrix: Array<Array<Int>>) {
    ALEX (arrayOf(
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012),
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012),
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012),
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012),
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012)
    )),
    ARI (arrayOf(
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012),
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012),
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012),
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012),
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012)
    )),
    EFE (arrayOf(
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012),
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012),
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012),
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012),
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012)
    )),
    KAI (arrayOf(
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012),
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012),
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012),
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012),
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012)
    )),
    MAKENA (arrayOf(
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012),
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012),
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012),
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012),
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012)
    )),
    NOOR (arrayOf(
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012),
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012),
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012),
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012),
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012)
    )),
    SUNNY (arrayOf(
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012),
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012),
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012),
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012),
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012)
    )),
    STEVE (arrayOf(
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012),
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012),
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012),
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012),
        arrayOf(0x803012, 0x9d4522, 0x933f1e, 0x933f1e, 0xe57f61, 0x873718, 0x933f1e, 0x873718),
        arrayOf(0x873718, 0x933f1e, 0xe57f61, 0xf1936e, 0xf1936e, 0xe57f61, 0x933f1e, 0x803012)
    ));

    companion object {
        fun getFromUUID(uuid: UUID): DefaultSkin {
            return DefaultSkin.values()[floorMod(uuid.hashCode(), DefaultSkin.values().size)]
        }
        fun getFromUUID(uuid: String): DefaultSkin {
            return getFromUUID(UUID.fromString(MojangPlayer.unTrimUUID(uuid)))
        }
    }
}