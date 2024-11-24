package designPattern.observerPattern.observer;

import designPattern.observerPattern.observables.StocksObservable;

public class MobileAlertObservableImpl implements NotificationAlertObserver{

    int mobileNumber;
    StocksObservable observable;

    public MobileAlertObservableImpl(int mobileNumber, StocksObservable observable){
        this.mobileNumber = mobileNumber;
        this.observable = observable;
    }

    @Override
    public void update() {
        String msg = "product is in stock";
        sendEmail(mobileNumber, msg);
    }

    public void sendEmail(int mobileNumber, String msg){
        System.out.println("SMS sent to " + mobileNumber + " " + msg);
    }
}
