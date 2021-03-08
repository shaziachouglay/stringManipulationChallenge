package generals;

import java.util.Arrays;
import java.util.List;

public class General {
    private final String name;
    private List<Officer> officerList;

    public General(String name) {
        this.name = name;
    }

    public void commands(Officer...officers) {
        this.officerList = Arrays.asList(officers);
    }

    public void ordersHisSubOrdinatesTo(Order...orders) {
        for (Officer officer : officerList){
            officer.executesOrder(orders);
        }
    }
}
