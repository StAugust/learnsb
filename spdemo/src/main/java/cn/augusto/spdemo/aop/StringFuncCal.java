package cn.augusto.spdemo.aop;

/**
 * @Author: Augusto
 * @Description:
 * @Date: Created in 20:51 2018/7/4
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class StringFuncCal {
  
  // Complete the maxValue function below.
  
  static String mkStr(char c, int n) {
    String str = "";
    for (int i = 0; i != n; ++i) {
      str += c;
    }
    return str;
  }
  
  static int maxValue(String t) {
    if (t.length() == 0) {
      return 0;
    }
    char c = t.charAt(0);
    int sum = 1;
    Map<String, Integer> mp = new HashMap<>();
    for (int i = 1; i != t.length(); ++i) {
      if (t.charAt(i) != c) {
        if (sum != 1) {
          mp.put(mkStr(c, sum), mp.getOrDefault(mkStr(c, sum), 0) + 1);
        }
        c = t.charAt(i);
        sum = 1;
      }
      sum += 1;
    }
    
    if(sum != 1){
      mp.put(mkStr(c, sum), mp.getOrDefault(mkStr(c, sum), 0) + 1);
    }
    
    HashMap<Character, List<String>> kmp = new HashMap<Character, List<String>>();
    mp.keySet().forEach(key -> {
      kmp.put(key.charAt(0), kmp.getOrDefault(key.charAt(0), new ArrayList<String>()));
      kmp.get(key.charAt(0)).add(key);
    });
  
    
    int res = t.length();
    for(Character key : kmp.keySet()){
      Collections.sort(kmp.get(key));
      List<String> lst = kmp.get(key);
      for(int i = 0; i != lst.size(); ++i){
        int x = lst.get(i).length();
        int total = x * mp.get(lst.get(i));
        for(int j = i + 1; j < lst.size(); ++i){
          total += (lst.get(j).length() - x + 1) * x * mp.get(lst.get(j));
        }
        if(total > res){
          res = total;
        }
      }
    }
    return res;
  }
  
  private static final Scanner scanner = new Scanner(System.in);
  
  public static void main(String[] args) throws IOException {
    //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    String t = scanner.nextLine();
    
    int result = maxValue(t);
    
    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();
    
    bufferedWriter.close();
    
    scanner.close();
  }
}
