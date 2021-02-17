package list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class WhenSortingMixList {


    @Test
    public void shdCheckThatAnEmptyListIscorrectlySorted(){
        List<String> emptyList = new ArrayList<>();
        List<String> correctlySortedList = ListChecker.correctlySortedListOf(emptyList);

        assertThat(correctlySortedList).containsExactlyElementsOf(emptyList);
    }
    @Test
    public void shdCheckThatAListOfNormalStrings(){
        List<String> someStrings = new ArrayList<>();
        someStrings.add("cat");
        someStrings.add("lion");
        someStrings.add("apple");

        List<String> correctlySorted = ListChecker.correctlySortedListOf(someStrings);

        assertThat(correctlySorted).containsExactlyElementsOf(asList("apple","cat","lion"));
    }
    @Test
    public void shdCheckListOfDatesAndSortInReverseOrder(){
        List<String> stringWithDates = new ArrayList<>();
        stringWithDates.add("15/04/2020");
        stringWithDates.add("20/01/2020");
        stringWithDates.add("21/01/2021");

        List<String> correctlySorted = ListChecker.correctlySortedListOf(stringWithDates);
        System.out.println(correctlySorted);

        assertThat(correctlySorted).containsExactlyElementsOf(asList("21/01/2021","15/04/2020","20/01/2020"));
    }
    @Test
    public void shdCheckListOfDatesAndListAndSortInReverseOrder(){
        List<String> stringWithDates = new ArrayList<>();
        stringWithDates.add("Did you know the word sandwich is named for a person");
        stringWithDates.add("cat 15/04/2020");
        stringWithDates.add("sat 20/01/2020");
        stringWithDates.add("hat 21/01/2021");
        stringWithDates.add("rat 02/01/2020");
        stringWithDates.add("Another random list");

        List<String> correctlySorted = ListChecker.correctlySortedListOf(stringWithDates);
        System.out.println(correctlySorted);

        assertThat(correctlySorted).containsExactlyElementsOf(asList("hat 21/01/2021","cat 15/04/2020","sat 20/01/2020","rat 02/01/2020","Another random list", "Did you know the word sandwich is named for a person"));
    }
}
