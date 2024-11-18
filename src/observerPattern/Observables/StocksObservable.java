package observerPattern;

import java.util.ArrayList;

public interface Observable {

    public void add(Observer observer);
    public void remove(Observer observer);
    public void notifyAll();
    public void setData(int data);



}
