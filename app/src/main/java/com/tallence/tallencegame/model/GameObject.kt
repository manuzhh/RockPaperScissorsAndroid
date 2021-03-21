package com.tallence.tallencegame.model

import kotlin.random.Random

enum class GameObject {
    ROCK,
    PAPER,
    SCISSORS;
    companion object {
        private fun determineWinnerObject(obj1: GameObject, obj2: GameObject): GameObject {
            val objects = setOf(obj1, obj2)
            return if (objects.contains(ROCK) && objects.contains(PAPER)) PAPER
            else if (objects.contains(ROCK) && objects.contains(SCISSORS)) ROCK
            else if (objects.contains(PAPER) && objects.contains(SCISSORS)) SCISSORS
            else obj1
        }
        fun play(playerObj: GameObject, oppObj: GameObject): GameResult {
            val winnerObj = determineWinnerObject(playerObj, oppObj)
            return if (playerObj == winnerObj && oppObj != winnerObj) GameResult.WIN
            else if (playerObj != winnerObj && oppObj == winnerObj) GameResult.LOSS
            else GameResult.DRAW
        }
        fun generateRandom(): GameObject {
            return when (Random.nextInt(1, 3)) {
                1 -> ROCK
                2 -> PAPER
                else -> SCISSORS
            }
        }
    }
}