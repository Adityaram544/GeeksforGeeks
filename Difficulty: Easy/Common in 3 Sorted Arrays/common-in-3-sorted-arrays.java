// User function Template for Java

class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        // Code Here
        List<Integer> res=new ArrayList<>();
        int i=0,j=0,k=0;
        while(i<arr1.size() && j<arr2.size() && k<arr3.size()){
            int a=arr1.get(i);
            int b=arr2.get(j);
            int c=arr3.get(k);
            if(a==b && b==c){
                res.add(a);
                i++;
                j++;
                k++;
                int val=a;
                while(i<arr1.size() && arr1.get(i)==val) i++;
                while(j<arr2.size() && arr2.get(j)==val) j++;
                while(k<arr3.size() && arr3.get(k)==val) k++;
            }else{
                int min=Math.min(a,Math.min(b,c));
                if(a==min) i++;
                if(b==min) j++;
                if(c==min) k++;
            }
        }
        return res;
    }
}