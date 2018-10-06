package restApi

import java.time.*
import java.time.format.DateTimeFormatter
import java.util.*

class Person() {
    private var _id: Int = 0
    var id: Int
        get() = _id
        set(value) {
            _id = value
        }

    private var _name: String = ""
    var name: String
        get() = this._name
        set(value) {
            _name = value
        }

    private var _birthDate: Date = Date()
    var birthDate : Date
        get() = _birthDate
        set(value) {
            _birthDate = value
        }

    private var _email: String = ""
    var email: String
        get() = _email
        set(value) {
            _email = value
        }

    private var _obs: String = ""
    var obs : String
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

