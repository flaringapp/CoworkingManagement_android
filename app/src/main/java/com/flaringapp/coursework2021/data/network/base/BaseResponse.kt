package com.flaringapp.coursework2021.data.network.base

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import retrofit2.Response

typealias ApiResponse<T> = Response<T>

typealias ApiResponseList<T> = Response<List<T>>

@JsonClass(generateAdapter = true)
class BaseResponse<T>(
    override val status: String,
    override val message: String? = null,
    @Json(name = "type")
    override val errorType: String? = null,
    @Json(name = "object")
    override val data: T? = null
): ValidateableResponse<T>