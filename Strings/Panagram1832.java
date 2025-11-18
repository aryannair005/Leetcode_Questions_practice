public class Panagram1832{
    public static boolean isPanagram(String sentence){
        boolean[] exist=new boolean[26];
        int count=0;

        for(int i=0;i<sentence.length();i++){
            if(exist[sentence.charAt(i)-'a']==false){
                exist[sentence.charAt(i)-'a']=true;
                count++;
            }
        }
        if(count ==26){
            return true;
        }
        
        return false;
    }
    

    public static void main(String[] args){
        String sentence="thequickbrownfoxjumpsoverthelazydog";
        System.out.println(isPanagram(sentence));
    }
}