import java.util.*;

public class MinimumElementsRemoved { 
        
    static int FindMinNumber(int arr[], int n, int k)  { 
        int i = 0; 
        int j = 0; 
        int min_num = Integer.MAX_VALUE; 
        boolean found = false; 
        int sum = 0;
        Arrays.sort(arr); 
    
        while (i < n)  { 
    
            sum = sum + arr[i]; 
    
            if (sum == k) { 
                min_num = Math.min(min_num,  
                                ((n - (i + 1)) + j)); 
                found = true; 
            } 
    
            else if (sum > k)  { 
    
                while (sum > k)  { 
                    sum = sum - arr[j]; 
                    j++; 
                } 
                if (sum == k)  { 
                    min_num = Math.min(min_num,  
                                    ((n - (i + 1)) + j)); 
                    found = true; 
                } 
            } 
    
            i++; 
        } 
    
        if (found) 
            return min_num; 
    
        return -1; 
    } 
    
    public static void main(String[] args) { 
        int arr[] = { 1, 3, 5, 2, 6 }; 
        int n = arr.length; 
        int k = 5; 
    
        System.out.println(FindMinNumber(arr, n, k)); 
    } 

} 