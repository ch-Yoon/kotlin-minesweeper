package view

import domain.cell.Cell

class MineSweeperResultView {

    fun displayStartMineSweeperGameMessage() {
        println("\n지뢰 찾기 게임 시작")
    }

    fun display(cells: List<List<Cell>>) {
        println("${cells.makeMapText()}\n")
    }

    fun displayLoseGameMessage() {
        println("Lose Game.")
    }

    fun displayWinGameMessage() {
        println("Win Game.")
    }

    private fun List<List<Cell>>.makeMapText(): String {
        return joinToString("\n") { row -> row.makeRowText() }
    }

    private fun List<Cell>.makeRowText(): String {
        return joinToString(" ") { cell -> cell.makeDisplayText() }
    }

    private fun Cell.makeDisplayText(): String {
        if (isHide()) {
            return "C"
        }
        return when (this) {
            is Cell.Mine -> "*"
            is Cell.Ground -> aroundMineCount.value.toString()
        }
    }
}
