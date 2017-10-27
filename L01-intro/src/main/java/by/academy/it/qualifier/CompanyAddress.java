package by.academy.it.qualifier;

import org.springframework.stereotype.Component;

import by.academy.it.beans.IAddress;
import lombok.Data;
import lombok.ToString;

@Company
@Component
@Data @ToString
public class CompanyAddress implements IAddress {
    private Long id;
    private String street;
    private Long home;
    private String email;
}
