// Moving all X in a String to end of the String

public class Solution {

    public static void moveEle(String s, int idx, int count, String newStr){

        
        if(idx == s.length()){
            for (int i = 0; i < count; i++) {
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }
        if(s.charAt(idx) == 'x'){
            count++;
            moveEle(s, idx+1, count, newStr);
        }
        else{
            newStr += s.charAt(idx);
            moveEle(s, idx+1, count, newStr);
        }
    }
    
    public static void main(String[] args) {
        
        String newStr = "";
        // String s = "abxcdxxef";
        String s = "axbxc";
        moveEle(s, 0, 0, newStr);
    }
}
