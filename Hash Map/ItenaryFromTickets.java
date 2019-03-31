import java.awt.SystemColor;
import java.util.*;

public class ItenaryFromTickets {

    public static ArrayList<String> getItenary(Map<String, String> map) {

        ArrayList<String> result_al = new ArrayList<String>();
        Map<String, String> reverse_map = new HashMap<String, String>();

        // Reverse Map has been initiated
        for(Map.Entry<String, String> map_entry : map.entrySet()) {
            reverse_map.put(map_entry.getValue(), map_entry.getKey());
        }

        String itenary_start = null;
        for(Map.Entry<String, String> map_entry : map.entrySet()) {
            // Check for no match between the map and reverse_map
            if(!reverse_map.containsKey(map_entry.getKey())) {
                itenary_start = map_entry.getKey();
                break;
            }
        }

        // Check for an impossible itenary
        if(itenary_start == null) {
            System.out.println("Impossible Itenary");
            return result_al;
        }

        // Get the short trip destination from 'start'
        String itenary_to = map.get(itenary_start);

        while(itenary_to != null) {
            result_al.add(itenary_start);
            result_al.add(itenary_to);
            itenary_start = itenary_to;
            itenary_to = map.get(itenary_start);
        }

        return result_al;

    }

    public static void main(String args[]) {

        Map<String, String> map = new HashMap<String, String>();
        ArrayList<String> result_al = new ArrayList<String>();
        map.put("Chennai", "Bangalore");
        map.put("Bombay", "Delhi");
        map.put("Delhi", "Goa");
        map.put("Goa", "Chennai");

        result_al = getItenary(map);
        System.out.println();

        System.out.print(result_al.get(0));
        for(int i = 1; i < result_al.size(); i++) {
            if(result_al.get(i).equals(result_al.get(i-1))) {
                continue;
            }
            System.out.print(" -> " + result_al.get(i));
        }

    }

}











