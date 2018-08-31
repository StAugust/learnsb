package cn.augusto.spdemo.services;

import cn.augusto.spdemo.aop.AopAction;
import org.springframework.stereotype.Service;

/**
 * @Author: Augusto
 * @Description:
 * @Date: Created in 17:52 2018/7/3
 */
@Service
public class DemoAnnService {
  @AopAction(name = "filter add")
  public void add(){}
}
