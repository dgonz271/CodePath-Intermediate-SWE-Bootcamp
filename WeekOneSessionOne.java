class WeekOneSessionOne {
  public static void main(String[] args) {
    String wordInput = "hello!";
    reverseString(wordInput);
    substringExists("labratory", "rat");
  }

  public static String reverseString(String wordInput) {
    StringBuilder reversed = new StringBuilder();

    for (int i = wordInput.length() - 1; i > -1; i--) {
      reversed.append(wordInput.charAt(i));
    }

    System.out.println(reversed);
    return reversed.toString();
  }

  public static boolean substringExists(String word, String substring) {
    boolean result = false;
    if (substring.length() < 1) {
      System.out.println(result);
      return result;
    }

    int substringIndex = 0;
    char tempSubstringChar = substring.charAt(substringIndex);
    for (int i = 0; i < word.length(); i++) {

      while (tempSubstringChar == word.charAt(i)) {
        if (substringIndex >= substring.length() - 1 && i <= word.length()) {
          result = true;
          break;
        } else {
          i++;
          substringIndex++;
          tempSubstringChar = substring.charAt(substringIndex);

          if (i >= word.length())
            break;
        }
      }
      if (substringIndex < substring.length()) {
        tempSubstringChar = substring.charAt(0);
        substringIndex = 0;
      }
    }

    System.out.println(result);
    return result;
  }
}
