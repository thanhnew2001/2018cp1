package student;

import java.util.ArrayList;
import java.util.List;

public class InMemoryStudentManager implements StudentManger {

    private List<Student> students = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        this.students.add(student);
    }

    @Override
    public List<Student> getStudents() {
        return this.students;
    }
}

//Exercise 5: Define a class Product: id, name, price
//Define an interface called ProductStore: addProduct, getAllProducts
//Implement InMemoryProductStore

