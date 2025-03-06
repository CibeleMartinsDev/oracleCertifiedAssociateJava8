import interfaces.CheckTrait;
import lambdas.Animal;
import lambdas.CheckIfRun;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal(true, true));
        animals.add(new Animal(true, false));
        animals.add(new Animal(true, false));
        animals.add(new Animal(true, false));
        //lambda
        print(animals, new CheckIfRun());
        //lambda syntax
        print(animals, a -> a.isCanRun() && a.isCanJump());
        print(animals, a -> a.isCanRun());

    }

    public static void print(List<Animal> animals, CheckTrait checkTrait){
        for(Animal a : animals){
            if(checkTrait.test(a)){
                System.out.print(a.isCanRun());
            }
        }
    }
}