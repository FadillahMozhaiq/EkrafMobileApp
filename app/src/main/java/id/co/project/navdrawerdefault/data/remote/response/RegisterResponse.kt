package id.co.project.navdrawerdefault.data.remote.response

import com.google.gson.annotations.SerializedName

class RegisterResponse (
    @field:SerializedName("id")
    val id: Int? = null,

    @field:SerializedName("token")
    val token: String? = null
)
