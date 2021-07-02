public class Student implements  Comparable<Student>{

    private int rollNum;
    private int marks;
    private int age;
    private String firstName;
    private String LastName;

    public Student() {

    }

    public Student(int rollNum, int marks, int age, String firstName, String lastName) {
        this.rollNum = rollNum;
        this.marks = marks;
        this.age = age;
        this.firstName = firstName;
        LastName = lastName;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNum=" + rollNum +
                ", marks=" + marks +
                ", age=" + age +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        if(this.getRollNum()>student.getRollNum())
                return  1;
            else if (this.getRollNum()<student.getRollNum())
                return -1;
            else
            {
                if(this.getMarks()>student.getMarks())
                return  1;
            else if (this.getMarks()<student.getMarks())
                return -1;
            else
                return 0;
        }
    }


    public int compareTo2(Student student) {
        if(this.getMarks()>student.getMarks())
            return  1;
        else if (this.getMarks()<student.getMarks())
            return -1;
        else
            return 0;
    }



}
