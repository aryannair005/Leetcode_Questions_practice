public class FirstLast{
    public static int leftMost(int[] nums,int start,int end,int target){
        int leftValue=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }else if(nums[mid]<target){
                start=mid+1;
            }else if(nums[mid] == target){
                leftValue=mid;
                end=mid-1;
            }
        }
        return leftValue;
    }
    public static int rightMost(int[] nums,int start,int end,int target){
        int rightValue=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }else if(nums[mid]<target){
                start=mid+1;
            }else if(nums[mid] == target){
                rightValue=mid;
                start=mid+1;
            }
        }
        return rightValue;
    }

    public static int[] searchRange(int[] nums,int target){
        int[] result={-1,-1};

        int leftValue=leftMost(nums,0,nums.length-1,target);
        int rightValue=rightMost(nums,0,nums.length-1,target);

        result[0]=leftValue;
        result[1]=rightValue;

        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

        return result;

    }

    public static void main(String[] args){
        int[] nums={5,7,7,8,8,10};
        System.out.println(searchRange(nums,6));
    }
}