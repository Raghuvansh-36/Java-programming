// Reversing a String:
// Using Recursion

public class Solution{

    public static void revString(String str, int idx){
        if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
        
        System.out.print(str.charAt(idx));
        revString(str, idx-1);
    }

    public static void main(String[] args){

        String str = "abcde";
        revString(str, str.length()-1);
    }
}

// Using For-Loop

/*public class Solution{

    public static void revString(String str, int idx){
        for(int i = idx; i>=0; i--){
            String ans = "" + str.charAt(i);
            System.out.print(ans);
        }
    }
    public static void main(String[] args){

        String str = "a";
        revString(str, str.length()-1);
    }
}*/