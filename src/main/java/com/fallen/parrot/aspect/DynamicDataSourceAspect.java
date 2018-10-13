package com.fallen.parrot.aspect;

import com.fallen.parrot.annotation.DataSource;
import com.fallen.parrot.config.DataSourceContextHolder;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class DynamicDataSourceAspect {

    //切入点只对@Service注解的类上的@DataSource方法生效
//    @Pointcut(value="@within(org.springframework.stereotype.Component) && @annotation(DataSource)")
    @Pointcut(value="@annotation(dataSource)")
    public void dynamicDataSourcePointCut(DataSource dataSource){
        System.out.println(dataSource.value());
    }

    @Before(value = "dynamicDataSourcePointCut(dataSource)")
    public void switchDataSource(DataSource dataSource) throws Throwable {
        DataSourceContextHolder.setDataSource(dataSource.value());
    }

    @After(value="dynamicDataSourcePointCut(dataSource)")
    public void after(DataSource dataSource) {
        DataSourceContextHolder.cleanDataSource();
    }
}
