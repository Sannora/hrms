package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entities.concretes.Candidate;

import java.util.List;

public interface CandidateService {
    List<Candidate> getAll();
    void add(Candidate candidate);
}
