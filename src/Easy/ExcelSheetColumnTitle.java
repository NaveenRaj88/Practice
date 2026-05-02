package Easy;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        int columnNumber = 701;
        System.out.println(convertToTitle(columnNumber));
    }

    public static String convertToTitle(int cn){
        StringBuilder sb = new StringBuilder();

        while(cn >= 26){

        int modulo = cn%26;
        if(modulo == 0){
            sb.append('Z');
            cn = cn/26 - 1;
        }
        else {
            char c = (char) ('A' + modulo - 1);
            sb.append(c);
            cn = cn / 26;
        }

        }
        return sb.reverse().toString();
    }
}
