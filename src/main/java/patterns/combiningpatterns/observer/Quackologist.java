package patterns.combiningpatterns.observer;

/**
 * НАБЛЮДАТЕЛЬ
 */
public class Quackologist implements Observer{

    @Override
    public void update(QuackObservable duck) {
        System.out.println("Утколог: " + duck + " крякнула");
    }
}
