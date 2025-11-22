public class Single_Element{
    public static int singleElement(int[] nums){
        if(nums.length == 1){
            return 0;
        }

        int low=0;
        int high=nums.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(mid==0 && nums[mid] != nums[mid+1]){
                return mid;
            }else if(mid == nums.length-1 && nums[mid] != nums[mid-1]){
                return mid;
            }else if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]){
                return mid;
            }

            if(mid % 2 == 0){
                if(nums[mid] == nums[mid-1]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else if(mid % 2 != 0){
                if(nums[mid] == nums[mid-1]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }

        return -1;
    }
    public static void main(String[] args){
        int[] nums={1,1,2,3,3,4,4};
        System.out.println(singleElement(nums));
    }
}