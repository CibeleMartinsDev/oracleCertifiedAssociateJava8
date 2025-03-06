import interfaces.CheckTrait;
import lambdas.Animal;
import lambdas.CheckIfRun;
import predicates.CheckifJump;

import java.util.ArrayList;
import java.util.List;

import static lambdas.CheckIfRun.print;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal(true, true));
        animals.add(new Animal(true, true));
        animals.add(new Animal(true, false));
        animals.add(new Animal(true, false));
        //lambda
         print(animals, new CheckIfRun());
        //lambda expression syntax
         print(animals, a -> a.isCanRun() && a.isCanJump());
         print(animals, a -> a.isCanRun());
        //predicates
        CheckifJump.print(animals, a -> a.isCanJump());
        /**
         * Existe um método da classe ArrayList, que recebe um Predicate como parametro
         * E remove os elementos que cumprem o predicate
         */
        animals.removeIf(a -> a.isCanJump() && a.isCanRun());

    }


}