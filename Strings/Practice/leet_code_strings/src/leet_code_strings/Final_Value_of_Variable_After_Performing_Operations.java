package leet_code_strings;

public class Final_Value_of_Variable_After_Performing_Operations {
    public static void main(String[] args) {
        int cnt = 0;
        String operations[] = {"++X","++X","X++"};
        for (String var1 : operations)
            if (var1.charAt(1) == '+')  // checking only the middle character
                cnt+=1; // if it is +m, then increment the value
            else 
                cnt-=1;  // if it is -m, then decrement the value
        System.out.println(cnt);
    }
}
