package cn.augusto.hacker.w38;

/**
 * @Author: Augusto
 * @Description:
 * @Date: Created in 18:37 2018/6/21
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinuteToWin {
  
  // Complete the minuteToWinIt function below.
  static int minuteToWinIt(int[] a, int k) {
    // Return the minimum amount of time in minutes.
    Map<Integer, Integer> mp = new HashMap<>();
    for(int i = 0; i != a.length; ++i){
      a[i] -= k*i;
      mp.put(a[i], mp.getOrDefault(a[i],0) + 1);
    }
    
    Collections.max(mp.values());
    return a.length - Collections.max(mp.values());
  }
  
  private static final Scanner scanner = new Scanner(System.in);
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
    
    String[] nk = scanner.nextLine().split(" ");
    
    int n = Integer.parseInt(nk[0]);
    
    int k = Integer.parseInt(nk[1]);
    
    int[] a = new int[n];
    
    String[] aItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    
    for (int i = 0; i < n; i++) {
      int aItem = Integer.parseInt(aItems[i]);
      a[i] = aItem;
    }
    
    int result = minuteToWinIt(a, k);
    
    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();
    
    bufferedWriter.close();
    
    scanner.close();
  }
}
