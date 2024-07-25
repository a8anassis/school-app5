package gr.aueb.cf.schoolapp.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TeacherTest {

    @Test
    void gettersSetters() {
        Teacher teacher = new Teacher();
        teacher.setId(1);
        assertEquals(teacher.getId(), 1);
        teacher.setFirstname("Thanassis");
        assertEquals(teacher.getFirstname(), "Thanassis");
        teacher.setLastname("Androutsos");
        assertEquals(teacher.getLastname(), "Androutsos");
    }

    @Test
    void overloadedConstructorAndToString() {
        Teacher teacher = new Teacher(2, "Anna", "Giannoutsou");
        assertEquals(teacher.getId(), 2);
        assertEquals(teacher.getFirstname(), "Anna");
        assertEquals(teacher.getLastname(), "Giannoutsou");
        String expected = "id=2, firstname=Anna, lastname=Giannoutsou";
        assertEquals(expected, teacher.toString());
    }
}