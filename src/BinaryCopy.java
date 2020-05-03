import java.io.*;
import java.util.Scanner;

public class BinaryCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your path: ");
        String isPath = sc.nextLine();
        System.out.println("Enter your dest path: ");
        String osPath = sc.nextLine();
        try {
            FileInputStream is = new FileInputStream(isPath);
            FileOutputStream os = new FileOutputStream(osPath);
            int i;
            while ((i = is.read()) != -1) {
                os.write(i);
            }
            is.close();
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
