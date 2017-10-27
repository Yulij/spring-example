package by.academy.it.annotationconfig.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Class Configuration
 *
 * Created by yslabko on 11/30/2016.
 */

@Configuration
@ComponentScan(basePackages = "by.academy.it.annotationconfig")
public class NoXmlConfiguration implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

//    @Bean
//    public static MessageSource messageSource() {

//    }
}
