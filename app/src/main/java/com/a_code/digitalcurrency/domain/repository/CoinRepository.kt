package com.a_code.digitalcurrency.domain.repository

import com.a_code.digitalcurrency.data.remote.dto.CoinDetailDto
import com.a_code.digitalcurrency.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}