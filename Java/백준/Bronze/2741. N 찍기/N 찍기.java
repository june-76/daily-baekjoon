import java.util.Scanner;

public class Main {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int start = 1;
        scanner.close();
        
        while(start <= n) {
            System.out.println(start);
             start++;
        }
    }
}