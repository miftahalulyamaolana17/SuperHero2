package com.example.superheroku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superherokuList = listOf<SuperHeroku>(
            SuperHeroku(
                R.drawable.superman,
                nameSuperhero = "Superman",
                descSuperhero = "Clark Joseph Kent, best known by his superhero persona Superman, is a fictional character and a superhero in the DC Extended Universe series of films, based on the character of the same name created by Jerry Siegel and Joe Shuster"
            ),
            SuperHeroku(
            R.drawable.spiderman,
            nameSuperhero = "Spiderman",
            descSuperhero = "Spider-Man is a superhero appearing in American comic books published by Marvel Comics"
        ),
            SuperHeroku(
                R.drawable.ironman,
                nameSuperhero = "Iron Man",
                descSuperhero = "Iron Man is a superhero appearing in American comic books published by Marvel Comics. The character was co-created by writer and editor Stan Lee, developed by scripter Larry Lieber, and designed by artists Don Heck and Jack Kirby"
        ),
            SuperHeroku(
                R.drawable.flash,
                nameSuperhero = "The Flash",
                descSuperhero = "The Flash (Bartholomew Henry \"Barry\" Allen) is a superhero appearing in a series of American comic books published by DC Comics. The character first appeared in Showcase #4 (October 1956), created by writer Robert Kanigher and penciler Carmine Infantino.[1] Barry Allen is a reinvention of the original Flash, Jay Garrick."
            ),
            SuperHeroku(
                R.drawable.aquaman,
                nameSuperhero = "Aquaman",
                descSuperhero = "Aquaman is a 2018 American superhero film based on the DC Comics character of the same name. Produced by DC Entertainment and Peter Safran Productions, and distributed by Warner Bros. Pictures, it is the sixth film in the DC Extended Universe (DCEU)"
            ),
            SuperHeroku(
                R.drawable.thor,
                nameSuperhero = "The Thor",
                descSuperhero = "In Norse Mythology, Thor (Old Norwegian: órr; Old English: unor) is a \"red-haired beard\" who is known as the God of Thunder. Thor is the son of God Odin and the giant Jord"
            ),
            SuperHeroku(
                R.drawable.blackpanther,
                nameSuperhero = "Black Panther",
                descSuperhero = "Black Panther (T'Challa) is a fictional superhero appearing in American comic books published by Marvel Comics. Created by writer editor Stan Lee and penciller and co-plotter Jack Kirby, he first appeared in Fantastic Four #52 (July 1966)."
            ),
            SuperHeroku(
                R.drawable.wonderwoman,
                nameSuperhero = "Wonder Women",
                descSuperhero = "This character is a warrior princess of the Amazons (based on the tribe of Amazonian warrior women from Greek Mythology) and is known in her homeland, Themyscira, as Princess Diana of Themyscira. When he is outside his homeland, he sometimes uses a pseudonym as Diana Prince."
            ),
            SuperHeroku(
                R.drawable.captainamerica,
                nameSuperhero = "Captain Amerika",
                descSuperhero = "Captain America is a fictional superhero from Marvel Comics. Having a big enemy named Salwi Ackerman and Baron Zemo, Rogers is a US soldier who has no ability at all. Thanks to the help of Dr. Joshef Reinstein with his super soldier serum"
            ),
            SuperHeroku(
                R.drawable.antman,
                nameSuperhero = "Ant-Man",
                descSuperhero = "Ant-Man (Indonesian: Man Semut) is an American superhero film released on July 17, 2015. It is the twelfth film in the Marvel Cinematic Universe. The film stars Paul Rudd, Evangeline Lilly, Corey Stoll, Bobby Cannavale, Michael Peña, Judy Greer, Tip \"T.I."
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperHerokuAdapter(this,superherokuList){

        }

    }

}