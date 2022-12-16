import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        //Задание1
        Human Alan=new Human();
        Alan.set_human("Алан","Уокер",2002);
        System.out.println(Alan.Info());

        //задание 2

        System.out.println("Введите катет №1:");
        double catet1= scr.nextDouble();
        System.out.println("Введите катет №2:");
        double catet2= scr.nextDouble();
        RightTriangle A=new RightTriangle(catet1,catet2);
        System.out.println("Гипотенуза катетов равна:"+A.get_hyp());

        //Задание3
        System.out.println("\nВведите массу:");
        float m=scr.nextFloat();
        System.out.println("Введите высоту:");
        float H=scr.nextFloat();
        PotentialEnergy Energy=new PotentialEnergy();
        Energy.set_H(H);
        Energy.set_m(m);
        System.out.println("Потенциальная энергия при массе и высоте: "+Energy.get_m()+" ; "+Energy.get_H()+"\nРавна:"+Energy.get_potential_Energy());

    }


}

