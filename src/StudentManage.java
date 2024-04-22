import java.util.ArrayList;

public class StudentManage {
    private int size;
    private ArrayList<Student> student = new ArrayList<>();
    public StudentManage(){

    }
    public void add(Student student1){
        for (int i = 0; i < student.size(); i++) {
            System.out.println(student.add(student1));
        }
    }
}
