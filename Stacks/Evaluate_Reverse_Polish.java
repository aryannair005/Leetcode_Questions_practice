import java.util.Stack;

public class Evaluate_Reverse{
    public static int helper(String ch,int v1,int v2){
        if(ch.equals("+")){
            return v2+v1;
        }else if(ch.equals("-")){
            return v2-v1;
        }else if(ch.equals("*")){
            return v2*v1;
        }
        return v2/v1;
    } 
    public static int evaluate(String[] tokens){
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<tokens.length;i++){
            String ch=tokens[i];

            if(ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")){
                int v1=st.pop();
                int v2=st.pop();

                int result=helper(ch,v1,v2);
                st.push(result);

            }else{
                st.push(Integer.parseInt(ch));
            }
        }
        return st.pop();
    }

    public static void main(String[] args){
        String[] tokens={"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evaluate(tokens));
    }
}