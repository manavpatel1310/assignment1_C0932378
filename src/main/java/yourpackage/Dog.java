package yourpackage;

import java.util.Objects;

public class Dog {
    private String name;
    private Integer age;

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Dog dog = (Dog) obj;
        return Objects.equals(name, dog.name) && Objects.equals(age, dog.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
