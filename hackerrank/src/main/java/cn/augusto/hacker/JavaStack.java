package cn.augusto.hacker;

import java.util.*;

/**
 * @Author: Augusto
 * @Description:
 * @Date: Created in 18:05 2018/6/21
 */
public class JavaStack {
  

  static boolean check(String str){
    ArrayList<Character> arr = new ArrayList();
    try {
      for (int i = 0; i != str.length(); ++i) {
        if ((str.charAt(i) == ']' && arr.get(arr.size() - 1) == '[') ||
          (str.charAt(i) == ')' && arr.get(arr.size() - 1) == '(') ||
          (str.charAt(i) == '}' && arr.get(arr.size() - 1) == '{')) {
          arr.remove(arr.size() - 1);
        } else if (str.charAt(i) == ')' || str.charAt(i) == ']' || str.charAt(i) == '}') {
          return false;
        } else {
          arr.add(str.charAt(i));
        }
      }
      return arr.size() == 0;
    }catch (Exception e){
      return false;
    }
  }
  
  public static void main(String []argh)
  {
    Scanner sc = new Scanner(System.in);
    
    while (sc.hasNext()) {
      String input=sc.next();
      //Complete the code
      System.out.println(check(input));
    }
    
  }
}
