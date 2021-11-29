import java.io.*;

public class Main {

  public static void main(String[] args) {
    // Create a file and write to it
    try {
      // Connect to the file; create it if necessary
      FileWriter fw = new FileWriter("example.txt");
      // Attach a buffer to the file
      BufferedWriter bw = new BufferedWriter(fw);
      // Use the buffer to write to the file
      bw.write("Write this to file example.txt.");
      bw.newLine();
      bw.write("And also this.");
      bw.newLine();
      bw.write("And this.");
      // Close the buffer and the file writer to
      // make sure the file is saved properly
      bw.close();
      fw.close();
    } catch (Exception ex) {
      // If an error occurs, this code will run
      System.out.println(ex.getMessage());
    }

    // Open the created file and read from it
    try {
      // Connect to the file
      FileReader fr = new FileReader("example.txt");
      // Attach a buffer to the file
      BufferedReader br = new BufferedReader(fr);
      // Read a line of data from the file
      String line = br.readLine();
      // Loop until no more lines are in the file
      while (line != null) {
        // Print out the line you read in (just to
        // show that it's working)
        System.out.println(line);
        // Get the next line
        line = br.readLine();
      }
      // Close the buffer and file; if you don't do
      // this, they will be "locked" and other code
      // won't be able to use the file correctly
      br.close();
      fr.close();
    } catch (Exception ex) {
      // If an error occurs, this code will run
      System.out.println(ex.getMessage());
    }
  }
}