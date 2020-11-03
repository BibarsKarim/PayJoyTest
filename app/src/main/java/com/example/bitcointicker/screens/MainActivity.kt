package com.example.bitcointicker.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.bitcointicker.R
import com.example.bitcointicker.data.modules.bitcoinModule
import com.example.bitcointicker.data.modules.netWorkModule
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.core.context.startKoin

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (fragment_view_pager != null) {
            val adapter = FragmentViewPager(supportFragmentManager)
            fragment_view_pager.adapter = adapter
        }

    }
}