package local.leo.study.javase;

public class Animal1 implements Voice, Wool {
    @Override
    public void doSomethingWithWool() {
        System.out.println("Animal1 eats its wool");
    }

    @Override
    public void voice() {
        System.out.println("Animal1 makes weird noises");
    }
}
