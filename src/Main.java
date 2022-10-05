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
        //задание 4
        System.out.println(" ");
        int age2 = 25;
        boolean goToKindergarten = age2 <= 6 && age2 >= 2;
        boolean goToSchool = age2 < 18 && age2 > 6;
        if (age2 <= 24) {
            if (age2 >= 18 && age2 <= 24) {
                System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в универ");
            } else if (goToKindergarten) {
                System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в садик");
            } else if (goToSchool) {
                System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу");
            }
        } else {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить на работу");
        }
        //задание 5
        System.out.println(" ");
        int age3 = 15 ;
        boolean canNotRideRides = age3 <= 5;
        boolean canGoOnRidesWithYourParents = age3 > 5 || age3 <= 14;
        if (age3 <= 14) {
            if (canNotRideRides) {
                System.out.println("Тебе нельзя кататься на аттракционах");
            } else if (canGoOnRidesWithYourParents) {
                System.out.println("Тебе можно кататься на аттракионах только с сопровождением взрослых");
            }
        } else {
            System.out.println("Тебе можно кататься без сопровождения взрослых");
        }
        //задание 6
        System.out.println(" ");
        int one = 4;
        int two = 7;
        int tree = 3;
        if ( one > two) {
            if (one > tree) {
                System.out.println("Число " + one + " максимальное");
            } else {
                System.out.println("Число " + tree + " максимальное");
            }
        } else if (two < tree) {
            System.out.println("Число " + tree + " максимальное");
        } else {
            System.out.println("Число " + two + " максимальное");
        }
    }
}

