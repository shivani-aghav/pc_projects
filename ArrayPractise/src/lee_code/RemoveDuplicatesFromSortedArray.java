package lee_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class RemoveDuplicatesFromSortedArray {
	
	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4}; 
     int swap=0;
		int i=0;
		while(i<nums.length) {
 			int j =0;
              while(j<nums.length) {
            	  if(i!=j && nums[j]==nums[i]){
            		  if(j!=nums.length-1) {
            			  nums[j]=nums[j+1];
            			  swap++;
            		  }
            	  }
            	  j++;
              }
              i++;
		}
		System.out.println(Arrays.toString(nums));
		System.out.println(swap);
	}

	
}