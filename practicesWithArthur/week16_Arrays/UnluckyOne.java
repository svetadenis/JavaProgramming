package week16_Arrays;

public class UnluckyOne {
    public static void main(String[] args) {
        System.out.println(unlucky1(new int[]{1,2,3,4,5,6}));
    }

    public static boolean unlucky1(int[] nums) {

        //solution1

        // return nums.length>=2 && ( nums[0]==1 && nums[1]==3 || nums[1]==1 && nums[2]==3 ||
        //                           nums[nums.length-2]==1 && nums[nums.length-1]==3 );

        //solution2
        // for(int i= 0; i< nums.length-1; i++){
        //   if (nums.length > 4 && i==2 ) i= nums.length-2;
        //   if (nums[i]==1 && nums[i+1]==3) return true;
        // }
        // return false;

        //solution3 (creating custom method)

        if(nums.length>=2){
            if(has13(nums,0,1)||has13(nums,1,2) || has13(nums,nums.length-2,nums.length-1)){
                return true;
            }
        }
        return false;
    }
    public static boolean has13(int [] nums, int start,int end ){
        for(int i =start;i<end;i++){
            if(nums[i]==1 && nums[i+1]==3){
                return true;
            }
        }
        return false;

    }


}

