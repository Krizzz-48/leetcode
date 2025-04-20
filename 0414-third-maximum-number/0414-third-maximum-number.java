class Solution {
    public int thirdMax(int[] nums) {
         Set<Integer> set = new HashSet<>();
        for(int i : nums)
        set.add(i);
        int arr[]= new int [set.size()];
        int j = 0;
        for(int i : set)
        arr[j++]=i;
        Arrays.sort(arr);
        if(set.size()>2)
        return arr[set.size()-3];
        else
        return arr[set.size()-1];
    }
}