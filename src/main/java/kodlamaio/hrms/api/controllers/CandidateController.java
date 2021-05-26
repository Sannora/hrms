package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/candidates")
public class CandidateController {

    private CandidateService candidateService;

    @Autowired
    public CandidateController(CandidateService candidateService){
        this.candidateService = candidateService;
    }

    @RequestMapping("/getall")
    public List<Candidate> getAll(){
        return candidateService.getAll();
    }

    @PostMapping("/add")
    public void add(Candidate candidate){
        candidateService.add(candidate);
    }
}
