package io.tutorial.crudApp.App.service;

import io.tutorial.crudApp.App.Repository.AppRepository;
import io.tutorial.crudApp.App.model.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppService {
    @Autowired
    private AppRepository appRepository;
    public List<employee> getEmployees(){
        List<employee> employees = new ArrayList<>();
        appRepository.findAll().forEach(employee -> {
            employees.add(employee);
        });
        return employees;
    }

    public employee getEmployee(long id) {
        return appRepository.findById(id).orElse(null);
    }

    public void deleteEmployee(long id) {

        appRepository.deleteById(id);
    }

    public void addEmployee(employee employee) {
        appRepository.save(employee);
    }

    public void updateEmployee(employee employee, long id) {
        appRepository.save(employee);
    }
}
