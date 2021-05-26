package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.adapters.ValidationServiceAdapter;
import kodlamaio.hrms.business.abstracts.PersonnelValidationService;
import kodlamaio.hrms.business.abstracts.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployerValidationManager implements ValidationService {

    private PersonnelValidationService personnelValidation;
    private ValidationServiceAdapter validationAdapter;

    @Autowired
    public EmployerValidationManager(PersonnelValidationService personnelValidationService, ValidationServiceAdapter validationAdapter){
        this.personnelValidation = new PersonnelValidationManager();
        this.validationAdapter = validationAdapter;
    }

    public EmployerValidationManager(){

    }

    @Override
    public boolean isUserValid(boolean... credentials) {
        for(boolean credential : credentials){
            if(credential == false){
                return false;
            }
        }
        personnelValidation.validateUser();
        return true;
    }
}
