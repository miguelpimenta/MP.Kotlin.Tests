package retrofitTest

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

fun main(args: Array<String>) {

    val call = RetrofitInit().retrofitService().GetQuote()
    call.enqueue(object : Callback<Quote?> {
        override fun onResponse(call: Call<Quote?>?,
                                response: Response<Quote?>?) {
            response?.body()?.let {
                val quote: Quote = it
                println("---")
                println(response)
                println(response.body())
                println(response.message())
                println("---")
                println(quote.QuoteText)
                println(quote.QuoteAuthor)
            }
        }

        override fun onFailure(call: Call<Quote?>?, t: Throwable?) {
            print("Failure: " + t?.message)
        }
    })


    println("Test")
}