public class Complex {
    double real;
    double imaginary;

    // Constructor to initialize a complex number
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to display the complex number
    public void display() {
        System.out.println(this.real + " + " + this.imaginary + "i");
    }

    public static void main(String[] args) {
        // Initialize a complex number with real and imaginary parts
        Complex number = new Complex(5, 8);

        // Display the complex number
        number.display();
    }
}
