package domain.cell

sealed class Cell {

    abstract val openState: OpenState

    abstract fun open(): Cell

    data class Mine(
        override val openState: OpenState,
    ) : Cell() {

        override fun open(): Cell {
            return copy(openState = OpenState.OPEN)
        }
    }

    data class Ground(
        override val openState: OpenState,
        val aroundMineCount: AroundMineCount,
    ) : Cell() {

        override fun open(): Cell {
            return copy(openState = OpenState.OPEN)
        }
    }

    companion object {

        fun hideMine(): Cell {
            return Mine(
                openState = OpenState.HIDE,
            )
        }

        fun hideGround(
            aroundMineCount: AroundMineCount,
        ): Cell {
            return Ground(
                openState = OpenState.HIDE,
                aroundMineCount = aroundMineCount,
            )
        }
    }
}
