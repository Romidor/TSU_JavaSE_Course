package local.leo.study.javase;

public class Animal2 implements Voice, Wings {
    @Override
    public void voice() {
        System.out.println("Animal2 buzzes");
    }

    @Override
    public void flap() {
        System.out.println("Yes, it does flap");
    }
}
