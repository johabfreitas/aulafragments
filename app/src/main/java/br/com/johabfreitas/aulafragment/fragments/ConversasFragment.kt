package br.com.johabfreitas.aulafragment.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import br.com.johabfreitas.aulafragment.R

//class ConversasFragment : Fragment(R.layout.fragment_conversas){ //outra maneira de criar um fragment
class ConversasFragment : Fragment(){

    val TAG = "ciclo_vida"

    private lateinit var btnExecutar: Button
    private lateinit var editNome: EditText
    private lateinit var textNome: TextView

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i(TAG, "onAttach: Fragment")
    }

    //Antes de criar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "onCreate: Fragment")
    }

    // Criar um fragment do zero, herdar da classe Fragment passando um construtor e
    // sobrescrever o método onCreateView, em seguida criar um layout xml de fragment.
    // Cria a visualização
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i(TAG, "onCreateView: Fragment")
        val view = inflater.inflate(
            R.layout.fragment_conversas,
            container,
            false //anexar ao elemento raiz(fragmentContainerView)
        )
        /*
        Aqui no fragment você deve construir e retornar essa visualização, conforme foi passado em "val view"
        * */
        // Processamento da visualização
        btnExecutar = view.findViewById(R.id.btnExecutar)
        editNome = view.findViewById(R.id.editNome)
        textNome = view.findViewById(R.id.textNome)

        val nome = editNome.text.toString()
        btnExecutar.setOnClickListener {
            textNome.text = nome
        }

        return view
    }

    //Após a view ser criada
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i(TAG, "onViewCreated: Fragment")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart: Fragment")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume: Fragment")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause: Fragment")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop: Fragment")
    }

    // Etapas de destruição
    override fun onDestroyView() {
        Log.i(TAG, "onDestroyView: Fragment")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.i(TAG, "onDestroy: Fragment")
        super.onDestroy()
    }

    override fun onDetach() {
        super.onDetach()
        Log.i(TAG, "onDetach: Fragment")
    }

    /*O método onViewStateRestored em Android é utilizado em fragments para restaurar o
    estado da interface do usuário (UI) após uma mudança de configuração,
    como uma rotação de tela, ou quando o fragmento foi interrompido e precisa ser recriado.
    Este método é chamado depois que a hierarquia da view do fragmento foi criada,
    mas antes de qualquer interação do usuário. Ele permite restaurar o estado da UI usando
    os dados que foram salvos anteriormente no savedInstanceState.*/

    /*override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
    }*/

}