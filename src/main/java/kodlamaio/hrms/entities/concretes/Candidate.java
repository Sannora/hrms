package kodlamaio.hrms.entities.concretes;

import kodlamaio.hrms.entities.abstracts.User;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employee_candidates")
public class Candidate implements User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "candidate_id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "national_id")
    private String nationalIdentity;

    @Column(name = "birthyear")
    private int birthYear;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "password_confirmation")
    private String passwordConfirmation;

}
