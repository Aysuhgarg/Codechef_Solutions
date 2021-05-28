import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingUtil {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setAge(5);
        student1.setFirstName("name1");
        student1.setLastName("last1");
        student1.setMarks(10);
        student1.setRollNum(2534535);


        Student student2 = new Student();
        student2.setAge(15);
        student2.setFirstName("name1hmnjgfjmkf");
        student2.setLastName("lagnfdgnst1");
        student2.setMarks(14565);
        student2.setRollNum(2455);


        Student student3 = new Student();
        student3.setAge(50);
        student3.setFirstName("nafgdsge1");
        student3.setLastName("lastfgsdgf");
        student3.setMarks(1556876);
        student3.setRollNum(2523);

        Student student4 = new Student();
        student4.setAge(1);
        student4.setFirstName("name4");
        student4.setLastName("lastfdsdg");
        student4.setMarks(15537);
        student4.setRollNum(255);


        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student1.compareTo2(student2));
        MarksCOmpartaor marksCOmpartaor = new MarksCOmpartaor();
        System.out.println(marksCOmpartaor.compare(student1,student2));
        System.out.println("Before");
        System.out.println(studentList);
        System.out.println("After");
      //  System.out.println(marksCOmpartaor.compare2(student1,student2));

        studentList.stream().forEach(x->{System.out.println(x.getRollNum());});

        //System.out.println(studentList);
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student) {

                    return student1.getFirstName().compareTo(student2.getFirstName());
            }
        });
        System.out.println();

        studentList.stream().forEach(x->{System.out.println(x.getFirstName());});
        //System.out.println(studentList);






    }
}
