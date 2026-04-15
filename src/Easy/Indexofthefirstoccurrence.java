package Easy;

public class Indexofthefirstoccurrence {
    public static void main(String[] args) {
       String haystack = "aadbutsad";
       String needle = "sad";
       for (int i=0; i<= haystack.length()-needle.length(); i++){
            if(haystack.substring(i, i+needle.length()).equals(needle)){
                System.out.println(i);
                break;
            }
       }
        System.out.println(-1);
    }

}
