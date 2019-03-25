package builtuser;

/**
 * 描述:
 *
 * @author dong
 * @create 2019-03-24 20:01
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
