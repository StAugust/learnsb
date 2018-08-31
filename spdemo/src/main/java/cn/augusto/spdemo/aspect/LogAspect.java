package cn.augusto.spdemo.aspect;

import cn.augusto.spdemo.aop.AopAction;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Author: Augusto
 * @Description:
 * @Date: Created in 17:54 2018/7/3
 */
@Aspect
@Component
public class LogAspect {
  @Pointcut("@annotation(cn.augusto.spdemo.aop.AopAction)")
  public void annotationPointCut(){}
  
  @After("annotationPointCut()")
  public void after(JoinPoint jp){
    MethodSignature signature = (MethodSignature)jp.getSignature();
    Method method = signature.getMethod();
    AopAction action = method.getAnnotation(AopAction.class);
    System.out.println("After -> " + action.name());
  }
  
  @Before("execution(* cn.augusto.spdemo.services.DemoMethodService.add(..))")
  public void before(JoinPoint jp){
    MethodSignature signature = (MethodSignature)jp.getSignature();
    Method method = signature.getMethod();
    System.out.println("Before -> " + jp.getTarget().getClass().getCanonicalName() + " --> " + method.getName());
  }
}
