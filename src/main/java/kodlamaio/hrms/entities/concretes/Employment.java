package kodlamaio.hrms.entities.concretes;

import kodlamaio.hrms.entities.abstracts.User;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employments")
public class Employment implements User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employment_id")
    private int id;

    @Column(name = "employment_title")
    private String title;
}
