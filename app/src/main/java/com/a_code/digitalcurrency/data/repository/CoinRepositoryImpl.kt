package com.a_code.digitalcurrency.data.repository

import com.a_code.digitalcurrency.data.remote.CoinPaprikaAPI
import com.a_code.digitalcurrency.data.remote.dto.CoinDetailDto
import com.a_code.digitalcurrency.data.remote.dto.CoinDto
import com.a_code.digitalcurrency.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaAPI
): CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }

}