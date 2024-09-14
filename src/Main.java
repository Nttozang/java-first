import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Create an InputStreamReader to read bytes from System.in (console)
        InputStreamReader isr = new InputStreamReader(System.in);

        // Wrap the InputStreamReader with BufferedReader for efficient reading
        BufferedReader br = new BufferedReader(isr);

        // Prompt the user for input
        System.out.print("Enter your name: ");

        // Read a line of text from the console
        String name = br.readLine();

        // Output the user's input
        System.out.println("Hello, " + name);
    }
}
