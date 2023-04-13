import java.util.ArrayList;

public class Student {
    private String name;
    private Long id;
    private ArrayList<Integer> grades;


    public Student(String name, Long id) {
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void addGrade(int grade) {
        this.grades.add(grade);
    }
    public ArrayList<Integer> getGrades() {
        return this.grades;
    }
    public double getGradeAverage() {
        int sum = 0;
        for (int grade:this.grades) {
            sum += grade;
        }
        return (double) sum / this.grades.size();
    }
    //delta allows 1.0 allows you to  be up to 1 point off and still pass a test.
    // @Test
    //public void testObjectsDifferentOrSame () {
    //  Object dog = new Object();
    //  Object sheep = new Object();
    //  Object clonedSheep = sheep;
    //
    //assertNotSame(dog, sheep); passes they are not the same
    //
    //assertNotSame(clonedSheep, sheep);//fails they are the same
    //assertSame(clonedSheep, sheep);//Passes they are the same
    //
    //}
}
