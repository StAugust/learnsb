package cn.augusto.websockexpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.security.Principal;

@Controller
public class WsCtrl {
  @MessageMapping("/welcome")
  @SendTo("/topic/rsp")
  public WsRsp say(WsMsg msg) throws Exception{
    Thread.sleep(1000);
    return new WsRsp("welcome , " + msg.getMsg());
  }

  @Autowired
  private SimpMessagingTemplate messageTemplate;

  @MessageMapping("/chat")
  public void handleChat(Principal principal, String msg){
    if(principal.getName().equals("yjh")){
      messageTemplate.convertAndSendToUser("aug", "/queue/notifications", principal.getName() + " - send -> " + msg);
    }
    else{
      messageTemplate.convertAndSendToUser("yjh", "/queue/notifications", principal.getName() + " - send -> " + msg);

    }
  }
}
