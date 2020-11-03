package com.example.bitcointicker.data

import com.example.bitcointicker.common.API.BitCoinAPI

class BitCoinRepository(private val bitCoinAPI: BitCoinAPI) {
    suspend fun getBitCoinCurrency() = bitCoinAPI.getBitCoinCurrency()
}