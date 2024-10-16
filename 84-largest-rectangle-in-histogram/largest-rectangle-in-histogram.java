class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack=new Stack<>();
        int n=heights.length;
        int area=0;
        int index=0;

        for(int i=0;i<n;i++){
            while(!stack.empty() && heights[stack.peek()]>heights[i]){
                index=stack.peek();
                stack.pop();

                if(!stack.empty()){
                    area=Math.max(area,heights[index]*(i-stack.peek()-1));
                }
                else{
                    area=Math.max(area,heights[index]*i);
                }
            }
            stack.push(i);
        }

        while(!stack.empty()){
            index=stack.peek();
            stack.pop();

            if(!stack.empty()){
                area=Math.max(area,heights[index]*(n-stack.peek()-1));
            }
            else{
                area=Math.max(area,heights[index]*n);
            }
        }
        return area;
    }
}