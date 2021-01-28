package com.aboubakergb.AdkareElmoslim

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecycleAdkareIstigadaAdapter: RecyclerView.Adapter<RecycleAdkareIstigadaAdapter.ViewHolder>() {
    // Here put Text
    private val itemAdkare= listOf("الحَمْـدُ لِلّهِ الّذي أَحْـيانا بَعْـدَ ما أَماتَـنا وَإليه النُّـشور. ","الحمدُ للهِ الذي عافاني في جَسَدي وَرَدّ عَليّ روحي وَأَذِنَ لي بِذِكْرِه","لا إلهَ إلاّ اللّهُ وَحْـدَهُ لا شَـريكَ له، لهُ المُلـكُ ولهُ الحَمـد، وهوَ على كلّ شيءٍ قدير، سُـبْحانَ اللهِ، والحمْـدُ لله ، ولا إلهَ إلاّ اللهُ واللهُ أكبَر، وَلا حَولَ وَلا قوّة إلاّ باللّهِ العليّ العظيم. رَبِّ اغْفرْ لي.")
    private val itemNumber = intArrayOf(1,1,1)

    inner class ViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {

        var text : TextView
        var btn : Button

        init {
            text = itemView.findViewById(R.id.text_diker)
            btn=itemView.findViewById(R.id.button_number)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_view,parent,false)
        return ViewHolder(v)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.text.text =itemAdkare[position]
        holder.btn.text = itemNumber[position].toString()


        var numberOfTasbih = holder.btn.text.toString().toInt()
        holder.btn.setOnClickListener {
            if (numberOfTasbih == 0) {
                holder.btn.isEnabled = false

                //to disable the button when the number is 0
                holder.btn.setBackgroundResource(R.drawable.costume_button_disable)
                holder.btn.isEnabled = false
            } else {
                numberOfTasbih -= 1
                holder.btn.text = numberOfTasbih.toString()
            }
        }

    }

    override fun getItemCount(): Int {
        return itemAdkare.size
    }

}