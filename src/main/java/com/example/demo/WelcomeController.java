package com.example.demo;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.management.Query;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class WelcomeController {
    private final HikariDataSource dataSource;

    public WelcomeController(HikariDataSource dataSource) {
        this.dataSource = dataSource;
    }

    @GetMapping("/welcome")
    public String hello() {
        return "welcome......";
    }

    @GetMapping("/studentnames")
    public List<String> getStudentNames() {
        List<String> studentNames = new ArrayList<>();
        String query = "select name from student";
        try(Connection connection = dataSource.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
               String studentName  = resultSet.getString("name");
               studentNames.add(studentName);
            }
        } catch (SQLException sqlException) {
            System.out.println("error while getting student info..");
        }
        return studentNames;
    }

}
