package fausto.app.com.navigationhellof



import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_fragment1.*
import kotlinx.android.synthetic.main.fragment_fragment1.view.*


class Fragment1 : Fragment() {

        override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_fragment1, container, false)
        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.saludarBtn.setOnClickListener {

            val nombre = nameEditText.text.toString()
            val action = Fragment1Directions.actionFragment1ToFragment2(nombre)
            it.findNavController().navigate(action)

            //it.findNavController().navigate(Fragment1Directions.actionFragment1ToFragment2(nombre))

        }

        view.irAActividadBtn.setOnClickListener {
            it.findNavController().navigate(Fragment1Directions.actionFragment1ToMain2Activity())
        }
    }


}