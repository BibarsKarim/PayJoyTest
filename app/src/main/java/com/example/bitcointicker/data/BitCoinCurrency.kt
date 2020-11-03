package com.example.bitcointicker.data

import com.google.gson.annotations.SerializedName


data class BitCoinCurrency (
    @SerializedName("USD")
    var bitCoinDataUSD: BitCoinData,
    @SerializedName("AUD")
    var bitCoinDataAUD: BitCoinData,
    @SerializedName("CAD")
    var bitCoinDataCAD: BitCoinData

)