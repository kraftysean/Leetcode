class P389_MissingChar {

    public char findTheDifference(String s, String t) {
        int sum = t.charAt(t.length() - 1);
        for(int i = 0; i < s.length(); i++) {
            sum ^= s.charAt(i);
            sum ^= t.charAt(i);
        }
        return (char)sum;
    }
}
