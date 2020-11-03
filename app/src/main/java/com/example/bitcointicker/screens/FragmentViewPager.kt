package com.example.bitcointicker.screens

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.bitcointicker.screens.AUDFragment.AUDFragment
import com.example.bitcointicker.screens.CADFragment.CADFragment
import com.example.bitcointicker.screens.USDFragment.USDFragment

class FragmentViewPager internal constructor(fragmentManager: FragmentManager):FragmentPagerAdapter(fragmentManager){
    private val FRAGMENT_COUNT = 3

    override fun getItem(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = USDFragment()
            1 -> fragment = AUDFragment()
            2 -> fragment = CADFragment()
        }
        return fragment!!
    }

    override fun getCount(): Int {
        return FRAGMENT_COUNT
    }




}