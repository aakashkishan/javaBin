import java.util.*;

class Interval 
{ 
    int start,end; 
    Interval(int start, int end) 
    { 
        this.start=start; 
        this.end=end; 
    } 
} 

public class InsertIntervals {

    public static void insertIntervals(List<Interval> intervals, Interval new_itl) {

        ArrayList<Interval> result_al = new ArrayList<Interval>();

        for(Interval interval: intervals) {
            if(interval.end < new_itl.start) {
                result_al.add(interval);
            } 
            else if(interval.start > new_itl.end) {
                result_al.add(new_itl);
                new_itl = interval;
            } 
            else if(interval.end >= new_itl.start || interval.start <= new_itl.end) {
                new_itl = new Interval(Math.min(interval.start, new_itl.start), Math.max(interval.end, new_itl.end));
            }
        }
        result_al.add(new_itl);
        for(Interval itl: result_al) {
            System.out.print("[" + itl.start + ", " + itl.end + "]");
            System.out.println();
        }

    }

    public static void main(String args[]) {

        List<Interval> input_l = new ArrayList<Interval>();
        input_l.add(new Interval(1, 3));
        input_l.add(new Interval(6, 9));
        insertIntervals(input_l, new Interval(2, 5));

    }

}




























