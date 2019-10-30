package com.example.lecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random
import java.util.*

class MainActivity : AppCompatActivity() {

    val poke_list = arrayListOf("Pikachu", "Mewtwo", "Charizard")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        choose.setOnClickListener {

            val random = Random
            val randNum = random.nextInt(poke_list.count())

            selectedPokemon.text = poke_list[randNum]
        }

        add.setOnClickListener{
            val addPokemon = pokemon_to_add.text.toString()
            poke_list.add(addPokemon)
            pokemon_to_add.text.clear()

        }
    }
}
