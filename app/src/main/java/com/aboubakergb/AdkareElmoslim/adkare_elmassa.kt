package com.aboubakergb.AdkareElmoslim

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_adkare_elmassa.*
import kotlinx.android.synthetic.main.fragment_adkare_soubh.*


class adkare_elmassa : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter =RecycleAdkareElmassaAdapter()
        recycler_adkare_elmasaa.adapter=adapter
        recycler_adkare_elmasaa.layoutManager= LinearLayoutManager(this.activity)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_adkare_elmassa, container, false)
    }
}
