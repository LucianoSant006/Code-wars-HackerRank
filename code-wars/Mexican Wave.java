//Rules
//1.  The input string will always be lower case but maybe empty.

//2.  If the character in the string is whitespace then pass over it as if it was an empty seat
//Example
//wave("hello") => {"Hello", "hEllo", "heLlo", "helLo", "hellO"}

//My code
import java.util.*;
public class MexicanWave {

    public static String[] wave(String str) {
        // Lista para armazenar as variações
        List<String> list = new ArrayList<>();
        
   
        for (int i = 0; i < str.length(); i++) {
         
            if (Character.isWhitespace(str.charAt(i))) {
                continue;
            }
            
            StringBuilder bc = new StringBuilder();


            for (int j = 0; j < str.length(); j++) {
               
                bc.append(j == i ? Character.toUpperCase(str.charAt(j)) : str.charAt(j));
            }

            
            list.add(bc.toString());
        }

       
        return list.toArray(new String[0]);
    }
}