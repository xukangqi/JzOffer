public class Solution {
  public int FirstNotRepeatingChar(String str) {
    int[] array = new int[256];
    for (int i = 0; i < str.length(); i++) {
      array[str.charAt(i)]++;
    }
    for (int i = 0; i < str.length(); i++) {
      if (array[str.charAt(i)] == 1) {
        return i;
      }
    }
    return -1;
  }
}