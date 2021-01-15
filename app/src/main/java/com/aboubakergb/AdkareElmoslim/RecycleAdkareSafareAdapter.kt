package com.aboubakergb.AdkareElmoslim

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecycleAdkareSafareAdapter : RecyclerView.Adapter<RecycleAdkareSafareAdapter.ViewHolder>() {

    // Here put Text
    private val itemAdkare= listOf("دعاء الركوب: \"بسم الله الحمد لله.. (سُبْحانَ الَّذِي سَخَّرَ لَنَا هَذَا وَمَا كُنَّا لَهُ مُقْرِنِينَ، وَإِنَّا إِلَى رَبِّنَا لَمُنقَلِبُونَ) الحمد لله، الحمد لله، الحمد لله، الله أكبر، الله أكبر، الله أكبر، سبحانك اللهم إني ظلمت نفسي فاغفر لي، إنّه لا يغفر الذنوب إلا أنت\".\n" ,
        "اللهم هون علينا سفرنا هذا واطو عنا بعده، اللهم أنت الصاحب في السفر، والخليفة في الأهل، اللهم إني أعوذ بك من وعْثاءِ السفر، وكآبة المنظر، وسوء المنقلب في المال والأهل" ,
        "دعاء المسافر للمقيم: \"أستودعُكَ الله الذي لا تضيع ودائعه\".\n",
        "دعاء المقيم للمسافر أستودع الله دينك وأمانتك، وخواتيم عملك. زوَّدك الله التقوى، وغفر ذْنبك ويسَّر لك الخير حيث ما كنت" ,"دعاء النزول في المكان  أعوذ بكلمات الله التامات من شر ما خلق"



            )
    private val itemNumber = intArrayOf(1,1,1,1,1)

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
    }
    override fun getItemCount(): Int {
        return itemAdkare.size
    }
}