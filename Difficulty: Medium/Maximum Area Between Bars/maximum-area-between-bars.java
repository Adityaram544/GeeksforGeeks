class Solution {
    public int maxArea(List<Integer> height) {
        // code here
        int maxArea=0;
        int l=0,r=height.size()-1;
        while(l<r){
            int x=height.get(l);
            int y=height.get(r);
            int area;
            if(x<y){
                area=Math.min(x,y)*(r-l-1);
                l++;
            }else{
                area=Math.min(x,y)*(r-l-1);
                r--;
            }
            maxArea=Math.max(maxArea,area);
        }
        return maxArea;
    }
}