//{ Driver Code Starts
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

// } Driver Code Ends

class Solution {
    public List<Integer> rearrange(List<Integer> arr) {
        // Create a new list to store the rearranged values
        List<Integer> result = new ArrayList<>(Collections.nCopies(arr.size(), -1));
        
        // Iterate through the original list
        for (int num : arr) {
            // Only place numbers that are within the valid index range
            if (num >= 0 && num < arr.size()) {
                result.set(num, num);
            }
        }
        
        return result;  // Return the rearranged list
    }
}


//{ Driver Code Starts.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Solution solution = new Solution();  // Instantiate the Solution class

        while (t-- > 0) {
            String input = scanner.nextLine();
            String[] inputArr = input.split("\\s+");
            List<Integer> arr = new ArrayList<>();
            for (String s : inputArr) {
                arr.add(Integer.parseInt(s));
            }

            List<Integer> ans = solution.rearrange(arr);

            for (int num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
// } Driver Code Ends
