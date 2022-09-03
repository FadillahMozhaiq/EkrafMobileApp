package id.co.project.navdrawerdefault.data.remote.response

import com.google.gson.annotations.SerializedName

class LoginResponse(

    @field:SerializedName("token")
    val token: String? = null,
)