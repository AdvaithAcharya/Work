import java.util.*;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            return intersect(nums2,nums1);
        }
        Map<Integer,Integer>freq=new HashMap<>();
        for(int num:nums1){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        List<Integer> result=new ArrayList<>();
        for(int num:nums2){
            int count=freq.getOrDefault(num,0);
            if(count>0){
                result.add(num);
                freq.put(num,count-1);
            }
        }
        int[]ans=new int[result.size()];
        for(int i=0;i<result.size();i++){
            ans[i]=result.get(i);
        }
        return ans;
    }
}