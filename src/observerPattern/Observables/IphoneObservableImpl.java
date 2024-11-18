package observerPattern.Observables;

import observerPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class IphoneStocksObservable implements StocksObservable{
    int data;
    List<Observer> list = new ArrayList<>();
    @Override
    public void add(Observer observer) {
        list.add(observer);
    }

    @Override
    public void remove(Observer observer) {
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

    }
}
