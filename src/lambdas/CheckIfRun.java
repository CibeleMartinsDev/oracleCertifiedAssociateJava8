package lambdas;

import interfaces.CheckTrait;

import java.util.List;

public class CheckIfRun implements CheckTrait {
    @Override
    public boolean test(Animal a) {
        return a.isCanRun();
    }
    public static void print(List<Animal> animals, CheckTrait checkTrait){
        for(Animal a : animals){
            if(checkTrait.test(a)){
                System.out.print(a.isCanRun());
            }
        }
    }
}
