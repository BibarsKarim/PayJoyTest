package com.example.bitcointicker.data.modules

import com.example.bitcointicker.common.API.BitCoinAPI
import com.example.bitcointicker.data.BitCoinRepository
import com.example.bitcointicker.screens.USDFragment.SharedViewModel
import com.example.bitcointicker.usecases.GetBitCoinInfoUseCase
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit

val bitcoinModule = module {
    single<BitCoinAPI> {
        val x = get<Retrofit>()
        x.create(BitCoinAPI::class.java)
    }
    factory { BitCoinRepository(get()) }
    factory { GetBitCoinInfoUseCase(get()) }
    viewModel { SharedViewModel(get()) }
}
