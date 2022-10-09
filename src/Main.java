public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        //Задача 2
        System.out.println(" ");
        System.out.println("Задача 2");
        dog += 4;
        System.out.println(dog);
        cat += 4;
        System.out.println(cat);
        paper += 4;
        System.out.println(paper);

        //Задача 3
        System.out.println(" ");
        System.out.println("Задача 3");
        var dog1 = 8.0;
        dog1 = dog1 - 3.5;
        System.out.println(dog1);
        cat -= 1.6;
        System.out.println(cat);
        paper -= 7639;
        System.out.println(paper);

        //Задача 4
        System.out.println(" ");
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

        //Задача 5
        System.out.println(" ");
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

        //Задача 6
        System.out.println(" ");
        System.out.println("Задача 6");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var totalWeight = boxer1Weight + boxer2Weight;
        var diffWeight = boxer1Weight - boxer2Weight;
        System.out.println("Общий вес двух бойцов: " + totalWeight + " кг");
        System.out.println("Разница между весами бойцов: " + Math.abs(diffWeight) + " кг");

        //Задача 7
        System.out.println(" ");
        System.out.println("Задача 7");
        System.out.println("Разница между весами бойцов (1 способ): " + Math.abs(boxer1Weight - boxer2Weight) + " кг");
        System.out.println("Разница между весами бойцов (2 способ): " + (boxer2Weight % boxer1Weight) + " кг");

        //Задача 8
        System.out.println(" ");
        System.out.println("Задача 8");
        var totalWorkingHours = 640; // Всего часов работы поделено между сотрудниками
        var hoursPerDay = 8;         // Каждый сотрудник посвящает работе 8 часов
        var totalWorker = totalWorkingHours / hoursPerDay;
        System.out.println("Всего работников в компании – " + totalWorker + " человек");
        totalWorker += 94;
        totalWorkingHours = totalWorker * hoursPerDay;
        System.out.println("Если в компании работает " + totalWorker + " человек, то всего " + totalWorkingHours + " часов работы может быть поделено между сотрудниками");

    }
}