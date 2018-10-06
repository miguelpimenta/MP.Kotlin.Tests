package retrofitTest


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInit {

    private val retrofit = Retrofit.Builder()
            .baseUrl("https://api.forismatic.com/api/1.0/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    fun retrofitService ()  = retrofit.create(RetrofitService::class.java)
}