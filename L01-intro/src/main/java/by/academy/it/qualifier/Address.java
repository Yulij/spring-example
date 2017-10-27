package by.academy.it.qualifier;

import org.springframework.stereotype.Component;

import by.academy.it.beans.IAddress;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AddressAnnotated
@Component
@Data @ToString @NoArgsConstructor @AllArgsConstructor
public class Address implements IAddress{

    private Long id;
    private String street;
    private String city;
    private String country;
    private String email;
}
