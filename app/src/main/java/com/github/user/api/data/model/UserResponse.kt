package com.github.user.api.data.model

import kotlin.collections.ArrayList
import com.google.gson.annotations.SerializedName

data class UserResponse(
    val items : ArrayList<User>
)
