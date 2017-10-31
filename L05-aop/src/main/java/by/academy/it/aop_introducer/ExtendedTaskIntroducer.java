package by.academy.it.aop_introducer;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExtendedTaskIntroducer {
    @DeclareParents(value = "by.academy.it.aop_introducer.DoTask+",
            defaultImpl = ExtendedTaskImpl.class)
    public static DoExtendedTask extendedTask;
}
