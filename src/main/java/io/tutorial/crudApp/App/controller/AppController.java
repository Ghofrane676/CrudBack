package io.tutorial.crudApp.App.controller;

import io.tutorial.crudApp.App.model.employee;
import io.tutorial.crudApp.App.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class AppController {

    @Autowired
private AppService appService;
    @RequestMapping(method=RequestMethod.GET,value="/employees")

    public List<employee> getEmploye(){
        return appService.getEmployees();

    }

    @RequestMapping("/employee/{id}")
    public employee getEmployed(@PathVariable long id){

        return appService.getEmployee(id);
    }

    @RequestMapping(method= RequestMethod.DELETE, value="/employee/{id}")
    public void deleteEmployee(@PathVariable long id){
        appService.deleteEmployee(id);
    }

    @RequestMapping(method=RequestMethod.POST, value="/employees")
    public void addEmployee(@RequestBody employee employee){
        appService.addEmployee(employee);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/employee/{id}")
    public void update(@RequestBody employee employee,@PathVariable long id){
        appService.updateEmployee(employee,id);
    }


}
