package id.ten.handlingexceptionaop;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
@Aspect
public class ExceptionLoggerPointCut {

    Logger LOG = LoggerFactory.getLogger(ExceptionLoggerPointCut.class);

    @AfterThrowing(pointcut = "execution(* id.ten.*.*.*(..))", throwing = "ex")
    public void logError(IOException ex) {
        LOG.info("IOException was happened, and handling by aop");
    }
}
