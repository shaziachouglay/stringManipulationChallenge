package generals;

import org.junit.Test;

public class WhenGivingOrders {

    @Test
    public void a_general_can_give_orders(){
        //this is an example of poor design
        General general  = new General("George");
        Officer ollie = new Officer("Ollie");
        Officer orla = new Officer("Orla");
        general.commands(ollie,orla);
    }

    @Test
    public void a_general_can_delegate_orders(){
        // this is an example of a good design
        General general  = new General("George");
        Officer ollie = new Officer("Ollie");
        Officer orla = new Officer("Orla");
        general.commands(ollie,orla);

        Order marchForward = new MarchForward();
        Order marchBackward = new MarchBackward(100);
        general.ordersHisSubOrdinatesTo(marchForward,marchBackward);
        general.ordersHisSubOrdinatesTo(officer -> {
            System.out.println(officer + " " + "Clean barracks");
        });
    }

}
