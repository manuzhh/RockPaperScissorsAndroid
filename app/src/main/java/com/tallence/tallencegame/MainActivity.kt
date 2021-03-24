package com.tallence.tallencegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tallence.tallencegame.model.GameObject
import com.tallence.tallencegame.model.GameState
import com.tallence.tallencegame.model.TextComposer
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rock.setOnClickListener {
            val oppObj = GameObject.generateRandom()
            val gameResult = GameObject.play(GameObject.ROCK, oppObj)
            GameState.updateScore(gameResult)
            result_text.text = TextComposer.composeResultText(oppObj, gameResult)
            score_text.text = TextComposer.composeScoreText()
        }
        paper.setOnClickListener {
            val oppObj = GameObject.generateRandom()
            val gameResult = GameObject.play(GameObject.PAPER, oppObj)
            GameState.updateScore(gameResult)
            result_text.text = TextComposer.composeResultText(oppObj, gameResult)
            score_text.text = TextComposer.composeScoreText()
        }
        scissors.setOnClickListener {
            val oppObj = GameObject.generateRandom()
            val gameResult = GameObject.play(GameObject.SCISSORS, oppObj)
            GameState.updateScore(gameResult)
            result_text.text = TextComposer.composeResultText(oppObj, gameResult)
            score_text.text = TextComposer.composeScoreText()
        }
    }
}