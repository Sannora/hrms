package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.business.abstracts.ValidationService;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.entities.abstracts.User;
import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.utilities.results.ErrorResult;
import kodlamaio.hrms.utilities.results.Result;
import kodlamaio.hrms.utilities.results.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateManager implements CandidateService, UserService {

    private CandidateDao candidateDao;
    private ValidationService validationService;

    @Autowired
    public CandidateManager(CandidateDao candidateDao){
        this.candidateDao = candidateDao;
        this.validationService = new CandidateValidationManager();
    }

    @Override
    public List<Candidate> getAll() {
        return candidateDao.findAll();
    }

    @Override
    public void add(Candidate candidate) {
        candidateDao.save(candidate);
    }

    @Override
    public Result register(User user) {
        if(validationService.isUserValid()){
            return new SuccessResult("User successfully registered.");
        }
        return new ErrorResult("Registration unsuccessful. Please check your credentials!");
    }
}
