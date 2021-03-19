package edu.itesm.proyecto_individual_pokemon

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_pokedex.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [pokedex.newInstance] factory method to
 * create an instance of this fragment.
 */
class pokedex : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pokedex, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        pokedex_recycler.apply {

            layoutManager = LinearLayoutManager(activity)
            adapter = pokemonadaptador(createData())
        }

    }
    fun createData():ArrayList<pokemones> {
        val pokemon2 = ArrayList<pokemones>()
        pokemon2.add(pokemones(R.drawable.blastoise, "Blastoise", "80", "Blastoise, the Shellfish Pokémon. Blastoise is the final evolved form of Squirtle. It can launch powerful blasts of water from its water spouts.","Tipo Agua"))
        pokemon2.add(pokemones(R.drawable.bleziken, "Blaziken", "90", "Blaziken, the Blaze Pokémon and the evolved form of Combusken. Flames surround to come out of its wrists, making its punches extremely damaging and dangerous.","Tipo Fuego y Luchador"))
        pokemon2.add(pokemones(R.drawable.chandelure, "Chandelure", "85", "Chandelure, the Luring Pokémon and the evolved form of Lampent. Chandelure uses its dancing flames to hypnotize opponents.", "Tipo Fantasma y Fuego"))
        pokemon2.add(pokemones(R.drawable.drapion, "Drapion", "76", "Drapion, the Ogre Scorp Pokémon. Its claws give off a deadly poison and they are powerful enough to turn an automobile into scrap iron.", "Tipo Veneno y oscuridad"))
        pokemon2.add(pokemones(R.drawable.empoleon, "Empoleon", "75", "Empoleon, the Emperor Pokémon. A Water and Steel type. Empoleon can swim as fast as a jet boat. The edges of its wings are sharp and can slice through an iceberg with ease..", "Tipo Agua y Acero"))
        pokemon2.add(pokemones(R.drawable.gardevoir, "Gardevoir", "90", "Gardevoir, the Embrace Pokémon. If Gardevoir's Trainer needs protecting, Gardevoir creates a small black hole by using all of its psychic power.","Tipo psiquico y hada"))
        pokemon2.add(pokemones(R.drawable.haxorus, "Haxorus", "85", "Haxorus, the Axe Jaw Pokémon and Axew's final evolved form. Haxorus is normally considered friendly. Its body is covered with a tough armor, and its tusks cannot be broken.","Tipo Dragon"))
        pokemon2.add(pokemones(R.drawable.jolteon, "Jolteon", "77", "Jolteon, the Lightning Pokémon. When angered or frightened, the hairs on Jolteon's body become like needles that are fired at its opponents. It absorbs charged atoms and can produce 10,000 volts of electricity.","Tipo electrico"))
        pokemon2.add(pokemones(R.drawable.metagross, "Metagross", "86", "Metagross, the Iron Leg Pokémon and the evolved form of Metang. Metagross has four legs and uses many powerful moves.","Tipo Metal y Psiquico"))
        pokemon2.add(pokemones(R.drawable.mienshao, "Mienshao", "90", "Mienshao, the Martial Arts Pokémon. A Fighting type. Mienshao uses the fur on its arms like whips. When it starts a series of attacks, nothing can stop it.", "Tipo Luchador"))
        pokemon2.add(pokemones(R.drawable.octillery, "Octillery", "82", "Octillery, the Jet Pokémon. Octillery attaches its tentacled feet to its opponent, before attacking with its hard head.", "Tipo Augua"))
        pokemon2.add(pokemones(R.drawable.salamense, "Salamense", "76", "Salamence, the Dragon Pokémon. As a result of a powerful desire to fly, Salamence were able to trigger the cells in their body and cause them to grow wings.","Tipo Dragon y Volador"))
        pokemon2.add(pokemones(R.drawable.silvally, "Silvally", "79", "A solid bond of trust between this Pokémon and its Trainer awakened the strength hidden within Silvally. It can change its type at will.", "Tipo Normal"))
        pokemon2.add(pokemones(R.drawable.torchic, "Torchic", "9", "Torchic sticks with its Trainer, following behind with unsteady steps. This Pokémon breathes fire of over 1,800 degrees Fahrenheit, including fireballs that leave the foe scorched black.", "Tipo Fuego"))
        pokemon2.add(pokemones(R.drawable.zoroark, "Zoroark", "74", "If it thinks humans are going to discover its den, Zoroark shows them visions that make them wander around in the woods.","Tipo Oscuridad"))
        return pokemon2
    }
}