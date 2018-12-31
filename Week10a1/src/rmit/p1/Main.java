package rmit.p1;

import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws MyException {
        String id = "COSC2081"; //valid
        String id2 = "Cs2";// not valid
        System.out.println(Pattern.matches("[A-Z]{4}[0-9]{4}", id));

        System.out.println(Pattern.matches("[A-Z]{4}[0-9]{4}", id2));

    }

    public static void testName(String name) throws MyException {
        if(name.length()<5){
            throw new MyException("This is exception");
        }
    }

    public static void addStudent(int age, String gender) throws InvalidAgeException {
        if(age<0 || age>120)
            throw new InvalidAgeException("Exception because age is not between 0 and 120");
    }
}


//Define your own Exception named InvalidAgeException: 0 - 120
//Define Exception named InvalidGender: M, F
//Define method: addStudent(age, gender): check if age between 0 and 120,
// if not throw InvalidAgeException
//check if gender is M or F, if not throw InvalidGender exception


//Excercise:
//1. Define a Course class: courseId, courseName, credits, teachingHours
//2. Define a CourseList:
// addCourse(Course course)
// deleteCourse(int courseId)
// getAllCourses()

// In this CourseList there will be a list of courses property
//3. Define InvalidCourseIdException: 4 letters follow 4 digits
//4. Define InvalidCourseNameException: >10 characters
//5. Define InvalidCreditsException: 1 - 24 credits
//6. Define InvalidTeachingHoursException: 12 - 72 hours


