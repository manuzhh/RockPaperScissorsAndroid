package com.tallence.tallencegame.view

import com.tallence.tallencegame.model.GameObject
import com.tallence.tallencegame.model.GameResult
import com.tallence.tallencegame.model.GameState

class TextComposer {
    companion object {
        fun composeResultText (oppObj: GameObject, gameResult: GameResult): String {
            val oppObjStr = if (oppObj == GameObject.ROCK) "Rock" else if (oppObj == GameObject.PAPER) "Paper" else "Scissors"
            val gameResultStr = if (gameResult == GameResult.WIN) "You won!" else if (gameResult == GameResult.LOSS) "You lost!" else "Game is a Draw."
            return "Computer chose $oppObjStr. $gameResultStr"
        }
        fun composeScoreText (): String {
            val wins = GameState.wins.toString()
            val losses = GameState.losses.toString()
            val draws = GameState.draws.toString()
            return "Player:$wins Computer:$losses Draws:$draws"
        }
    }
}