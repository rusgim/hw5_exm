public class Main {

    public static void main(String[] args) {
        // задание 1
        int age = 25;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }
        // задание 2
        System.out.println(" ");
        int age1 = 6;
        if (age1 >= 7) {
            if (age1 <= 23) {
                if (age1 <= 17) {
                    System.out.println("человек ходит в школу");
                } else {
                    System.out.println("Человек ходит в универ");
                }
            } else {
                System.out.println("Человеку пора искать работу");
            }
        } else {
            System.out.println("Ребенок ходит в садик");
        }
        //задание 3
        System.out.println(" ");
        byte place = 61;
        if (place >= 61) {
            if (place <= 102) {
                System.out.println("У вас стоячее место");
            } else {
                System.out.println("Свободных мест не осталось");
            }
        } else {
            System.out.println("У вас сидячее место");
        }
    }
}

