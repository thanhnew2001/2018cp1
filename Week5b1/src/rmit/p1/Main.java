package rmit.p1;

public class Main {

    public static void main(String[] args) {
            //static methods sticks to the class level
            //non-static methods goes with object level
            Student student = new Student();
            student.setCredits(190);

            if(student.getCredits() > Student.NUMBER_CREDITS_REQUIRED){
                System.out.println("You graduate");
            }
            student.hello();

            Circle circle = new Circle();
            circle.setR(10);
            System.out.println(circle.calArea());

        System.out.println(Circle.PI);

    }
}
