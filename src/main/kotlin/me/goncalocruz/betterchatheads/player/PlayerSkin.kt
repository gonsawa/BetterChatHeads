package me.goncalocruz.betterchatheads.player

import me.goncalocruz.betterchatheads.util.DefaultSkin
import java.net.URL
import javax.imageio.ImageIO

object PlayerSkin {
    fun getSkinMatrix(uuid: String): Array<Array<Int>> {
        MojangPlayer.getSkinURL(uuid)?.let { return getSkinMatrixFromURL(it) }
            ?: run { return DefaultSkin.getFromUUID(uuid).matrix }
    }

    private fun getSkinMatrixFromURL(urlPath: String): Array<Array<Int>> {
        val url = URL(urlPath)
        val connection = url.openConnection()
        connection.setRequestProperty("User-Agent", "Mozilla/5.0")
        connection.connect()
        val input = connection.getInputStream()
        val image = ImageIO.read(input)
        var matrix = Array(8) { Array(8) { 0x000000 } }
        for (i in 8 until 16) {
            for (j in 8 until 16) {
                matrix[j-8][i-8] = image.getRGB(i,j)
            }
        }
        input.close()
        return matrix
    }
}