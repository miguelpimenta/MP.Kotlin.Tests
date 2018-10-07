package retrofitTest

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

fun main(args: Array<String>) {

    val call = RetrofitInit().retrofitService().getQuote()
    call.enqueue(object : Callback<Quote?> {
        override fun onResponse(call: Call<Quote?>?,
                                response: Response<Quote?>?) {
            response?.body()?.let {
                val quote: Quote = it
                println("Quote: " + quote.QuoteText)
                println("Author: " + quote.QuoteAuthor)
            }
        }

        override fun onFailure(call: Call<Quote?>?, t: Throwable?) {
            print("Failure: " + t?.message)
        }
    })
}