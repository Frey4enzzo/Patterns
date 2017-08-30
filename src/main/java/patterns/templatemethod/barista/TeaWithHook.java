package patterns.templatemethod.barista;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffeineBeverageWithHook{

    @Override
    void brew() {
        System.out.println("Завариваем чай");
    }

    @Override
    void addCondiments() {
        System.out.println("Добавляем лимончик");
    }

    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("Вы хотите добавить лимон в чай (yes/no)?");

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
