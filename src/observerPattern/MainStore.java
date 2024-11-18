package observerPattern;

import observerPattern.observables.IphoneObservableImpl;
import observerPattern.observables.StocksObservable;
import observerPattern.observer.EmailNotificationObserverImpl;
import observerPattern.observer.MobileAlertObservableImpl;
import observerPattern.observer.NotificationAlertObserver;

public class MainStore {
    public static void main(String[] args) {

        StocksObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver notificationAlertObserver = new EmailNotificationObserverImpl(
                "djha9486", iphoneStockObservable);
        NotificationAlertObserver notificationAlertObserver2 = new EmailNotificationObserverImpl(
                "dj", iphoneStockObservable);
        NotificationAlertObserver notificationAlertObserver3 = new MobileAlertObservableImpl(
                1234567809, iphoneStockObservable);
        iphoneStockObservable.add(notificationAlertObserver);
        iphoneStockObservable.add(notificationAlertObserver2);
        iphoneStockObservable.add(notificationAlertObserver3);

        iphoneStockObservable.setData(10);

    }
}
