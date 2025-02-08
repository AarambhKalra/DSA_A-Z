package Hashing;

import java.util.*;
import java.util.HashMap;

public class highest_lowest_frequency_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {10, 5, 10, 15, 10, 5};
	     frequencyCount(arr);

	}
	public static void frequencyCount(int[] arr) {
        // do modify in the given array
        
        
        Map<Integer, Integer> mp = new HashMap<>();
		for(int i = 0;i < arr.length; i++) {
			int key = arr[i];
            int freq = 0;
            if (mp.containsKey(key)) freq = mp.get(key); // fetching from the map
            freq++;
            mp.put(key, freq);
        }
		
		int maxFreq = 0, minFreq = arr.length ;
        int maxEle = 0, minEle = 0;
        // Traverse through map and find the elements
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            int count = entry.getValue();
            int element = entry.getKey();

            if (count > maxFreq) {
                maxEle = element;
                maxFreq = count;
            }
            if (count < minFreq) {
                minEle = element;
                minFreq = count;
            }
        }

        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);
    }

}
