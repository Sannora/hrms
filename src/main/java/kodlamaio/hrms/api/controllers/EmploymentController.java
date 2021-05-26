package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.business.abstracts.EmploymentService;
import kodlamaio.hrms.entities.concretes.Employment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employments")
public class EmploymentController{

    private EmploymentService employmentService;

    @Autowired
    public EmploymentController(EmploymentService employmentService){
        this.employmentService = employmentService;
    }

    @RequestMapping("/getall")
    public List<Employment> getAll(){
        return employmentService.getAll();
    }

    @PostMapping("/add")
    public void add(Employment employment){
        employmentService.add(employment);
    }
}
