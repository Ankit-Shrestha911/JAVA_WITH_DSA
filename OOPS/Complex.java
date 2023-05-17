public class Complex {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(5, -4);
        ComplexNumber c2 = new ComplexNumber(-2, 6);

        ComplexNumber.product(c1, c2);

    }
}

class ComplexNumber {
    int real;
    int imaginary;

    ComplexNumber() {
    }

    ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    static void sum(ComplexNumber c1, ComplexNumber c2) {
        int realSum = c1.real + c2.real;
        int imaginarySum = c1.imaginary + c2.imaginary;

        System.out.println(realSum + " + " + imaginarySum + "i");
    }

    static void difference(ComplexNumber c1, ComplexNumber c2) {
        int realDiff = c1.real - c2.real;
        int imaginaryDiff = c1.imaginary - c2.imaginary;

        System.out.println(realDiff + " + " + imaginaryDiff + "i");
    }

    static void product(ComplexNumber c1, ComplexNumber c2) {
        int realProduct = c1.real * c2.real;
        int realProductWithImaginary = c1.real * c2.imaginary;
        int imaginaryProductWithReal = c1.imaginary * c2.real;
        int imaginaryProduct = (c1.imaginary * c2.imaginary) * (-1);

        System.out.println(realProduct + imaginaryProduct + " + " + (realProductWithImaginary + imaginaryProductWithReal)+"i");
    }

}
