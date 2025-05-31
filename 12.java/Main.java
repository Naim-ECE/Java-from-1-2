import java.util.Scanner;

class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    public Complex multiply(Complex other) {
        return new Complex(this.real * other.real - this.imaginary * other.imaginary,
                           this.imaginary * other.real + this.real * other.imaginary);
    }

    public Complex divide(Complex other) {
        double res = other.real * other.real + other.imaginary * other.imaginary;
        return new Complex((this.real * other.real + this.imaginary * other.imaginary) / res,
                           (this.imaginary * other.real - this.real * other.imaginary) / res);
    }

    public void display() {
        System.out.println(real + " + (" + imaginary + ")i");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st real part: ");
        double real1 = scan.nextDouble();
        System.out.print("Enter 1st imaginary part: ");
        double img1 = scan.nextDouble();
        Complex c1 = new Complex(real1, img1);
        
        System.out.print("Enter 2nd real part: ");
        double real2 = scan.nextDouble();
        System.out.print("Enter 2nd imaginary part: ");
        double img2 = scan.nextDouble();
        Complex c2 = new Complex(real2, img2);

        Complex sum = c1.add(c2);
        Complex difference = c1.subtract(c2);
        Complex product = c1.multiply(c2);
        Complex quotient = c1.divide(c2);

        System.out.print("Addition      : ");
        sum.display();
        System.out.print("Subtraction   : ");
        difference.display();
        System.out.print("Multiplication: ");
        product.display();
        System.out.print("Division      : ");
        quotient.display();
        
        scan.close();
    }
}

/*I created a Complex class to represent complex numbers with methods to perform arithmetic operations like addition, subtraction, multiplication, and division. 
The Main class handles user input for two complex numbers and displays the results of the operations. 
I find this implementation effective for demonstrating operator overloading concepts in a straightforward manner. */