package observerPattern.observables;

import observerPattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable{
    int data;
    List<NotificationAlertObserver> list = new ArrayList<>();
    @Override
    public void add(NotificationAlertObserver observer) {
        list.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        list.remove(observer);
    }

    @Override
    public void setData(int data) {
        if(this.data == 0){
            notifyObserver();
        }
        this.data = data;
    }

    @Override
    public void notifyObserver() {
        for(NotificationAlertObserver observer: list){
            observer.update();
        }
    }
}
