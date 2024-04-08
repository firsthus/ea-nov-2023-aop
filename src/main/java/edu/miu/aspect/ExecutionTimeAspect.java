package edu.miu.aspect;

import edu.miu.entity.ActivityLog;
import edu.miu.repository.ActivityLogRepository;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Aspect
@Component
@RequiredArgsConstructor
public class ExecutionTimeAspect {

    private final ActivityLogRepository activityLogRepository;

    @Around("@annotation(ExecutionTime)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {

        long startTime = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        long executionTime = System.currentTimeMillis() - startTime;

        ActivityLog activityLog = new ActivityLog();
        activityLog.setDate(LocalDateTime.now());
        activityLog.setOperation(joinPoint.getSignature().getName());
        activityLog.setDuration(executionTime);
        activityLogRepository.save(activityLog);

        return proceed;
    }
}
