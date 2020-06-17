package com.simpleclub.android.core.data.rest.models.service

import com.simpleclub.android.core.data.rest.models.securetoken.ExchangeTokenRequest
import com.simpleclub.android.core.data.rest.models.securetoken.ExchangeTokenResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface SecureTokenApi {

	@POST("v1/token")
	fun exchangeToken(@Body request: ExchangeTokenRequest): Call<ExchangeTokenResponse>

}
