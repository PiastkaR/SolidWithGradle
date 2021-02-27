package com.pattern.observer.employee.subjects;

import com.pattern.observer.employee.observers.IObserver;

public interface ISubject {
    void registerObserver(IObserver o);

    void removeObserver(IObserver o);

    void notifyObservers();
}
