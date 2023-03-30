package com.serafine.appbelibeli

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity(), View.OnClickListener {
    lateinit var recycler: RecyclerView
    lateinit var adapterGrid: AdapterGrid
    lateinit var adapterList: AdapterList
    lateinit var changeButton: ImageButton
    lateinit var dikirim: TextView

    private var clicked = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        recycler = findViewById(R.id.recycler)
        changeButton = findViewById(R.id.change_layout)
        dikirim = findViewById(R.id.dikirim)

        val dikirimBaru = "dikirim ke " + intent.getStringExtra("String")
        dikirim.text = dikirimBaru
        changeButton.setOnClickListener(this)

        var data = ArrayList<Shop>()
        data.addAll(ShopData().listData)

        adapterGrid = AdapterGrid(data)
        adapterList = AdapterList(data)

        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = adapterList
    }

    override fun onClick(p0: View?) {
        if(clicked == false){
            changeButton.setBackgroundResource(R.drawable.ic_baseline_format_list_bulleted_24)
            recycler.layoutManager = GridLayoutManager(this, 2)
            recycler.adapter = adapterGrid
            clicked = true
        }
        else{
            changeButton.setBackgroundResource(R.drawable.ic_baseline_grid_on_24)
            recycler.layoutManager = LinearLayoutManager(this)
            recycler.adapter = adapterList
            clicked = false
        }
    }
}