//static keyword 
import java.sql.Struct;
public class Static_keyword {
    public static void main(String[] args){

//student name object
Student s1 = new Student(  "Khushi",  21, 1);
 Student s2 = new Student( "rohit",  22,  2);
 Student.college = "IIT Guwahati";

 System.out.println(s1.name+" , "+ s1.age+" , "+ s1.rollNumber+" , "+s1.college);
 System.out.println(s2.name+" , "+ s2.age+" , "+ s2.rollNumber+" , "+s2.college);
     }
}

class Student {
    String name;
    int age;
    int rollNumber;
    static String college;

    Student(String name, int age, int rollNumber){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;

    }

   
    }

