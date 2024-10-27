package com.sandro.cryptotracker.crypto.presentation.coin_list

import com.sandro.cryptotracker.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError): CoinListEvent
}