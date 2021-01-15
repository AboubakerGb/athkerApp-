package com.aboubakergb.AdkareElmoslim

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_adkare__noume.*
import kotlinx.android.synthetic.main.fragment_adkare_elmassa.*


class Adkare_Noume : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter =RecycleAdkareNoumeAdapter()
        recycler_adkare_noume.adapter=adapter
        recycler_adkare_noume.layoutManager= LinearLayoutManager(this.activity)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_adkare__noume, container, false)
    }
}