package cn.augusto.spdemo.aop;

/**
 * @Author: Augusto
 * @Description:
 * @Date: Created in 14:24 2018/7/4
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


class Node {
  int val = 0;
  Node left = null, right = null;
  
  public Node(int v) {
    val = v;
  }
  
  public boolean isLeaf() {
    return left == null && right == null;
  }
  public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    List<Integer> arr = new ArrayList<>();
    long sum = 0;
    for(int i =0; i != n; ++i){
      arr.add( scanner.nextInt());
      sum += arr.get(i);
    }
    
    Collections.sort(arr);
    double mean = (double)sum / n;
    double median = 0;
    if(n % 2 == 0){
      median = (double)(arr.get(n / 2)+arr.get(n / 2 - 1)) / 2;
    }
    else{
      median = (double)arr.get(n / 2);
    }
    
    int k = arr.get(0), v = 1;
    int fk = 0, fv = 0;
    for(int i = 1; i != arr.size(); ++i){
      if(arr.get(i) == k) {
        v++;
      }
      else{
        if(v > fv) {
          fv = v;
          fk = k;
        }
        k = arr.get(i);
        v = 1;
      }
    }
    System.out.println(mean);
    System.out.println(median);
    System.out.println(fk);
    
  }
}


public class Solution {
  
  /*
   * Complete the swapNodes function below.
   */
  
  static Node[] buildTree(int[][] indexes) {
    Node[] nodes = new Node[indexes.length + 1];
    
    
    for (int i = 0; i < indexes.length; ++i) {
      nodes[i + 1] = new Node(i + 1);
      if (indexes[i][0] != -1) {
        Node l = new Node(indexes[i][0]);
        nodes[indexes[i][0]] = l;
        nodes[i+1].left = l;
      }
      if (indexes[i][1] != -1) {
        Node r = new Node(indexes[i][0]);
        nodes[indexes[i][1]] = r;
        nodes[i+1].right = r;
      }
    }
    return nodes;
  }
 
  static List<Integer> traveseTree(Node root){
    List<Integer> arr = new ArrayList<Integer>();
    Stack<Node> s = new Stack<Node>();
    Node p = root;
    do {
      while (p != null) {
        s.push(p);
        p = p.left;
      }
      p = s.pop();
      arr.add(p.val);
      if (p.right != null) {
        p = p.right;
      }
      else p = null;
    } while(p != null || !s.empty());
    return arr;
  }
  
  static int[][] swapNodes(int[][] indexes, int[] queries) {
        /*
         * Write your code here.
         */
        Node[] tree = buildTree(indexes);
    //TODO
    return new int[0][0];
  }
  
  
  static int[] dynamicArray(int n, int[][] queries) {
        /*
         * Write your code here.
         */
    ArrayList<Integer> res = new ArrayList<>();
    List<Integer>[] seqList = new ArrayList[n];
    for(int i = 0; i!= n; ++i){
      seqList[i] = new ArrayList<Integer>();
    }
    int lastAnswer = 0;
    for(int i = 0; i != queries.length; ++i){
      if(queries[i][0] == 1){
        int index = (queries[i][1] ^ lastAnswer) % n;
        seqList[index].add(queries[i][2]);
      }
      else{
        int index = (queries[i][1] ^ lastAnswer) % n;
        lastAnswer = seqList[index].get(queries[i][2] % seqList[index].size());
        res.add(lastAnswer);
      }
    }
    int[] arr = new int[res.size()];
    for(int i = 0; i != res.size(); ++i){
      arr[i] = res.get(i);
    }
    return arr;
  }
  
  private static final Scanner scanner = new Scanner(System.in);
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
    
    int n = Integer.parseInt(scanner.nextLine().trim());
    
    int[][] indexes = new int[n][2];
    
    for (int indexesRowItr = 0; indexesRowItr < n; indexesRowItr++) {
      String[] indexesRowItems = scanner.nextLine().split(" ");
      
      for (int indexesColumnItr = 0; indexesColumnItr < 2; indexesColumnItr++) {
        int indexesItem = Integer.parseInt(indexesRowItems[indexesColumnItr].trim());
        indexes[indexesRowItr][indexesColumnItr] = indexesItem;
      }
    }
    
    int queriesCount = Integer.parseInt(scanner.nextLine().trim());
    
    int[] queries = new int[queriesCount];
    
    for (int queriesItr = 0; queriesItr < queriesCount; queriesItr++) {
      int queriesItem = Integer.parseInt(scanner.nextLine().trim());
      queries[queriesItr] = queriesItem;
    }
    
    int[][] result = swapNodes(indexes, queries);
    
    for (int resultRowItr = 0; resultRowItr < result.length; resultRowItr++) {
      for (int resultColumnItr = 0; resultColumnItr < result[resultRowItr].length; resultColumnItr++) {
        bufferedWriter.write(String.valueOf(result[resultRowItr][resultColumnItr]));
        
        if (resultColumnItr != result[resultRowItr].length - 1) {
          bufferedWriter.write(" ");
        }
      }
      
      if (resultRowItr != result.length - 1) {
        bufferedWriter.write("\n");
      }
    }
    
    bufferedWriter.newLine();
    
    bufferedWriter.close();
  }
}
