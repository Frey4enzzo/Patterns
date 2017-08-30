package patterns.templatemethod.barista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook{

    @Override
    void brew() {
        System.out.println("Пропускаем кофеек через фильтр");
    }

    @Override
    void addCondiments() {
        System.out.println("Добавляем сахарок и молочко");
    }

    // переопределяем перехватчик и задаем нужную функциональность
    boolean customerWantsCondiments() {
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    // спрашиваем пользователя нужны ли ему добавки
    private String getUserInput() {
        String answer = null;

        System.out.println("Вы хотите добавить молоко и сахар в кофе? (yes/no)?");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            answer = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (answer == null) return "no";

        return answer;
    }
}
