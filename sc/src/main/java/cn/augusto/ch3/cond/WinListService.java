package cn.augusto.ch3.cond;

import org.springframework.stereotype.Component;

//@Component
public class WinListService implements ListService {
  @Override
  public String showListCommand() {
    return "dir";
  }
}
