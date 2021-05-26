package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.adapters.ValidationServiceAdapter;
import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.business.abstracts.ValidationService;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.abstracts.User;
import kodlamaio.hrms.entities.concretes.Employer;
import kodlamaio.hrms.utilities.results.ErrorResult;
import kodlamaio.hrms.utilities.results.Result;
import kodlamaio.hrms.utilities.results.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService, UserService {

    private EmployerDao employerDao;
    private ValidationService validationService;

    @Autowired
    public EmployerManager(EmployerDao employerDao){
        this.employerDao = employerDao;
        this.validationService = new EmployerValidationManager();
    }

    @Override
    public List<Employer> getAll() {
        return employerDao.findAll();
    }

    @Override
    public void add(Employer employer) {
        employerDao.save(employer);
    }


    @Override
    public Result register(User user) {
        if(validationService.isUserValid()){
            return new SuccessResult("User successfully registered.");
        }
        return new ErrorResult("Registration unsuccessful. Please check your credentials!");
    }
}
