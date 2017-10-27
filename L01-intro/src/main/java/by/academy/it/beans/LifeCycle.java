package by.academy.it.beans;

/**
 * Class LifeCycle
 * <p>
 * Created by yslabko on 02/03/2017.
 */
public class LifeCycle {

    private String name;
    private int age;

    public LifeCycle() {
    }

    public LifeCycle(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @PostConstruct
    public void postConstruct() {
        System.out.println("PostConstruct cycle.");
    }

    @Override
    public String toString() {
        return "LifeCycle{" + "name='" + name + ", age=" + age + '}';
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("AfterPropertiesSet cycle.");
    }

    public void initMethod() {
        System.out.println("InitMethod cycle");
    }
    public void destroyMethod() {
        System.out.println("DestroyMethod cycle");
    }

}
