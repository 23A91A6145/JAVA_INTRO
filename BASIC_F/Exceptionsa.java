package exceptionHandling;

class Exceptionsa {
    public static void main(String[] args) {
        try {
            int div = 10 / 0;
            System.out.println(div);
        } catch (ArithmeticException e) {
            System.out.println("Don't divide a number by zero");
        }

        int a = 10;
        int b = 9;
        System.out.println(a + b);
    }
}
