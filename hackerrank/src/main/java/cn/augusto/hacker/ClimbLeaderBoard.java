package cn.augusto.hacker;

/**
 * @Author: Augusto
 * @Description:
 * @Date: Created in 17:01 2018/6/21
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class ClimbLeaderBoard {
  
  // Complete the climbingLeaderboard function below.
  static int findRank(int[] arr, int len, int target){
    if( target >= arr[0]){
      return 1;
    }
    else if(target < arr[len - 1]){
      return len +1;
    }
    else{
      int s = 0, e = len;
      while( e -s > 1){
        int mid = (s + e) / 2;
        if(arr[mid] == target){
          return mid + 1;
        }
        else if(arr[mid] > target){
          s = mid;
        }
        else{
          e = mid;
        }
      }
      return e + 1;
    }
  }
  
  static int[] climbingLeaderboard(int[] scores, int[] alice) {
    int len = 0;
    int[] uni = new int[scores.length];
    ArrayList<Integer> lst = new ArrayList<Integer>();
    for(int i = 0; i != scores.length; ++i){
      if(i == 0 || scores[i] != scores[i-1]){
        uni[len++] = scores[i];
      }
      
    }
    int[] res = new int[alice.length];
    for(int i = 0; i != alice.length; ++i){
      res[i] = findRank(uni,len, alice[i]);
    }
    return res;
  }
  
  private static final Scanner scanner = new Scanner(System.in);
  
  public static void main(String[] args) throws IOException {
    //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
  
    int scoresCount = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    
    int[] scores = new int[scoresCount];
    
    String[] scoresItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    
    for (int i = 0; i < scoresCount; i++) {
      int scoresItem = Integer.parseInt(scoresItems[i]);
      scores[i] = scoresItem;
    }
    
    int aliceCount = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    
    int[] alice = new int[aliceCount];
    
    String[] aliceItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    
    for (int i = 0; i < aliceCount; i++) {
      int aliceItem = Integer.parseInt(aliceItems[i]);
      alice[i] = aliceItem;
    }
    
    int[] result = climbingLeaderboard(scores, alice);
    
    for (int i = 0; i < result.length; i++) {
      bufferedWriter.write(String.valueOf(result[i]));
      
      if (i != result.length - 1) {
        bufferedWriter.write("\n");
      }
    }
    
    bufferedWriter.newLine();
    
    bufferedWriter.close();
    
    scanner.close();
  
  
  
  
    ArrayList<String> strArr = new ArrayList<String>();
    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    String tmp = null;
    while((tmp = sc.readLine() )!= null) {
        strArr.add(tmp);
    }
    
    
    for(int i = 0 ; i != strArr.size(); ++i){
      System.out.println(i + " " + strArr.get(i));
    }
  }
}
