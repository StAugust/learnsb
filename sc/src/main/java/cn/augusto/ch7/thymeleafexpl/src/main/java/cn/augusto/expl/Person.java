package cn.augusto.expl;

public class Person {
  private String name;
  private Integer age;

  public Person(){
    this("", 0);
  }

  public Person(String n, Integer a){
    super();
    name = n;
    age =a;
  }

  public String getName(){
    return name;
  }

  public Integer getAge(){
    return age;
  }

  public void setName(String n){
    name = n;
  }
  public void setAge(Integer a){
    age = a;
  }

}
