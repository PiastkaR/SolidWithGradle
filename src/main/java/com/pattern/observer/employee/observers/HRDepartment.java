package com.pattern.observer.employee.observers;

import com.pattern.observer.employee.domain.Employee;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HRDepartment implements IObserver {
    @Override
    public void callMe(Employee employee , String msg) {
        log.info("HRDepartment notified.");
        log.info(msg + " : " + employee.getName());
        }
}
