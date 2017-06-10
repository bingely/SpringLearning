package main.com.bingley.spring.aop;

import com.bingley.spring.aop.Action;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 编写切面
 * Author:  Mr.bingley
 * Version:
 * Date:  2017/6/9
 */

// 首先这里我们通过@AspectJ注解声明该类是一个切面，然后添加的@Component注解让这个切面成为Spring容器管理的Bean。
// @PointCut声明的是一个切点，这个切点是所有使用了@Action注解的方法。然后我们通过@After声明一个建言，使用@PointCut定义的切点。当然我们也可以通过方法规则来设置切点
@Aspect
@Component
public class LogAspect {
    @Pointcut("@annotation(org.sang.Action)")
    public void annotationPointCut() {

    }

    //after表示先执行方法，后拦截，before表示先拦截，后执行方法
//    @Before("annotationPointCut()")
    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截:" + action.name());
    }

    /**
     * 第一个星号表示返回类型，×表示所有类型，注意第一个星号和包名之间有空格
     * 后面的星号表示任意字符
     * 两个点表示任意个参数
     * <p>
     * 参考  http://www.cnblogs.com/yansum/p/5898412.html
     *
     * @param joinPoint
     */
    @Before("execution(* org.sang.MethodService.*(..))")
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则式拦截：" + method.getName());
    }
}
