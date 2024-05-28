package br.com.johabfreitas.aulafragment

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.commit
import androidx.fragment.app.replace
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


        binding.btnMercado.setOnClickListener {

            /*val conversasFragment = ConversasFragment()

            val bundle = bundleOf(
                "categoria" to "mercado",
                "usuario" to "Johab"
            )*/

            //conversasFragment.arguments = bundle

             /*supportFragmentManager
                 .beginTransaction()
                 .replace(R.id.fragment_conteudo, conversasFragment) // o método add adiciona o fragment e o replace substitui caso exista um fragment
                 .commit()*/

            val bundle = bundleOf(
                "categoria" to "mercado",
                "usuario" to "Johab"
            )
            supportFragmentManager.commit {
                replace<ConversasFragment>(
                    R.id.fragment_conteudo, args = bundle
                )
            }

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