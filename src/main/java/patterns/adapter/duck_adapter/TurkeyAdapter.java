package patterns.adapter.duck_adapter;

// реализуем интерфейс типа Утка
public class TurkeyAdapter implements Duck{

    Turkey turkey;

    // в конструкторе получаем ссылку на адаптируемый объект
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
