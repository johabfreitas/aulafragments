package br.com.johabfreitas.aulafragment

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.com.johabfreitas.aulafragment.databinding.ActivityMainBinding
import br.com.johabfreitas.aulafragment.fragments.ChamadasFragment
import br.com.johabfreitas.aulafragment.fragments.ConversasFragment

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        /*//Inicia a criação do fragment
        val fragmentManager = supportFragmentManager.beginTransaction()

        //Diversas alterações em fragments
        fragmentManager.add(R.id.fragment_conteudo, ConversasFragment())
        fragmentManager.commit()*/

        //val conversasFragment = ConversasFragment()
        binding.btnConversas.setOnClickListener {
             supportFragmentManager
                 .beginTransaction()
                 .replace(R.id.fragment_conteudo, ConversasFragment()) // o método add adiciona o fragment e o replace substitui caso exista um fragment
                 .commit()
        }

        binding.btnChamadas.setOnClickListener{
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_conteudo, ChamadasFragment())
                //.remove(conversasFragment)
                .commit()
        }


    }
}