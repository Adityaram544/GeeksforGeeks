class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        Arrays.sort(arr);
      int st=0,end=arr.length-1;
      while(st<end){
          int sum=arr[st]+arr[end];
          if(sum==target){
              return true;
          }
          else if(sum<target){
              st++;
          }else{
              end--;
          }
      }
      return false;
    }
}