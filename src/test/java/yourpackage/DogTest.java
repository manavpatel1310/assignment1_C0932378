package yourpackage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DogTest {

    @Test
    public void testDogCreation() {
        Dog dog = new Dog("Buddy", 5);
        assertEquals("Buddy", dog.getName());
        assertEquals(5, dog.getAge());
    }

    @Test
    public void testDogEquality() {
        Dog dog1 = new Dog("Buddy", 5);
        Dog dog2 = new Dog("Buddy", 5);
        assertEquals(dog1, dog2);
    }

    @Test
    public void testSetName() {
        Dog dog = new Dog("Buddy", 5);
        dog.setName("Charlie");
        assertEquals("Charlie", dog.getName());
    }
}
