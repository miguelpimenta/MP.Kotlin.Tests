package restApi

class Person() {
    private var _id: Int = 0
    var id: Int
        get() = _id
        set(value) {
            _id = value
        }

    private var _name: String = ""
    var name: String
        get() = _name
        set(value) {
            _name = value
        }

    private var _email: String = ""
    private var email: String
        get() = _email
        set(value) {
            _email = value
        }

    private var _obs: String = ""
    private var obs : String
        get() = _obs
        set(value) {
            _obs = value
        }

    constructor(id: Int, name: String, email: String, obs: String): this() {
        this.id = id
        this.name = name
        this.email = email
        this.obs = obs
    }
}

