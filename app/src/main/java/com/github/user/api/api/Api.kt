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
    @Headers("Authorization: token 951d39af20d9dbf773c72a371f9e28d6afe79b22")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 951d39af20d9dbf773c72a371f9e28d6afe79b22")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 951d39af20d9dbf773c72a371f9e28d6afe79b22")
    fun getFollowers(
        @Path("username") username : String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 951d39af20d9dbf773c72a371f9e28d6afe79b22")
    fun getFollowing(
        @Path("username") username : String
    ): Call<ArrayList<User>>
}