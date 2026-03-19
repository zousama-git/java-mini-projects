import java.util.Scanner;
public class main {
     static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
        
         double width, length, area =0;
        
         System.out.print("Enter your length: ");
         length = scanner.nextDouble();
        
         System.out.print("Enter your width: ");
         width = scanner.nextDouble();
        
         area = width * length;
        
         //NumLock + Alt + 0178 for super-script
         System.out.println("Your area is: "+area+" cm²");
        
         scanner.close();
    }
}
