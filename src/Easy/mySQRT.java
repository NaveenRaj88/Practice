package Easy;

public class mySQRT {
    public static void main(String[] args) {
        int x = 2147483647;
        System.out.println(mysqrt(x));
    }
    public static int mysqrt(int x) {

        if (x < 2) {
            return x;
        }
        int i =2;
        while (i*i <=x) {
            i++;
        }
            return i-1;

    }
}
