package id.co.project.navdrawerdefault.data.remote.services

import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiService {
    // Login
 @FormUrlEncoded
 @POST("/api/ekraf/login")
 fun loginUser(
    @Field("email") email : String,
    @Field("password") password : String
 )
    // Register
 @FormUrlEncoded
 @POST("/api/ekraf/register")
 fun registerUser(
        @Field("nama") nama : String,
        @Field("emai") email : String,
        @Field("password") password : String,
        @Field("confirmPassword") confirmPassword: String,
 )

}