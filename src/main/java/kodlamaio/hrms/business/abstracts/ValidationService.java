package kodlamaio.hrms.business.abstracts;

public interface ValidationService {

    boolean isUserValid(boolean... credentials);

}
