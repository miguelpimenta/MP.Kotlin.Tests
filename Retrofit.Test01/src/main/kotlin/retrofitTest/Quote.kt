package retrofitTest

class Quote() {

    private var _QuoteText: String = ""
    var QuoteText: String
        get() = _QuoteText
        set(value) {
            _QuoteText = value
        }

    private var _QuoteAuthor: String = ""
    var QuoteAuthor: String
        get() = _QuoteAuthor
        set(value) {
            _QuoteAuthor = value
        }

    private var _SenderName: String = ""
    var SenderName: String
        get() = _SenderName
        set(value) {
            _SenderName = value
        }

    private var _SenderLink: String = ""
    var SenderLink: String
        get() = _SenderLink
        set(value) {
            _SenderLink = value
        }

    private var _QuoteLink: String = ""
    var QuoteLink: String
        get() = _QuoteLink
        set(value) {
            _QuoteLink = value
        }


    constructor(QuoteText: String, QuoteAuthor: String, SenderName: String, SenderLink: String, QuoteLink: String): this() {
        this.QuoteText = QuoteText
        this.QuoteAuthor = QuoteAuthor
        this.SenderName = SenderName
        this.SenderLink = SenderLink
        this.QuoteLink = QuoteLink
    }
}

