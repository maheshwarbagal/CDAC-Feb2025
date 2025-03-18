import java.io.IOException;

class IOExcep {
    public static void main(String args[]) {
        try {
            System.out.println("Enter a character: ");
            int a = System.in.read();
            
            throw new IOException("IO Exception Occured");

        } catch (IOException e) {
            System.out.println("IO Exception caught: " + e.getMessage());
        }
    }
}