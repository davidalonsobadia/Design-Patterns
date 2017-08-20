package pattern.behavioral.strategy;

public class StrategyPatternDemo {

    public static void main(String[] args){
        Strategy sum = new OperationAdd();
        Strategy substract = new OperationSubstract();
        Strategy multiply = new OperationMultiply();

        Context context = new Context(sum);
        System.out.println(context.executeStrategy(3,2));

        context = new Context(substract);
        System.out.println(context.executeStrategy(3,2));

        context = new Context(multiply);
        System.out.println(context.executeStrategy(3,2));

    }
}
