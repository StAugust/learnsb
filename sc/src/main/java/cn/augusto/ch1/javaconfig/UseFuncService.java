package cn.augusto.ch1.javaconfig;

public class UseFuncService {
  FuncService fs;
  public void setFs(FuncService fs){
    this.fs = fs;
  }

  public String SayHello(String word){
    return fs.sayHello(word);
  }

}
