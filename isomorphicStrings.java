import java.util.*;

public class isomorphicStrings {
    public static void main(String[] args) {
        HashMap<Character,Character> mpp=new HashMap<>();
        String a="aa";
        String b="bb";
        for( int i=0;i<a.length();i++){
            char place=a.charAt(i);
            char mapchar=b.charAt(i);
            Character value=mpp.getOrDefault(place,null);
            if(value==null){
                mpp.put(place,mapchar);
            }
            else if(mapchar!=value){
                return false;
            }
            
        }
        return true;
    }
}
