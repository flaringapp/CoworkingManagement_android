package com.flaringapp.coursework2021.data.network.features.rooms

import com.flaringapp.coursework2021.data.network.base.ApiResponse
import com.flaringapp.coursework2021.data.network.base.ApiResponseList
import com.flaringapp.coursework2021.data.network.base.ApiResponseSuccess
import com.flaringapp.coursework2021.data.network.features.rooms.request.RoomRequest
import com.flaringapp.coursework2021.data.network.features.rooms.response.RoomResponse
import retrofit2.http.*

interface RoomsApiService {

    @GET("rooms")
    fun getRooms(
        @Query("building_id") buildingId: String? = null
    ): ApiResponseList<RoomResponse>

    @PUT("room")
    fun addRoom(
        @Body room: RoomRequest
    ): ApiResponse<RoomResponse>

    @POST("room")
    fun editRoom(
        @Body room: RoomRequest
    ): ApiResponse<RoomResponse>

    @DELETE("room")
    @FormUrlEncoded
    fun deleteRoom(
        @Query("id") id: String
    ): ApiResponseSuccess

}