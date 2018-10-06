package restApi

import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class PersonsDAL {
    private val personsDB = mutableListOf<Person>()

    @PostConstruct
    private fun init() {
        personsDB.add(Person(1,"John Doe", "johndoe123@email.com", "Test person"))
        personsDB.add(Person(2,"Michael Smith", "msmith.mic@email.com", "Test person"))
        personsDB.add(Person(3,"Diana Darc", "ddarc@email.fr", "Test person"))
        personsDB.add(Person(4,"Pablo R. Smith", "smith.pablo@doe.email.com", "Test person"))
    }

    fun getPersons() = personsDB

    fun addPerson(person: Person): Boolean {
        personsDB.add(person)
        return true
    }

    fun getPersonById(id: Int): Person? {
        return personsDB.find {
            it.id == id
        }
    }

}