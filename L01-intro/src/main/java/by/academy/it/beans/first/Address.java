package by.academy.it.beans.first;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address implements IAddress {
    private Long id;
    private String flat;
    private String street;
    private String city;
    private String country;
}
