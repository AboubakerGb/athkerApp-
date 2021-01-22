package com.aboubakergb.AdkareElmoslim

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.costume_toaste.*
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment(R.layout.fragment_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast(this.activity).apply {
            duration=Toast.LENGTH_SHORT
            view=layoutInflater.inflate(R.layout.costume_toaste,toast)
            show()
        }
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






}
