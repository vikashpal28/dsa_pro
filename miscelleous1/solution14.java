package miscelleous1;

public class solution14 {
    public static String convert(String s , int numRows){
        if(numRows == 1 || s.length()<=numRows) return s;

        StringBuilder[] rows = new StringBuilder[numRows];//initialise the row
        for(int i = 0;i<numRows;i++){
            rows[i] = new StringBuilder();// here no of rows be created
        }
        int curRows = 0;
        boolean isGoing = false;
        for(char c : s.toCharArray()){
            rows[curRows].append(c);
            if(curRows == 0 || curRows == numRows -1) isGoing = !isGoing;
            curRows+=isGoing ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for(StringBuilder row : rows){
            result.append(row);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "PAYPALISHIRING";
        System.out.println(convert(str, 3));
    }
}
