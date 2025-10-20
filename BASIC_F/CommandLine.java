public class CommandLine {
    public static void main(String args[]) {
        if (args.length > 4) {
            String res = args[0] + args[4];
            System.out.println("The value is: " + res);
        } else {
            System.out.println("Please provide at least five command line arguments.");
        }
    }
}
