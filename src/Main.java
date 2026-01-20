//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("№1");
// При изменениях dog на дробное число выдавал incompatible types: possible lossy conversion double to int:20
//  С причиной так и не разобрался.
        double dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("№2");

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(+dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("№3");

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("№4 ");

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 19;
        System.out.println(friend);

        System.out.println("№5");

        var frog = 3.5;
        System.out.println(frog);
        frog = frog*10;
        System.out.println(frog);
        frog = frog/3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("№6");

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalMass = boxer1 + boxer2;
        System.out.println("общая масса " + totalMass);
        var MassDifference = boxer2 - boxer1;
        System.out.println("разница массы " + MassDifference);

        System.out.println("№7");

        var remains = boxer2 % boxer1;
        System.out.println("остаток " + remains);

        System.out.println("№8");

        var worker = 640 / 8;
        System.out.println("Всего работников в компании " + worker + " человек" );
        var workersMore = worker + 94;
        var workMore = workersMore * 8;
        System.out.println("Если в компании работает " + workersMore + " человек, то всего " + workMore + " часов работы может быть поделено между сотрудниками" );
    }
}