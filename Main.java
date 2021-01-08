import java.util.Stack;

class Main {
  public static void main(String[] args) {
    String string = "Reverse me!";
    System.out.println(reverseStringRec(string));
    System.out.println(reverseString(string));
  }

  public static String reverseStringRec(String s) {
    if (s.isEmpty()) {
      return s; 
    }

    return reverseStringRec(s.substring(1)) + s.charAt(0);
  }

  static String reverseString(String s) {
    StringBuilder reversed = new StringBuilder();

    for (int i = s.length() - 1; i >= 0; --i) {
      reversed.append(s.charAt(i));
    }

    return reversed.toString();
  }
}