package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.adapters.ValidationServiceAdapter;
import kodlamaio.hrms.business.abstracts.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;

public class CandidateValidationManager implements ValidationService {

    private ValidationServiceAdapter validationAdapter;

    @Autowired
    public CandidateValidationManager(ValidationServiceAdapter validationAdapter){
        this.validationAdapter = validationAdapter;
    }

    public CandidateValidationManager(){

    }

    @Override
    public boolean isUserValid(boolean... credentials) {
        for(boolean credential : credentials){
            if(credential == false){
                return false;
            }
        }
        validationAdapter.validateUser();
        return true;
    }
}
