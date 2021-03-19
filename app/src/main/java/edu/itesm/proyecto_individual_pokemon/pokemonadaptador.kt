package edu.itesm.proyecto_individual_pokemon

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView


class pokemonadaptador(private val pokemon: List<pokemones>)
    :RecyclerView.Adapter<pokemonadaptador.pokemonViewHolder>(){

    inner class pokemonViewHolder(renglon: View) : RecyclerView.ViewHolder(renglon){
        var nombre = renglon.findViewById<TextView>(R.id.titulo)
        var nivel = renglon.findViewById<TextView>(R.id.anio)
        var descripcion = renglon.findViewById<TextView>(R.id.plot)
        var foto = renglon.findViewById<ImageView>(R.id.foto)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): pokemonViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val renglon_vista = inflater.inflate(R.layout.fragment_pokemon,parent, false)
        return pokemonViewHolder(renglon_vista)
    }
    override fun onBindViewHolder(holder: pokemonViewHolder, position: Int) {
        val poke= pokemon[position]
        holder.foto.setImageResource(poke.picture)
        holder.nombre.text = poke.nombre
        holder.nivel.text = poke.nivel
        holder.descripcion.text = poke.descripcion
        holder.itemView.setOnClickListener{

            val action = pokedexDirections.actionPokedexToPokemon2(poke)
            holder.itemView.findNavController().navigate(action)


        }

    }
    override fun getItemCount(): Int {
        return pokemon.size
    }
}