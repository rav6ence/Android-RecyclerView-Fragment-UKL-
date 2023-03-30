package com.serafine.appbelibeli

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolderList (inflater: LayoutInflater, parent: ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.recycler_view_cardview, parent, false)),
    View.OnClickListener {

    private var imgView: ImageView? = null
    private var txtView1: TextView? = null
    private var txtView2: TextView? = null
    private var txtView3: TextView? = null
    private var btnFav: ImageButton? = null
    private var clicked = false

    init{
        imgView = itemView.findViewById(R.id.photo)
        txtView1 = itemView.findViewById(R.id.title)
        txtView2 = itemView.findViewById(R.id.description)
        txtView3 = itemView.findViewById(R.id.price)
        btnFav = itemView.findViewById(R.id.favorite_button)

        btnFav?.setOnClickListener(this)
    }

    fun bind(data: Shop){
        imgView?.setImageResource(data.photo)
        txtView1?.text = data.name
        txtView2?.text = data.desc
        txtView3?.text = data.price
    }

    override fun onClick(p0: View?) {
        if(clicked == false){
            btnFav?.setBackgroundResource(R.drawable.ic_baseline_favorite_24)
            clicked = true
        }
        else{
            btnFav?.setBackgroundResource(R.drawable.ic_baseline_favorite_border_24)
            clicked = false
        }
    }

}