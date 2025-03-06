package lambdas;

import interfaces.CheckTrait;

public class CheckIfRun implements CheckTrait {
    @Override
    public boolean test(Animal a) {
        return a.isCanRun();
    }
}
