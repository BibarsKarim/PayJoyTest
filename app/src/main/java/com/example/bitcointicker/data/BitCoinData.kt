package com.example.bitcointicker.data

import com.google.gson.annotations.SerializedName

data class BitCoinData (
    @SerializedName("15m")
    var min15: Double,
    @SerializedName("last")
    var last: Double,
    @SerializedName("buy")
    var buy: Double,
    @SerializedName("sell")
    var sell: Double,
    @SerializedName("symbol")
    var symbol: String
)