// Finding First and Last Index of any Character in a String.

public class Solution {
    public static int First = -1;
    public static int Last = -1;

    public static void findIdx(String s, char ch, int idx){
        if(idx == s.length()){
            return;
        }

        if(s.charAt(idx) == ch){
            if(First == -1){
                First = idx;
            }
            else{
                Last = idx;
            }
        }
        findIdx(s, ch, idx+1);
    }
    public static void main(String[] args) {
        
        String s = "abcadaaefgh";
        char ch = 'a';
        findIdx(s, ch,0);
        System.out.println("First:"+ First);
        System.out.println("Last:"+ Last);
    }
}
