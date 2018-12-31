package rmit.p1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Class {
    private String id;
    private String name;
    private List<Student> listOfStudents = new ArrayList<>();

    //methods
    public void addStudent(Student student){
        listOfStudents.add(student);
    }

    public void removeStudent(Student student){
        listOfStudents.remove(student);
    }
    public Class(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public List<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(List<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
