package cn.augusto.hacker;


import sun.rmi.server.InactiveGroupException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.DelayQueue;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 * @Author: Augusto
 * @Description:
 * @Date: Created in 14:32 2018/7/24
 */

class Student{
  private int id;
  private String fname;
  private double cgpa;
  public Student(int id, String fname, double cgpa) {
    super();
    this.id = id;
    this.fname = fname;
    this.cgpa = cgpa;
  }
  public int getId() {
    return id;
  }
  public String getFname() {
    return fname;
  }
  public double getCgpa() {
    return cgpa;
  }
}

class Check implements Comparator<Student> {
  
  @Override
  public int compare(Student s1, Student s2){
    if(s1.getCgpa() > s2.getCgpa()){
      return -1;
    } else if(s1.getCgpa() == s2.getCgpa()){
      if(s1.getFname().compareTo(s2.getFname()) == 0){
        if(s1.getId() < s2.getId()){
          return 1;
        } else if(s1.getId() == s2.getId()){
          return 0;
        } else{
          return -1;
        }
        
      } else{
        return s1.getFname().compareTo(s2.getFname());
      }
      
      
    } else {
      return 1;
    }
  }
  
}


public class ArrayQuery {
  
  class Player {
    String name;
    int score;
    
    Player(String name, int score) {
      this.name = name;
      this.score = score;
    }
  }
  
  class Checker implements Comparator<Player> {
    
    
    @Override
    public int compare(Player o1, Player o2) {
      
      if (o1.score > o2.score) {
        return -1;
      } else if (o1.score == o2.score) {
        return o1.name.compareTo(o2.name);
      } else {
        return 1;
      }
    }
    
    @Override
    public Comparator<Player> reversed() {
      return null;
    }
    
    @Override
    public Comparator<Player> thenComparing(Comparator<? super Player> other) {
      return null;
    }
    
    @Override
    public <U> Comparator<Player> thenComparing(Function<? super Player, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
      return null;
    }
    
    @Override
    public <U extends Comparable<? super U>> Comparator<Player> thenComparing(Function<? super Player, ? extends U> keyExtractor) {
      return null;
    }
    
    @Override
    public Comparator<Player> thenComparingInt(ToIntFunction<? super Player> keyExtractor) {
      return null;
    }
    
    @Override
    public Comparator<Player> thenComparingLong(ToLongFunction<? super Player> keyExtractor) {
      return null;
    }
    
    @Override
    public Comparator<Player> thenComparingDouble(ToDoubleFunction<? super Player> keyExtractor) {
      return null;
    }
  }
  
  public static void stringsplit(String s){
    s = s.trim();
    if(s.compareTo("") == 0){
      System.out.println(0);
    }else {
      String[] arr = s.split("[ !,?._'@]+");
      System.out.println(arr.length);
      for (String o : arr) {
        System.out.println(o);
      }
    }
  }
  
  
  public static void pairSize() {
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    String[] pair_left = new String[t];
    String[] pair_right = new String[t];
    
    for (int i = 0; i < t; i++) {
      pair_left[i] = s.next();
      pair_right[i] = s.next();
    }
    
    Set<String> set = new HashSet<>();
    for (int i = 0; i < t; i++) {
      set.add(pair_left[i] + " " + pair_right[i]);
      System.out.println(set.size());
    }
    
  }
  
  public static void deque(String[] args) {
    Scanner in = new Scanner(System.in);
    Deque<Integer> deque = new ArrayDeque<>();
    int n = in.nextInt();
    int m = in.nextInt();
    Map<Integer, Integer> mp = new HashMap<>();
    int mx = 0;
    for (int i = 0; i < n; i++) {
      int num = in.nextInt();
      deque.push(num);
      mp.put(num, mp.getOrDefault(num,0) + 1);
      if(i >= m){
        int first = deque.pollLast();
        if(mp.get(first) == 1){
          mp.remove(first);
        }
        else {
          mp.put(first, mp.get(first) - 1);
        }
      }
      mx = mx > mp.size() ? mx : mp.size();
    }
    System.out.println(mx);
  }
  
  public static void manipulateList() {
    Scanner scan = null;
    try {
      scan = new Scanner(new FileInputStream("D:/input.txt"));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    int n = scan.nextInt();
    List<Integer> lst = new ArrayList<>();
    while (n-- > 0) {
      lst.add(scan.nextInt());
    }
    int q = scan.nextInt();
    while (q-- > 0) {
      String oper = "";
      while ((oper = scan.nextLine().trim()).compareToIgnoreCase("") == 0) {
        continue;
      }
      if (oper.compareToIgnoreCase("Insert") == 0) {
        int index = scan.nextInt();
        int val = scan.nextInt();
        if (index < lst.size()) lst.add(index, val);
        else lst.add(val);
      } else if (oper.compareToIgnoreCase("Delete") == 0) {
        int index = scan.nextInt();
        lst.remove(index);
      } else {
      
      }
    }
    String sep = "";
    for (int val : lst) {
      System.out.print(sep + val);
      sep = " ";
    }
    System.out.println("");
  }
  
  public static boolean canWin(int leap, int[] game) {
    // Return true if you can win the game; otherwise, return false.
    Set<Integer> stack = new HashSet<>();
    stack.add(0);
    int c = 0;
    for (int i = 0; i != game.length; ++i) {
      if (stack.contains(i)) {
        for (int j = i - 1; j > 0; j--) {
          if (game[j] == 0) {
            stack.add(j);
            if (j + leap < game.length && game[j + leap] == 0) {
              stack.add(j + leap);
            }
          } else {
            break;
          }
        }
        
        for (int j = i + 1; j < game.length; j++) {
          if (game[j] == 0) {
            stack.add(j);
          } else {
            break;
          }
        }
        if (i + leap < game.length && game[i + leap] == 0) {
          stack.add(i + leap);
        }
        
      }
    }
    int mx =
      stack.stream().max((Integer a, Integer b) -> {
        if (a > b) {
          return 1;
        } else if (a == b) {
          return 0;
        } else {
          return -1;
        }
      }).get();
    
    return mx + leap >= game.length || mx == game.length - 1;
  }
  
  public static String getDay(String day, String month, String year) {
    java.util.Calendar cal = java.util.Calendar.getInstance();
    cal.set(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(day));
    switch (cal.get(java.util.Calendar.DAY_OF_WEEK)) {
      
      case java.util.Calendar.MONDAY:
        return "MONDAY";
      case java.util.Calendar.TUESDAY:
        return "TUESDAY";
      case java.util.Calendar.WEDNESDAY:
        return "WEDNESDAY";
      case java.util.Calendar.THURSDAY:
        return "THURSDAY";
      case java.util.Calendar.FRIDAY:
        return "FRIDAY";
      case java.util.Calendar.SATURDAY:
        return "SATURDAY";
      case java.util.Calendar.SUNDAY:
        return "SUNDAY";
      default:
        return "SUNDAY";
    }
    
  }
  
  public static void main(String[] argh) {
    
    stringsplit("");
    
    deque(argh);
  
    List<Student> studentList = new ArrayList<Student>();
    Check c = new Check();
    Collections.sort(studentList, c);
    
    
    manipulateList();
    try {
      Scanner scan = new Scanner(new FileInputStream("D:/input.txt"));
      int q = scan.nextInt();
      while (q-- > 0) {
        int n = scan.nextInt();
        int leap = scan.nextInt();
        
        int[] game = new int[n];
        for (int i = 0; i < n; i++) {
          game[i] = scan.nextInt();
        }
        
        System.out.println((canWin(leap, game)) ? "YES" : "NO");
      }
      
      
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
