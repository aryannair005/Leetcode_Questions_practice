public class guessGame{

    public static int guess(int pick,int mid){
        if(pick == mid){
            return 0;
        }else if(mid > pick){
            return -1;
        }
        return 1;
    }

    public static int game(int n,int pick){
        if(n == 1){
            return 1;
        }
        int low=1;
        int high=n;

        while(low<high){
            int mid=low+(high-low)/2;
            int value=guess(pick,mid);
            
            if(value == 0){
                return mid;
            }else if(value == -1){
                high=mid-1;
            }else if(value == 1){
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int n=2;
        int pick=1;
        System.out.println(game(n,pick));
    }
}