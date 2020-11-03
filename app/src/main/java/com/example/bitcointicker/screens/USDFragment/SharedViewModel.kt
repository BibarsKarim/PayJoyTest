package com.example.bitcointicker.screens.USDFragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.bitcointicker.data.BitCoinCurrency
import com.example.bitcointicker.data.BitCoinData
import com.example.bitcointicker.usecases.GetBitCoinInfoUseCase
import kotlinx.coroutines.*

class SharedViewModel(private val useCase: GetBitCoinInfoUseCase) : ViewModel() {
    private val coroutineScope = CoroutineScope(Dispatchers.IO)

    val bitCoinCurrency = MutableLiveData<BitCoinCurrency>()
    val bitCoinDataAUD = MutableLiveData<BitCoinData>()
    val bitCoinDataUSD = MutableLiveData<BitCoinData>()
    val bitCoinDataCAD = MutableLiveData<BitCoinData>()

    val stopRunBlockingOperation=MutableLiveData<Boolean>().apply { value=false }

    fun getBitCoinData() {
        runBlocking {
            delay(1000)
            coroutineScope.launch {
                val returnedBitCoinCurrency = useCase.invoke()
                bitCoinCurrency.postValue(returnedBitCoinCurrency)
                bitCoinDataAUD.postValue(returnedBitCoinCurrency.bitCoinDataAUD)
                bitCoinDataUSD.postValue(returnedBitCoinCurrency.bitCoinDataUSD)
                bitCoinDataCAD.postValue(returnedBitCoinCurrency.bitCoinDataCAD)
                getBitCoinData()
            }
        }

    }


}