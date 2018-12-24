package cn.augusto.websockexpl;


public class WsRsp {
  private String rspMsg;
  public WsRsp(String msg){
    rspMsg = msg;
  }

  public String getRspMsg() {
    return rspMsg;
  }

  public void setRspMsg(String rspMsg) {
    this.rspMsg = rspMsg;
  }
}
