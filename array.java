// largest element inn an array:
class Solution {
    public int largestElement(int[] nums) {
    int large = nums[0];
    for(int i=1;i<nums.length;i++){
        if(nums[i] > large){
            large = nums[i];
        }
    }
    return large;
}
}
// second largest in array:
class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        if(arr.length<2){
            return -1;
        }
         int first = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            if(arr[i]>first){
                sec = first;
                first = num;
            }
            else if(arr[i]>= sec && arr[i]<first){
                sec = num;
            }
          
        }
        if(sec == Integer.MIN_VALUE){
            return -1;
        }else{
        return sec;
            
        }
    }
}
// third largest element in an array:
class Solution {
    int thirdLargest(int arr[]) {
        if (arr.length<3){
            return -1;
        }
        int first = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            if(arr[i]>first){
                third = sec;
                sec = first;
                first = num;
            }
            else if(arr[i]>= sec){
                third = sec;
                sec = num;
            }
            else if(arr[i]>=third){
                third = num;
            }
        }
        return third;
    }
}
//1752. Check if Array Is Sorted and Rotated:
class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                count ++;
            }
        }
        return count <=1;
    }
}
//26. Remove Duplicates from Sorted Array:
//brute fource :
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,3,4};
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println(set);
    }
}
//optimal:


