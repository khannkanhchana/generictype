package co.istad.generictype;

import org.graalvm.nativeimage.IsolateThread;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SchoolSystem {

    public static void main(String[] args) {



        Person student =
                new Student("Dara", "Male", 1.7F, 99.7 );
        Person teacher =
                new Teacher("Kanha", "Female", 1.56F, BigDecimal.valueOf(1200) );
        Person student2 =
                new Student("Cheata", "Female", 1.78F, 98.67 );
        Person teacher2 =
                new Teacher("Tola", "Male", 1.87F, BigDecimal.valueOf(1300) );

        List<Person> people=new ArrayList<>();
        people.add(student);
        people.add(teacher);
        people.add(student2);
        people.add(teacher2);
        School<Person> school = new School<>();


        school.getData().forEach(person -> {

            System.out.println("Name: "+ person.getName());
            System.out.println("Gender: "+ person.getGender());
            System.out.println("Height : " + person.getHeight());

            if(person instanceof Student obj) {
                System.out.println("Score: "+ obj.getScore());
            } else if (person instanceof  Teacher obj) {
                System.out.println("Salary: "+ obj.getSalary());

            }else {
                System.out.println("Invalid Information...!");
            }
            System.out.println("-------------------------");
        });


    }

}
