class Solution {
    public int heightChecker(int[] heights) {
        int c=0;

        int[]expect=new int[heights.length];
        for(int j=0;j<expect.length;j++){
          expect[j]=heights[j];
        }
                Arrays.sort(heights);
        for(int i=0;i<heights.length;i++)
        {
            if(heights[i]!=expect[i]){
                c++;
            }
        }
        return c;
    }
}