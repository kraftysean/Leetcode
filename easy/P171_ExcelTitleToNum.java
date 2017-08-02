class P171_ExcelTitleToNum {

  public int titleToNumber(String s) {
      int result = 0;
      for(char c : s.toCharArray()) {
        // result += (int)Math.pow(ALPHABET_SIZE, s.length() - i - 1) * (s.charAt(i) - 'A' + 1);
        result *= 26;
        result += c - 'A' + 1;        
      }
      return result;
  }
}
