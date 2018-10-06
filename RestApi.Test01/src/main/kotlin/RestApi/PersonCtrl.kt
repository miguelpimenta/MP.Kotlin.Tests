package restApi

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class PersonCtrl {
    @Autowired
    private lateinit var db: PersonsDAL

    @RequestMapping("", method = [RequestMethod.GET])
    fun persons() = db.getPersons()

    @GetMapping("/person/{id}")
    fun getPersonById( @PathVariable("id") id:Int) = db.getPersonById(id)

    @RequestMapping("/add", method = [RequestMethod.POST])
    fun addPerson(@RequestBody person: Person) =
        if (db.addPerson(person)) person
        else throw Exception("Error...")

}