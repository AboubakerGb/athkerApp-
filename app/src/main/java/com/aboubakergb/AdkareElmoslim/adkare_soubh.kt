package com.aboubakergb.AdkareElmoslim

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.card_view.*
import kotlinx.android.synthetic.main.fragment_adkare_soubh.*


class adkare_soubh : Fragment(R.layout.fragment_adkare_soubh) {




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter =RecycleViewAdapter()
        recycler_view.adapter=adapter
        recycler_view.layoutManager=LinearLayoutManager(activity)



    }

}

