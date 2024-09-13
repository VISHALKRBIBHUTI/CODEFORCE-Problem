import java.util.Scanner;

public class AlternatingSum{
    public static void Sum(int arr[], int n) {
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum += arr[i];
            } else {
                sum -= arr[i];
            }
        }
        
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Read number of test cases
        
        while (t-- > 0) {
            int n = sc.nextInt(); // Read length of the sequence
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); // Read sequence elements
            }
            
            Sum(arr, n);
        }
        
        sc.close();
    }




}


