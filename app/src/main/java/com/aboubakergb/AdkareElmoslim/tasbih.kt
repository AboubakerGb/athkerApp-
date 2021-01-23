package com.aboubakergb.AdkareElmoslim

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_tasbih.*

class tasbih : Fragment(R.layout.fragment_tasbih) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        btn_tasbih.setOnClickListener {

            var currentNumber : Int = tv_current_number.text.toString().toInt()
            var numberOfCycles = tv_number_of_cycles.text.toString().toInt()

            //when the the number of tasbih been 33 add 1 to number of cycles
            if (currentNumber==33){
                numberOfCycles += 1
                tv_number_of_cycles.text=numberOfCycles.toString()
                tv_current_number.text= 0.toString()

            }else{
                currentNumber += 1

            tv_current_number.text= currentNumber.toString()
            }

        }
    }


}
