package yourpackage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    public void testPersonWithoutDog() {
        Person person = new Person("Alice", 25);
        assertFalse(person.getDog().isPresent());
    }

    @Test
    public void testPersonWithDog() {
        Dog dog = new Dog("Buddy", 8);
        Person person = new Person("Alice", 25, dog);
        assertTrue(person.getDog().isPresent());
    }

    @Test
    public void testHasOldDog() {
        Dog youngDog = new Dog("Buddy", 5);
        Dog oldDog = new Dog("Max", 12);
        Person personWithYoungDog = new Person("Alice", 25, youngDog);
        Person personWithOldDog = new Person("Bob", 30, oldDog);
        assertFalse(personWithYoungDog.hasOldDog());
        assertTrue(personWithOldDog.hasOldDog());
    }

    @Test
    public void testChangeDogsNameWithDog() {
        Dog dog = new Dog("Buddy", 5);
        Person person = new Person("Alice", 25, dog);
        person.changeDogsName("Charlie");
        assertEquals("Charlie", person.getDog().get().getName());	
    }

    @Test
    public void testChangeDogsNameWithoutDog() {
        Person person = new Person("Alice", 25);
        Exception exception = assertThrows(RuntimeException.class, () -> {
            person.changeDogsName("Charlie");
        });
        assertEquals("Alice does not own a dog!", exception.getMessage());
    }
}
