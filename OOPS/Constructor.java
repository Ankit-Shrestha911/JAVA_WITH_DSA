public class Constructor {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "abc";
        s1.rollno = 123;

        System.out.println(s1.name+" "+s1.rollno);

        System.out.println(Math.PI);

        
    }
    
}

class Student{
    String name;
    int rollno;

    //default constructor
    Student(){
        System.out.println("Object is created. ");
    }
    //Parameterized constructor
    Student(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }

}
