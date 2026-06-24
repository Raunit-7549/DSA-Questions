import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

public class Student {

    String name;
    int rollNo;

    public Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass()!= o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }




    public static void main(String[] args) {

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student("Anuj", 2));
        studentSet.add(new Student("Ramesh", 4));
        studentSet.add(new Student("Shivam", 3));
        studentSet.add(new Student("Anuj", 1));

        System.out.println(studentSet);

    }
}