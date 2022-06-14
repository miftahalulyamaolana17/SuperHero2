package com.example.superheroku

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class SuperHerokuAdapter (private val context: Context, private val superheroku : List<SuperHeroku>, val listener: (SuperHeroku) -> Unit)
    : RecyclerView.Adapter<SuperHerokuAdapter.SuperHerokuViewHolder>(){

    class SuperHerokuViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgSuperhro = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameSuperhero = view.findViewById<TextView>(R.id.tv_item_name)
        val descSuperhero = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(superheroku: SuperHeroku, listener: (SuperHeroku) -> Unit){
            imgSuperhro.setImageResource(superheroku.imgSuperhro)
            nameSuperhero.text = superheroku.nameSuperhero
            descSuperhero.text = superheroku.descSuperhero
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHerokuViewHolder {
        return SuperHerokuViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_superheroku, parent, false)
        )
    }

    override fun onBindViewHolder(holder: SuperHerokuViewHolder, position: Int) {
        holder.bindView(superheroku[position], listener)
    }

    override fun getItemCount(): Int = superheroku.size
    }
