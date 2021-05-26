package kodlamaio.hrms.entities.concretes;

import kodlamaio.hrms.entities.abstracts.User;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employers")
public class Employer implements User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employer_id")
    private int id;

    @Column(name = "corporate_name")
    private String corporateName;

    @Column(name = "website_address")
    private String website;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "password")
    private String password;

    @Column(name = "password_confirmation")
    private String passwordConfirmation;
}
