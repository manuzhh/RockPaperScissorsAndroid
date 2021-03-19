package com.tallence.tallencegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rock.setOnClickListener {
            if (Random.nextInt(1, 3) == 1) result_text.text = "Computer chose rock. It's a draw."
            if (Random.nextInt(1, 3) == 2) result_text.text = "Computer chose paper. You lose!"
            if (Random.nextInt(1, 3) == 3) result_text.text = "Computer chose scissors. You win!"
        }
        paper.setOnClickListener {
            if (Random.nextInt(1, 3) == 1) result_text.text = "Computer chose rock. You win!"
            if (Random.nextInt(1, 3) == 2) result_text.text = "Computer chose paper. It's a draw."
            if (Random.nextInt(1, 3) == 3) result_text.text = "Computer chose scissors. You lose!"
        }
        scissors.setOnClickListener {
            if (Random.nextInt(1, 3) == 1) result_text.text = "Computer chose rock. You lose."
            if (Random.nextInt(1, 3) == 2) result_text.text = "Computer chose paper. You win!"
            if (Random.nextInt(1, 3) == 3) result_text.text = "Computer chose scissors. It's a draw."
        }
    }
}