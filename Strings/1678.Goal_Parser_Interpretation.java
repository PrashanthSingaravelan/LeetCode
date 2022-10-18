
// [G -> G | () -> o | (al) -> al]
public class Goal_Parser_Interpretation {
    public static void main(String args[]) {
        String command    = "G()(al)";
        StringBuilder res = new StringBuilder();
        
        int cnt = 0;
        while (cnt < command.length()) {
            if (command.charAt(cnt) == 'G') {
                res.append("G");
                cnt++; // replace only 1 character
            } 
            
            else if(command.charAt(cnt) == '(' && command.charAt(cnt+1) == ')') {
                res.append("o");
                cnt+=2;  // replaces only 2 characters
            }
            
            else {
                res.append("al");
                cnt+=4;  // replaces 4 characters
            }
        }
        
        System.out.println(res.toString());
    }
}
