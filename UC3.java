public class UC3 {
    // Main method to run the banner display
    // Use System.out.println() to print each line of the OOPS banner
    // Construct each line using String.join() method for better readability and efficiency.
    // Each line corresponds to a row in the banner for the letters O, O, P, S.
    public static void main(String[] args) {
        System.out.println(String.join(" ", " ***  ", " ***  ", "*****  ", " ***** "));
        System.out.println(String.join(" ", "**  **", "**  **", "**  ** ", "**     "));
        System.out.println(String.join(" ", "**  **", "**  **", "**  ** ", "**     "));
        System.out.println(String.join(" ", "**  **", "**  **", "*****  ", " ***** "));
        System.out.println(String.join(" ", "**  **", "**  **", "**     ", "    ** "));
        System.out.println(String.join(" ", "**  **", "**  **", "**     ", "    ** "));
        System.out.println(String.join(" ", " ***  ", " ***  ", "**     ", " ***** "));
    }
}