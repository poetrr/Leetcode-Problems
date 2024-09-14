import java.util.*;
public class CompareStrings {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap <Integer,Integer>mpp=new HashMap<>();
        int n=magazine.length();
        for(int i=0;i<n;i++){
            int convert=(int)magazine.charAt(i);
            int value=mpp.getOrDefault(convert ,0);
            mpp.put(convert,value+1);
        }
        int n2=ransomNote.length();
        for(int i=0;i<n2;i++){
            int convert=(int)ransomNote.charAt(i);
            int value=mpp.getOrDefault(convert ,0);
            if(value==1){
                return true;
            }
        }
        
        return false;
        
    }
    public static void main(String[] args) {
        String a="aa";
        String b="ab";
        int n=a.length();
        System.out.println(n);
        for(int i=0;i<n;i++){
            int convert=(int)a.charAt(i);

        }

        
    }
}
