package com.example.connectiontodbspring.Service;

import com.example.connectiontodbspring.Model.Person;
import com.example.connectiontodbspring.Repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    PersonRepo personRepo;

    public List<Person> fetchAll(){
        return personRepo.fetchAll();
    }

    public void addPerson(Person person){
        personRepo.addPerson(person);
    }

    public Person findPersonById(int id){
        return personRepo.findPersonById(id);
    }

    public Boolean deletePerson(int id){
        return personRepo.deletePerson(id);
    }

    public void updatePerson(int id, Person person){
        personRepo.addPerson(person);
    }
}
