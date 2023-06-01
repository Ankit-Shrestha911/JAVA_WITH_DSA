public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student("abc");
        s1.marks[0] = 60;
        s1.marks[1] = 50;
        s1.marks[2] = 40;

        Student s2 = new Student(s1);
        System.out.print("S1 before: ");

        for (int x : s1.marks) {
            System.out.print(x+" ");
        }

        System.out.println();

        /*
         * s1.marks[0] = 100; // change on s1 affected also on s2
         */

        s1.marks[0] = 80; // now it is not affected on deep copy

        System.out.print("s1 after: ");
        for (int x : s1.marks) {
            System.out.print(x+" ");
        }

        System.out.println();

        System.out.print("s2: ");
        for (int x : s2.marks) {
            System.out.print(x+" ");
        }

    }
}

class Student {
    String name;
    int marks[];

    Student(String name) {
        this.name = name;
        marks = new int[3];
    }

    /*
     * Shallow copy constructor
     * Here new array is not created it just refer s1 array.if s1 array value is
     * change then s2 also affected.
     * Student(Student s1) {
     * marks = new int[3];
     * this.name = s1.name;
     * this.marks = s1.marks;
     * }
     */

    // Deep copy
    //here it created individual array for each object, copy each array value to another object 
    //  array 
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        for (int i = 0; i < s1.marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

}
