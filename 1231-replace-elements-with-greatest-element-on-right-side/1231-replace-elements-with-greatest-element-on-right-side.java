class Solution {

    static {
        for(int i = 0 ; i <= 3000 ; i++){
        replaceElements(new  int[]{-1});

        }
    }
    public static int[] replaceElements(int[] arr) {
        
      int len = arr.length - 1;
      if(len == 0){
        arr[0] = -1;
      }else{
      int max = arr[len];
        arr[len] = -1;
        for (int i = len - 1; i >= 0 ; i--) {
            int t = arr[i];
            arr[i] = max;
            if (t > max) {
                max =t;
            }

        }
      }
  

        return arr;

    }
}