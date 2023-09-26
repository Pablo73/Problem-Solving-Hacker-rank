import java.util.Stack;

public class IsBalanced {

  public static String isBalanced(String s) {
  Stack<Character> openBracket = new Stack<>();

      for (int i = 0; i < s.length(); i++) {
    if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i)== '(') {
      openBracket.push(s.charAt(i));
      continue;
    }
    if (openBracket.isEmpty()) {
      return "NO";
    }
    if (s.charAt(i) == '}' && openBracket.peek() == '{') {
      openBracket.pop();
      continue;
    }
    if (s.charAt(i) == ']' && openBracket.peek() == '[') {
      openBracket.pop();
      continue;
    }
    if (s.charAt(i) == ')' && openBracket.peek() == '(') {
      openBracket.pop();
      continue;
    }
        return "NO";
  }

      if(openBracket.isEmpty()) {
        return "YES";
      }

    return "NO";
}

}
