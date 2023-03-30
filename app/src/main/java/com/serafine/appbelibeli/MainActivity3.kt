package com.serafine.appbelibeli

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        view_pager.adapter = ViewPageAdapter(initFragments(), this, supportFragmentManager)
        tabs.setupWithViewPager(view_pager)
    }

    fun initFragments(): ArrayList<Fragment>{
        return arrayListOf(
            Form.newInstance(),
            Result.newInstance()
        )
    }
}