package observerPattern.observer;

import observerPattern.observables.StocksObservable;

public class EmailNotificationObserverImpl implements NotificationAlertObserver{
    String emailId;
    StocksObservable observable;

    public EmailNotificationObserverImpl(String emailId, StocksObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmail(emailId, "product is in stock");
    }

    public void sendEmail(String emailId, String msg){
        System.out.println("Mail sent to " + emailId + " " + msg);
    }
}
