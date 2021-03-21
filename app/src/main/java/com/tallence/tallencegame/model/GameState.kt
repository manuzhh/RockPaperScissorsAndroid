package com.tallence.tallencegame.model

class GameState() {
    companion object {
        var wins = 0
        var losses = 0
        var draws = 0
        fun updateScore (gameResult: GameResult) {
            when (gameResult) {
                GameResult.WIN -> wins++
                GameResult.LOSS -> losses++
                else -> draws++
            }
        }
    }
}
