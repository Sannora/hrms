package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entities.abstracts.User;
import kodlamaio.hrms.utilities.results.Result;

public interface UserService {
    Result register(User user);
}
