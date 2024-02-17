package week15_Arrays;

public class Sum2 {
    public static void main(String[] args) {
        System.out.println(sum2(new int[]{1, 2, 3}));
    }
    public static int sum2(int[] nums) {


        //solution1
        // if (nums.length == 0)
        //   return 0;
        // if (nums.length == 1)
        //   return nums[0];

        // return nums[0] + nums[1];

        //solution2
        // int sum=0;
        // for (int i=0; i<nums.length; i++){
        //   if (i<2){
        //     sum+=nums[i];
        //   }else{
        //     sum=nums[0]+nums[1];
        //   }
        // }
        // return sum;

        //solution3
//   int sum = 0;
// if(nums.length> 0) sum+= nums[0];
// if(nums.length> 1) sum+= nums[1];
// return sum;

        //solution4
//   int sum=0;
//   for(int each : nums){
//   if(nums.length<2) {
//     sum +=each;
//   }else{
//     sum = nums[0]+nums[1];
//   }
// }

//   return sum;

//solution5
        return (nums.length>=2)? nums[0] + nums[1] :(nums.length == 0)?  0 :nums[0];


    }

}

