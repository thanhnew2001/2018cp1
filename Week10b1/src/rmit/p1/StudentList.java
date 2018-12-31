package rmit.p1;

import java.util.ArrayList;
import java.util.List;

public class StudentList {

    private List<String> students = new ArrayList<>();

    public static StudentList object = new StudentList();

    private StudentList() {
    }

    public void add(String student){
        System.out.println("Adding students");
        students.add(student);

    }
    public List<String> getAll(){
        return students;
    }
}

//Exercise: Create Singleton class for EmployeeList, DBConnection,
// CourseList