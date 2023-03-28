package com.example.connectiontodbspring.Repository;

import com.example.connectiontodbspring.Model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class PersonRepo {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Person> fetchAll(){
        String sql = "SELECT * FROM person;";
        RowMapper<Person> rowMapper = new BeanPropertyRowMapper<>(Person.class);
        return jdbcTemplate.query(sql,rowMapper);
    }

    public void addPerson(Person person){
        String sql = "INSERT INTO person (first_name, last_name) VALUES(?,?)";
        jdbcTemplate.update(sql, person.getFirstName(), person.getLastName());
    }

    public Person findPersonById(int id){
        String sql = "SELECT * FROM person WHERE id = ?";
        RowMapper<Person> rowMapper = new BeanPropertyRowMapper<>(Person.class);
        Person p = jdbcTemplate.queryForObject(sql,rowMapper,id);
        return p;
    }

    public Boolean deletePerson(int id){
        String sql = "DELETE FROM person WHERE id = ?";
        return jdbcTemplate.update(sql,id) > 0;
    }

    public void updatePerson(int id, Person person){
        String sql = "UPDATE person SET first_name = ?, last_name = ? WHERE id = ?";
        jdbcTemplate.update(sql, person.getFirstName(), person.getLastName(), id);
    }
}
