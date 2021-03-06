package by.academy.it.rest.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Pattern;

/**
 * User: yslabko
 * Date: 14.04.14
 * Time: 12:24
 */
@Data @NoArgsConstructor
@Entity
public class Person {
    @Id
    @Column(name = "PERSON_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "AGE")
    @DecimalMax(value = "150", message = "Digit must be a less than 150")
    @DecimalMin(value = "0", message = "Digit must be a greater than 0")
    private Integer age;
    
    @Column(name = "NAME")
    @Pattern(regexp="^[A-Z]+[a-z]+$",
            message="Username must be alphanumeric with no spaces and first capital")
    private String name;
    
    @Column(name = "SURNAME")
    private String surname;
}
