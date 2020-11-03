package com.example.bitcointicker.common.API

import com.example.bitcointicker.data.BitCoinCurrency
import com.example.bitcointicker.data.BitCoinData
import retrofit2.http.GET

interface BitCoinAPI {

    @GET("/ticker")
    suspend fun getBitCoinCurrency(): BitCoinCurrency
}