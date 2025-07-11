public class soloution8 {
    public static int minimumParentheses(String pattern) {
		int open = 0;
		int add = 0;
		for(char ch : pattern.toCharArray()){
			if(ch == '('){
				open++;
			}
			else if(ch == ')'){
				if(open>0){
					open--;
				}
				else{
					add++;
				}
			}
		}
		return open+add;
	}
}
