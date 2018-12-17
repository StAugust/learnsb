package cn.augusto.ch1.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class LogAspect {
  @Pointcut("@annotation(cn.augusto.ch1.aop.Action)")
  public void annotationPointCut(){}

  @After("annotationPointCut()")
  public void after(JoinPoint pt){
    MethodSignature signature = (MethodSignature)pt.getSignature();
    Method method = signature.getMethod();
    Action action = method.getAnnotation(Action.class);
    System.out.println("after " + action.name());
  }

  @Before("annotationPointCut()")
  public void before(JoinPoint pt){
    MethodSignature signature = (MethodSignature)pt.getSignature();
    Method method = signature.getMethod();
    Action action = method.getAnnotation(Action.class);
    System.out.println("before " + action.name());
  }

  @Around("annotationPointCut()")
  public void around(ProceedingJoinPoint pt) throws Throwable {
    MethodSignature signature = (MethodSignature)pt.getSignature();
    Method method = signature.getMethod();
    Action action = method.getAnnotation(Action.class);
    System.out.println("around before" + action.name());
    pt.proceed();
    System.out.println("around after " + action.name());
  }



  @After("execution(void cn.augusto.ch1.aop.DemoMethodService.*(..))")
  public void afterMethod(JoinPoint pt){
    MethodSignature signature = (MethodSignature)pt.getSignature();
    Method method = signature.getMethod();
    System.out.println("after " + method.getName());
  }

  @Before("execution(* cn.augusto.ch1.aop.DemoMethodService.*(..))")
  public void beforeMethod(JoinPoint pt){
    MethodSignature signature = (MethodSignature)pt.getSignature();
    Method method = signature.getMethod();
    System.out.println("before " + method.getName());
  }

  @Around("execution(* cn.augusto.ch1.aop.DemoMethodService.*(..))")
  public void aroundMethod(ProceedingJoinPoint pt) throws Throwable {
    MethodSignature signature = (MethodSignature)pt.getSignature();
    Method method = signature.getMethod();
    System.out.println("around before " + method.getName());
    pt.proceed();
    System.out.println("around after " + method.getName());

  }



}
