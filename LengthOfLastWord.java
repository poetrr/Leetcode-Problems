public class LengthOfLastWord {
    public static void main(String[] args) {
        String name="Siddarth";
        System.out.println(name.length());

        char[] convert=name.toCharArray();
        int count=0;
        int length=name.length()-1;
        System.out.println(name);
        for(int i=0;i<length;i++){
            System.out.println(convert[i]);
        }

    }
}
