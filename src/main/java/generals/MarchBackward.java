package generals;

public class MarchBackward implements Order {
    private final int distance;

    public MarchBackward(int distance) {
        this.distance = distance;
    }

    @Override
    public void perform(Officer officer) {
        System.out.println(officer + " "+ "marches backwards"+ " "+ distance + " "+ "km");
    }
}
