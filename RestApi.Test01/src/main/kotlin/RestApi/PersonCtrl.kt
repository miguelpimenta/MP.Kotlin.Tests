package restApi

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class PersonCtrl {
    @Autowired
    private lateinit var db: PersonsDAL

    @RequestMapping("/", method = [RequestMethod.GET])
    fun welcome() : String {
        return "Welcome to Kotlin REST API."
    }

    @RequestMapping("/persons", method = [RequestMethod.GET])
    fun getPersons() = db.getPersons()

    @GetMapping("/person/{id}")
    fun getPersonById( @PathVariable("id") id:Int) = db.getPersonById(id)

    @RequestMapping("person/add", method = [RequestMethod.POST])
    fun addPerson(@RequestBody person: Person) =
        if (db.addPerson(person)) person
        else throw Exception("Error...")

}