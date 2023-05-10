public class Introduction {

    public static void main(String[] args) {
       // Car tata; // Declaration
        //tata = new Car(); //Initialization

        Car tata = new Car(); //Declaration+Initialization

        tata.setColor("Black");
        tata.setModel(2023);
        tata.setName("Harrier");

        System.out.println("Name = "+tata.name);
        System.out.println("Color = "+tata.color);
        System.out.println("Model = "+tata.model);



    }
}

class Car {
    String name;
    int model;
    String color;

    void setName(String name) {
        this.name = name;
    }

    void setModel(int model) {
        this.model = model;
    }

    void setColor(String color) {
        this.color = color;
    }

}
