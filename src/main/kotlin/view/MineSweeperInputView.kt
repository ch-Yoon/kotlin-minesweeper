package view

import domain.MineSweeperInitProperty
import domain.math.PositiveNumber

class MineSweeperInputView {

    fun readInitProperty(): MineSweeperInitProperty {
        println("높이를 입력하세요.")
        val height = PositiveNumber(readln().toInt())

        println("\n너비를 입력하세요.")
        val width = PositiveNumber(readln().toInt())

        println("\n지뢰는 몇 개인가요?")
        val mineCount = PositiveNumber(readln().toInt())

        return MineSweeperInitProperty(
            height = height,
            width = width,
            mineCount = mineCount,
        )
    }
}
