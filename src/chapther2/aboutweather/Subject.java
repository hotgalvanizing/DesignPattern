package chapther2.aboutweather;

/**
 * Created by steel on 2019/2/6.
 */
public interface Subject
{
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
