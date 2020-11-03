package com.example.bitcointicker.screens.CADFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.example.bitcointicker.R
import com.example.bitcointicker.screens.USDFragment.SharedViewModel
import kotlinx.android.synthetic.main.u_s_d_fragment.*
import org.koin.android.viewmodel.ext.android.viewModel
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class CADFragment : Fragment() {


    private val sharedViewModel: SharedViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.u_s_d_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        sharedViewModel.getBitCoinData()
        sharedViewModel.bitCoinDataCAD.observe(viewLifecycleOwner, Observer {
            text_bit_coin_buy.text="${it.buy.toString()} ${it.symbol}"
            text_bit_coin_sell.text="${it.sell.toString()} ${it.symbol}"
            text_time_stamp.text=LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
            text_view_header.text="Price CAD"
        })
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onResume() {
        super.onResume()
    }
}