package generals;

public class MarchForward implements Order {
    @Override
    public void perform(Officer officer) {
        System.out.println(officer + " "+ "marches forward");
    }
}
