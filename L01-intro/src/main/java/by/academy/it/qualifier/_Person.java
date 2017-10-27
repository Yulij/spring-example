package by.academy.it.qualifier;

import java.util.HashSet;
import java.util.Set;

import javax.inject.Inject;
import javax.inject.Provider;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import by.academy.it.beans.IAddress;
import lombok.Data;

@Component("person")
@Data
public class _Person implements InitializingBean, DisposableBean{
    @Value("#{150}")
    private Integer id;
    @Value("#{'Yuli'}")
    private String name;
    private String surname;

    @Company
    @AddressAnnotated
    @Inject
    private Set<IAddress> addresses;

    public _Person(Provider<IAddress> provider) {
        addresses = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            addresses.add(provider.get());
        }

    }

    public void init() {

    }

    public void destroy() throws Exception {

    }

    public void afterPropertiesSet() throws Exception {

    }
}
