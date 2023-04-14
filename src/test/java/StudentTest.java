import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testConstructor() {
        Student student = new Student("John", 1L);
        //assertNotNull(class name,method name();

        assertNotNull(student);
    }
    @Test
    public void testGetName() {
        Student student = new Student("John", 1L);
        assertSame("John", student.getName());
    }
    @Test
    public void testSetName() {
        Student student = new Student("John", 1L);
        student.setName("Steve");
        assertSame("Steve", student.getName());
    }
    @Test
    public void tesGetId() {
        Student student = new Student("John", 1L);
        assertSame(1L, student.getId());
    }
    @Test
    public void testSetId() {
        Student student = new Student("John", 1L);
        student.setId(3L);
        assertSame(3L, student.getId());
    }
    @Test
    public void testAddGrade(){
        Student student = new Student("John", 1L);
        student.addGrade(90);
        assertEquals(1, student.getGrades().size());
    }
    @Test
    public void testGetGrades() {
        Student student = new Student("John", 1L);
        assertEquals(0, student.getGrades().size());
    }
    @Test
    public void testGetGradeAverage() {
        Student student = new Student("John", 1L);
        student.addGrade(80);
        student.addGrade(50);

        assertEquals(65.0, student.getGradeAverage(), 0);
    }
    @Test
    public void testUpdateGrade() {
        Student student = new Student("John", 1L);
        student.addGrade(80);
        student.addGrade(50);
        student.updateGrade(0, 90);
        assertEquals(90, (int) student.getGrades().get(0));
    }
}