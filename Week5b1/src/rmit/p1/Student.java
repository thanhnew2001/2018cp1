package rmit.p1;

public class Student {
    private String name;
    private String studentId;
    private double gpa;
    private int credits;
    //constant
    public   static final int NUMBER_CREDITS_REQUIRED = 220;
    //Ex4: Create a class named Circle:
    //props: radius
    //methods: calculateArea
    //use PI as a static final property

    public  void hello(){
        System.out.println("Hello student");
    }
    public Student() {
    }

    public Student(String name, String studentId, double gpa, int credits) {
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
        this.credits = credits;
    }

    public void passACourse(){
        this.credits+= 10;
    }

    public void passACourse(Course course){
        this.credits += course.getCredits();
    }

    public boolean eligibleForScholarship(){
        if(gpa>=3.5) return true;
        else return false;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId='" + studentId + '\'' +
                ", gpa=" + gpa +
                ", credits=" + credits +
                '}';
    }
}

//Ex2: Create a class named Lecturer
//props: id, name, qualification, years. Write some methods????
//Ex3: Create another class named Room
//props: number, computers, capacity (students can attend)