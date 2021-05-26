package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.PersonnelValidationService;

public class PersonnelValidationManager implements PersonnelValidationService {
    @Override
    public void validateUser() {
        System.out.println("Your registration is confirmed by system personnel.");
    }
}
