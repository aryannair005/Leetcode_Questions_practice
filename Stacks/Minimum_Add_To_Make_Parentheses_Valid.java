import java.util.Stack;

public class MinimumParenthesis{
    //O(n) time complexity && O(n) space complexity
    public static int validParantheses(String s){
        int count=0;
        Stack<Character> st=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='('){
                st.push(ch);
            }else{
                if(st.isEmpty() != true && st.peek() == '('){
                    st.pop();
                }else{
                    count++;
                }
            }
        }

        while(st.isEmpty() != true){
            st.pop();
            count++;
        }
        
        return count;
    }
    //O(n) time complexity && O(1) space complexity
    public static int validParantheses2(String s){
        int count=0;
        int open=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch == '('){
                open++;
            }else{
                if(open != 0){
                    open--;
                }else{
                    count++;
                }
            }
        }   
        return open+count;
    }
    public static void main(String[] args){
        String s="((())()";
        System.out.println(validParantheses2(s));
    }
}