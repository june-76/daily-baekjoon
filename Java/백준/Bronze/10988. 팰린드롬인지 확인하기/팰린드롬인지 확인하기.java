import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        scanner.close();

        int length = word.length();
        boolean isPalindrome = true;

        for (int i=0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome == true ? 1 : 0);
    }
}
