package predicates;

import interfaces.CheckTrait;
import lambdas.Animal;

import java.util.List;
import java.util.function.Predicate;

public class CheckifJump  {

    public static void print(List<Animal> animals, Predicate<Animal> check){
        for(Animal a : animals){
            if(check.test(a)){
                System.out.print(a.isCanJump());
            }
        }
    }
}
