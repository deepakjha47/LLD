package designPattern.observerPattern.observables;

import designPattern.observerPattern.observer.NotificationAlertObserver;

public interface StocksObservable {

    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);

    public void setData(int data);
    public void notifyObserver();



}
