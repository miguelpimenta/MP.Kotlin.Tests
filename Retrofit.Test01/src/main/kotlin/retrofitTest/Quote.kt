package retrofitTest

import com.google.gson.annotations.SerializedName

data class Quote(
        @SerializedName("quoteText") val QuoteText: String,
        @SerializedName("quoteAuthor") val QuoteAuthor: String,
        @SerializedName("senderName") val SenderName: String,
        @SerializedName("senderLink") val SenderLink: String,
        @SerializedName("quoteLink") val QuoteLink: String
)