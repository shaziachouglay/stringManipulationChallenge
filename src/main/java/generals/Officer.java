package generals;

public class Officer {
    @Override
    public String toString() {
        return name;
    }

    private final String name;

    public Officer(String name) {
        this.name = name;
    }

    public void executesOrder(Order... orders) {
        for (Order order : orders){
            order.perform(this);
        }
    }
}
