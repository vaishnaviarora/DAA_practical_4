import java.util.*;
class BF_string_match{
    public static int fun(String s, String pat){
        int m = s.length();
        int n = pat.length();
        for(int i=0; i<m-n; i++){
            int j=0;
            String temp="";
            while(j<n && s.charAt(i+j)==pat.charAt(j)){
                temp= temp+ s.charAt(i+j);
                j++;
            }
            if(j==n){
                System.out.println(temp);
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String pat = sc.next();
        System.out.println(fun(s,pat));
    }
}