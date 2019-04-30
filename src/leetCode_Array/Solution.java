package leetCode_Array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author miaochenge
 * @create 2018-05-09 下午4:25
 * @comment
 **/
public class Solution {

    public static boolean containsDuplicate(int[] nums) {
        boolean flag=false;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<nums.length;i++){
            Integer count=map.get(nums[i]);
            if(null==count){
                count=0;//不赋值的化 count=null ,空指针错误
                map.put(nums[i],count++);
            }else{
                flag=true;
            }

        }
        return flag;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
        //containsDuplicate(nums);
        System.out.println(containsDuplicate(nums));
    }
}
