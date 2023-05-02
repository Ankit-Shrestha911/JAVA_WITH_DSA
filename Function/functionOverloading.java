public class functionOverloading {

    // Using parameter

    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    //Using Data type

    public static void sum(float a, float b) {
        System.out.println(a + b);
    }

    public static void sum(float a, float b, float c) {
        System.out.println(a + b + c);
    }




    public static void main(String[] args) {
        sum(2.5f,2.1f);
        sum(2,4,6);

    }

}

/*
 * Function overloading-> Multiple function with the same name but different
 * parameter.
 * Different parameter can be achieved by doing
 * 1.By changing different data type like (int a, int b) to (float a, float b)
 * 2.By adding/reducing parameter (int a) or (int a, int b) or (int a, int b,
 * int c)
 */
