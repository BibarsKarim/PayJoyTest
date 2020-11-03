package com.example.bitcointicker.usecases

import com.example.bitcointicker.data.BitCoinRepository

class GetBitCoinInfoUseCase(private val repository: BitCoinRepository) {
    suspend operator fun invoke()=repository.getBitCoinCurrency()
}