package cn.augusto;



import java.util.concurrent.ConcurrentHashMap;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");

    ConcurrentHashMap<String, String> mp = new ConcurrentHashMap<>();
    final int HASH_BITS = 0x7fffffff;
    int test = 0x1000010;
    test = (test ^ (test >>> 16)) & HASH_BITS;

    System.out.println(test);
  }
}
