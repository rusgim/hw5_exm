public class Main {
    public static void main(String[] args) {
        // задание 1
        int age = 18;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }
        // задание 2
        int age1 = 7;
        if (age1 >= 18) {
            if (age1 < 24)
            System.out.println("Человек уже закончил школу и может отправляться в университет");
            if (age1 >= 24) {
                System.out.println("Пора искать работу");
            }
        }
        if (age1 < 18) {
            if (age1 >= 7) {
                System.out.println("Ребенок ходит в школу");
            }
            if (age1 < 7) {
                System.out.println("Ребенок ходит в садик");
            }
        }
    }
}