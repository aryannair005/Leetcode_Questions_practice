public class TwoStringEquivalent{
    public static boolean isEquivalent(String[] word1,String[] word2){
        int i=0;
        int j=0;
        int w1=0;
        int w2=0;

        while(w1 != word1.length && w2 != word2.length){
            if(word1[w1].charAt(i) != word2[w2].charAt(j)){
                return false;
            }
            i++;
            j++;
            if(i == word1[w1].length()){
                i=0;
                w1++;
            }
            if(j == word2[w2].length()){
                j=0;
                w2++;
            }
        }
        if( w1 != word1.length && w2 != word2.length){
            return true;
        }
        
        return false;
    }
    public static void main(String[] args){
        String[] word1={"abc","d","defg"};
        String[] word2={"abcddef"};
        System.out.println(isEquivalent(word1,word2));
    }
}