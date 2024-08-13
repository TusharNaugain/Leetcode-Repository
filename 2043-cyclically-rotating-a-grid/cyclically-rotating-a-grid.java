class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
    int left=0, right=grid[0].length-1,
    top=0, btm=grid.length-1;
        int prev=0;
        while(top<btm && left<right){
            int total_ele=2*(btm-top+1)+2*(right-left-1);
            int rot=k%total_ele;
            while(rot>0)
            {
                int temp=grid[top][left];
                for(int i=left;i<right;i++)
                    grid[top][i]=grid[top][i+1];
                for(int i=top;i<btm;i++)
                    grid[i][right]=grid[i+1][right];
                for(int i=right;i>left;i--)
                    grid[btm][i]=grid[btm][i-1];
                for(int i=btm;i>top;i--)
                    grid[i][left]=grid[i-1][left];
                grid[top+1][left]=temp;
                rot=rot-1;
            }
            top++;
            btm--;
            left++;
            right--;
        }
        return grid;
    }
}