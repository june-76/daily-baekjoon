import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;
        
        for (int i = 0; i < 10; i++){
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        
        scanner.close();
        
        int average = sum / 10;
        System.out.println(average);
        
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        // number: frequency
        for (int number : numbers) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }
        
        // initial key: value
        int mostFrequencyNumber = numbers[0];
        int mostFrequency = 0;
        
        for (int number: frequencyMap.keySet()) {
            int frequency = frequencyMap.get(number);
            if (frequency > mostFrequency) {
                mostFrequency = frequency;
                mostFrequencyNumber = number;
            }
        }
  
         System.out.println(mostFrequencyNumber);
    }
}