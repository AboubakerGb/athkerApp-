package com.aboubakergb.AdkareElmoslim

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        btn_adkare_soubh.setOnClickListener {
        view.findNavController().navigate(R.id.action_mainFragment_to_adkare_soubh)
        }
        btn_adkare_masaa.setOnClickListener {
            view.findNavController().navigate(R.id.action_mainFragment_to_adkare_elmassa)
        }
        btn_adkare_istigade.setOnClickListener {
            view.findNavController().navigate(R.id.action_mainFragment_to_adkare_isitgade)
        }
        btn_adkare_noum.setOnClickListener {
            view.findNavController().navigate(R.id.action_mainFragment_to_adkare_Noume)
        }
        btn_adkare_safare.setOnClickListener {
            view.findNavController().navigate(R.id.action_mainFragment_to_adkare_safare)
        }
        btn_adkare_salate.setOnClickListener {
            view.findNavController().navigate(R.id.action_mainFragment_to_adkare_salate)
        }
        btn_misbaha.setOnClickListener {
            view.findNavController().navigate(R.id.action_mainFragment_to_tasbih)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)

    }

}
