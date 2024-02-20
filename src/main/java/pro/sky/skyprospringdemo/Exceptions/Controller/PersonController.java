package pro.sky.skyprospringdemo.Exceptions.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprospringdemo.Exceptions.Service.PersonService;
import pro.sky.skyprospringdemo.Exceptions.exceptoins.BadPersonNumberException;

@RestController
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping(path = "/person")
    public String getPersonInfo(@RequestParam("number") Integer number) {
        final String person;
        try {
            person = personService.getPerson(number);
        } catch (BadPersonNumberException e) {
            throw new RuntimeException(e);
        }
        return person;
    }
}
