package cn.augusto.ch2.prepost;

public class BeanService {
  public void init(){
    System.out.println(this.getClass().getCanonicalName() + " -> init");
  }

  public BeanService(){
    super();
    System.out.println(this.getClass().getCanonicalName() + " -> construction");
  }

  public void preDes(){
    System.out.println(this.getClass().getCanonicalName() +"pre deconstruction");
  }
}
