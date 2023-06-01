public class practice {
    public static void main(String[] args) {
      
    new verify();
          
    }
}

abstract class Check{
    static {
        System.out.println("1");
    }

    public Check(String name){
        super();
        System.out.println("2");
    }

    {
        System.out.println("3");
    }
}

 class verify extends Check{
    {
        System.out.println("4");
    }

    public verify(){
        super("hello");
        System.out.println("5");
    }
}



