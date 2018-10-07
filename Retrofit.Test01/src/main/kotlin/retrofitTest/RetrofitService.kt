package retrofitTest

import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET

public interface RetrofitService {

    @GET("?method=getQuote&format=json&lang=en")
    fun getQuote() : Call<Quote>

}