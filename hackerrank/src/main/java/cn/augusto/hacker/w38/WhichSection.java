package cn.augusto.hacker.w38;

/**
 * @Author: Augusto
 * @Description:
 * @Date: Created in 18:31 2018/6/21
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WhichSection {
  
  // Complete the whichSection function below.
  static int whichSection(int n, int k, int[] a) {
    // Return the section number you will be assigned to assuming you are student number k.
    for(int i = 0; i != a.length; ++i){
      if(k - a[i] <= 0){
        return i + 1;
      }
      else{
        k -= a[i];
      }
    }
    return a.length;
  }
  
  private static final Scanner scanner = new Scanner(System.in);
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
    
    int t = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    
    for (int tItr = 0; tItr < t; tItr++) {
      String[] nkm = scanner.nextLine().split(" ");
      
      int n = Integer.parseInt(nkm[0]);
      
      int k = Integer.parseInt(nkm[1]);
      
      int m = Integer.parseInt(nkm[2]);
      
      int[] a = new int[m];
      
      String[] aItems = scanner.nextLine().split(" ");
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
      
      for (int i = 0; i < m; i++) {
        int aItem = Integer.parseInt(aItems[i]);
        a[i] = aItem;
      }
      
      int result = whichSection(n, k, a);
      
      bufferedWriter.write(String.valueOf(result));
      bufferedWriter.newLine();
    }
    
    bufferedWriter.close();
    
    scanner.close();
  }
}

