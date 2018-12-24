import java.util.*;

public class Solution {
  public boolean isContinuous(int[] numbers) {
    if (numbers == null || numbers.length == 0) {
      return false;
    }
    Arrays.sort(numbers);
    int times = 0;
    int i = 0;
    for (; i < numbers.length; i++) {
      if (numbers[i] == 0) {
        times++;
      } else {
        break;
      }
    }
    int pre = i++;
    int next = pre + 1;
    int need = 0;
    while (next < numbers.length) {
      if (numbers[next] == numbers[pre]) {
        return false;
      }
      if (numbers[next] - numbers[pre] != 1) {
        need += numbers[next] - numbers[pre] - 1;
      }
      next++;
      pre++;
    }
    if (need > times) {
      return false;
    } else {
      return true;
    }
  }
}