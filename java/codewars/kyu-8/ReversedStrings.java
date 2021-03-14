//https://www.codewars.com/kata/5168bb5dfe9a00b126000018/train/java

public class Kata {

  public static String solution(String str) {
    // Your code here...
    StringBuilder rts = new StringBuilder();
    rts.append(str);
    rts.reverse();
    //rts is a stringbuilder object, we have to convert it to string so we can return it
    return rts.toString();
  }

}

//test cases
/*
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void sampleTests() {
      assertEquals("dlrow", Kata.solution("world"));
    }
}
 */

//other people's answers

/*
//sol 1
public class Kata {

  public static String solution(String str) {
    return new StringBuilder(str).reverse().toString();
  }

}

//sol 2
public class Kata {

  public static String solution(String str) {
    // Your code here...
    String newcad="";
    
    for(int i = str.length()-1; i >= 0; i--){
      newcad += str.charAt(i);
    }
    
    return newcad;
  }

}

//sol 3
public class Kata {

  public static String solution(String str) {
    // Your code here...
    StringBuilder res = new StringBuilder(str.length());
    
    for (int i = (str.length() - 1); i >= 0; i--){
      res.append(str.charAt(i));
    }
    
    return res.toString();
  }

}
 */

//full test cases

/*
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import java.util.stream.*;
import java.util.Random;

public class SolutionTest {
    // Reference implementation for random tests
    public static String _solution(String str) {
      return new StringBuilder(str).reverse().toString();
    }
    
    @Test
    public void sampleTests() {
      assertEquals("dlrow", Kata.solution("world"));
      assertEquals("olleh", Kata.solution("hello"));
      assertEquals("", Kata.solution(""));
      assertEquals("h", Kata.solution("h"));
      assertEquals("selur srawedoC", Kata.solution("Codewars rules"));
    }
    
    @Test
    public void randomTests() {
      String chars = "abcdefghijklmnopqrstuvwxyz    ,./';123456789!?";
      Random random = new Random();
      
      for (int i = 0; i < 100; ++i) {
        String test = IntStream.range(1, random.nextInt(100))
          .mapToObj(x -> Character.toString(chars.charAt(random.nextInt(chars.length()))))
          .collect(Collectors.joining());
        
        String expected = _solution(test);
        String actual = Kata.solution(test);
        
        assertEquals(expected, actual);
        }
      }
    }
}

*/
