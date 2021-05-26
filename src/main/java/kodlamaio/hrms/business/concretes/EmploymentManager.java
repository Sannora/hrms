package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.EmploymentService;
import kodlamaio.hrms.dataAccess.abstracts.EmploymentDao;
import kodlamaio.hrms.entities.concretes.Employment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmploymentManager implements EmploymentService {

    private EmploymentDao employmentDao;

    @Autowired
    public EmploymentManager(EmploymentDao employmentDao){
        this.employmentDao = employmentDao;
    }

    @Override
    public List<Employment> getAll() {
        return employmentDao.findAll();
    }

    @Override
    public void add(Employment employment) {
        employmentDao.save(employment);
    }

}
