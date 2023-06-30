package minesweeper.ui

import minesweeper.domain.MineBoard
import minesweeper.domain.Row

private const val BOARD_DELIMITER = " "

object MineSweeperOutputImpl : MineSweeperOutput() {
    override fun printMineBoard(mineBoard: MineBoard) {
        buildString {
            mineBoard.rows.forEach {
                append("${convertToString(it)}\n")
            }
        }.run(::println)
    }

    private fun convertToString(row: Row): String =
        row.joinToString(separator = BOARD_DELIMITER) { convertToSymbol(it) }

    override fun printStartGame() {
        println("지뢰찾기 게임 시작")
    }

    override fun printWin() {
        println("Win Game.")
    }

    override fun printLose() {
        println("Lose Game.")
    }

    override fun printException(message: String?) {
        message?.run(::println)
    }
}