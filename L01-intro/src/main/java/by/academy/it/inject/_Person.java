package by.academy.it.inject;

import java.util.Set;

import javax.inject.Inject;
import javax.inject.Provider;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * User: yslabko
 * Date: 14.04.14
 * Time: 12:24
 */

@Component("person")
@Data
public class _Person implements InitializingBean, DisposableBean{
    private Integer id;
    private String name;
    private String surname;

    private Provider<IAddress> provider;
    @Company
    @Inject
    private Set<IAddress> addresses;

    @Inject
    public _Person(Provider<IAddress> addressProvider) {
        provider = addressProvider;
    }

    public void setAddresses(Set<IAddress> addresses) {
        this.addresses = addresses;
    }

    public void initAddresses() {
        addresses.add(provider.get());
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", addresses=" + addresses +
                '}';
    }

    public void destroy() throws Exception {

    }

    public void afterPropertiesSet() throws Exception {

    }
}
