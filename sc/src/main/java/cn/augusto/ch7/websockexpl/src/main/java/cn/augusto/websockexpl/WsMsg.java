package cn.augusto.websockexpl;

public class WsMsg {
  private String msg;

  public WsMsg(String s){
    super();
    msg = s;
  }

  public WsMsg(){
    this("");
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String m){
    msg = m;
  }
}
