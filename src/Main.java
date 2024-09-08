public class Main {

    public static void main(String[] args) {
// задача 1
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            if (age < 18) {
                System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
            }
        }
        // задача 2
        int temperature = 30;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            if (temperature > 5) {
                System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
            }
// задача 3
            int speed = 61;
            if (speed <= 60) {
                System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
            } else {
                if (speed > 60) {
                    System.out.println("Если скорость " + speed + ", то придется заплатить штраф");

                }
            }
        }
        // задача 4
        int years = 28;
        if (years >= 2 && years <= 6) {
            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить в детский сад");
        }
        if (years >= 7 && years <= 17) {
            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить в школу");
        }
        if (years >= 18 && years <= 24) {
            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить в университет");
        } else if (years > 24) {
            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить на работу");
        }
// задача 5
        int yearsOld = 5;
        if (yearsOld < 5) {
            System.out.println("Если возраст ребенка равен " + yearsOld + ", то ему нельзя кататься на аттракционе");
        }
        if (yearsOld >= 5 && yearsOld <= 14) {
            System.out.println("Если возраст ребенка равен " + yearsOld + ", то можно кататься на аттракционе в сопровождении взрослого");
        } else if (yearsOld > 14) {
            System.out.println("Если возраст ребенка равен " + yearsOld + ", то можно кататься на аттракционе без сопровождения взрослого");
        }
// задача 6
        int places = 16;
        if (places < 60) {
            System.out.println("Если занято " + places + ", то есть сидячие места");
        }
        if (places >= 60 && places <= 102) {
            System.out.println("Если занято " + places + ", то есть только стоячие места");
        } else if (places >= 102) {
            System.out.println("Вагон полностью забит");
        }
//задача 7
        int one = 1;
        int two = 2;
        int three = 3;

        if (one >= two && one >= three) {
            System.out.println("Большим числом является " + one);
        }
        if (two >= three && two >= one) {
            System.out.println("Большим числом является " + two);
        } else if (three >= one && three >= two) ;
        System.out.println("Большим числом является " + three);
    }

}


