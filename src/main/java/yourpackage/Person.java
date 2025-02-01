package yourpackage;

import java.util.Objects;
import java.util.Optional;

public class Person {
    private String name;
    private Integer age;
    private Optional<Dog> dog;

    public Person(String name, Integer age) {
        this(name, age, null);
    }

    public Person(String name, Integer age, Dog dog) {
        this.name = name;
        this.age = age;
        this.dog = Optional.ofNullable(dog);
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Optional<Dog> getDog() {
        return dog;
    }

    public boolean hasOldDog() {
        return dog.map(d -> d.getAge() >= 10).orElse(false);
    }

    public void changeDogsName(String newName) {
        dog.ifPresent(d -> d.setName(newName));
        dog.orElseThrow(() -> new RuntimeException(this.name + " does not own a dog!"));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return Objects.equals(name, person.name) && Objects.equals(age, person.age) && Objects.equals(dog, person.dog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, dog);
    }
}
