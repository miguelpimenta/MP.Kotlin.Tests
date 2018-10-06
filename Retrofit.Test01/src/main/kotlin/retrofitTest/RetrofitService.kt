package retrofitTest

import retrofit2.Call
import retrofit2.http.GET

public interface RetrofitService {

    @GET("?method=getQuote&format=json&lang=en")
    fun GetQuote() : Call<Quote>

}