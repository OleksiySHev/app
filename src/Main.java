import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalQuestions = 5;
        int score = 0;
        System.out.println("Welcome to the test");
        String[] questions = new String[]{"Столиця України?", "Як звали матір Лесі Українки?", "Де народився Тарас Шевченко", "Націолнальна страва України", "Хто написав вірш Заповіт"};
        String[] options = new String[]{"a) Харків\nb) Одеса\nс) Київ\nd) Суми", "a) Тетяна Бондар\nb) Олена Петрівна\nc) Олеся Муха\nd) Олена Пчілка", "a) в селі Моринці\nb) у Львові\nc) у Києві\nd) в Одесі", "a) Галушки\nb) Борщ\nc) Пельмені\nd) Хліб", "a) Леся Українка\nb) Ольга Кобилянська\nc) Іван Франко\nd) Тарас Шевченко"};
        String[] correctAnswers = new String[]{"c", "d", "a", "b", "d"};


        for(int i = 0; i < totalQuestions; ++i) {
            System.out.println("Питання " + (i + 1) + ":");
            System.out.println(questions[i]);
            System.out.println(options[i]);
            String userAnswer = scanner.nextLine().toLowerCase();
            if (userAnswer.equals("q")) {
                System.out.println("Дякую за відповідь!");
                return;
            }

            while(!userAnswer.matches("[abcd]")) {
                System.out.println("Невірно введені дані. Напишіть вірні букви");
                userAnswer = scanner.nextLine().toLowerCase();
            }

            if (userAnswer.equals(correctAnswers[i])) {
                ++score;
            }

            System.out.println();
        }

        System.out.println("Опитування складено");
        System.out.println("К-сть правильних відповідей " + score + " вийти " + totalQuestions);
        double percentage = (double)score / (double)totalQuestions * 100.0;
        System.out.println("Відсоток правильних відповідей " + percentage + "%");
        System.out.println("\nAdministrator View:");
        System.out.println("Введіть пароль, щоб переглянути відповіді");
        String password = scanner.nextLine();
        if (password.equals("1111")) {
            System.out.println("Правильні відповіді");

            for(int i = 0; i < totalQuestions; ++i) {
                System.out.println("Питання " + (i + 1) + ": " + correctAnswers[i]);
            }
        } else {
            System.out.println("Невірний пароль. Неможливо переглянути відповіді");
        }
    }
}