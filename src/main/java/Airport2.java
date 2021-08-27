import com.skillbox.airport.Aircraft;
import com.skillbox.airport.Airport;

import java.util.List;
import java.util.ListIterator;

public class Airport2 {
    public static void main(String[] args) {
        Airport airport = Airport.getInstance();

        List<Aircraft> aircrafts = airport.getAllAircrafts();

        ListIterator<Aircraft> listIter = aircrafts.listIterator();
        while (listIter.hasNext()) {
            System.out.println(listIter.next());
        }

        System.out.println("Number of planes equals " + aircrafts.size());
    }
}
