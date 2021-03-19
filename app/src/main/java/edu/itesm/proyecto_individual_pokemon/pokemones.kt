package edu.itesm.proyecto_individual_pokemon

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize

data class pokemones(val picture:Int,
                     val nombre:String,
                     val nivel:String,
                     val descripcion: String,
                     val tipo: String) : Parcelable

