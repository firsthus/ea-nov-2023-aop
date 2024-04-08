package edu.miu.aspect;

import edu.miu.exception.AopIsAwesomeHeaderException;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Aspect
@Component
@RequiredArgsConstructor
public class AopIsAwesomeHeaderAspect {

    private final HttpServletRequest request;

    @Before("execution(* edu.miu.service.*.*(..)) && @within(org.springframework.web.bind.annotation.RestController)")
    public void checkAopIsAwesomeHeader(JoinPoint joinPoint) {
        if (request.getMethod().equalsIgnoreCase("POST")) {
            String headerValue = request.getHeader("AOP-IS-AWESOME");
            if (!StringUtils.hasText(headerValue)){
                throw new AopIsAwesomeHeaderException();
            }
        }
    }
}

