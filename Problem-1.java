class Calculator {

    double add(double a, double b) {
        return a + b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    double divide(double a, double b) {
        return a / b;
    }
}

class Main {

    public static double calculate(double a, double b, String type) {

        Calculator c = new Calculator();

        if (type.equals("add")) {
            return c.add(a, b);
        } 
        else if (type.equals("subtract")) {
            return c.subtract(a, b);
        } 
        else if (type.equals("multiply")) {
            return c.multiply(a, b);
        } 
        else if (type.equals("divide")) {
            if (b == 0) {
                System.out.println("Cannot divide by zero");
                return Double.NaN;
            }
            return c.divide(a, b);
        }

        System.out.println("Invalid operation");
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(calculate(10, 5, "add"));
        System.out.println(calculate(10, 5, "divide"));
    }
}
