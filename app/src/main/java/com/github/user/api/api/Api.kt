package com.github.user.api.api

import com.github.user.api.data.model.DetailUserResponse
import com.github.user.api.data.model.User
import com.github.user.api.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token e9f4d6de10057d8b5adc878bb7e4b7ee659afe6c")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token e9f4d6de10057d8b5adc878bb7e4b7ee659afe6c")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token e9f4d6de10057d8b5adc878bb7e4b7ee659afe6c")
    fun getFollowers(
        @Path("username") username : String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token e9f4d6de10057d8b5adc878bb7e4b7ee659afe6c")
    fun getFollowing(
        @Path("username") username : String
    ): Call<ArrayList<User>>
}