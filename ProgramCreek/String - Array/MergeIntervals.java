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

public class MergeIntervals {

    public static void mergeIntervals(List<Interval> intervals) {

        if(intervals == null || intervals.size() == 0) {
            return;
        }

        // Sort the intervals in increasing order of start time
        Collections.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval itl1, Interval itl2) {
                return itl1.start - itl2.start;
            }
        });

        Stack<Interval> merged_st = new Stack<Interval>();
        merged_st.push(intervals.get(0));
        for(int i = 0; i < intervals.size(); i++) {
            // Get Interval from the top of the stack
            Interval top = merged_st.peek();

            // If current interval is not overlapping with the stack top,
            // then push into stack
            if(top.end < intervals.get(i).start) {
                merged_st.push(intervals.get(i));
            }

            // Otherwise update the ending time of the top 
            // If ending of the current interval is more
            else if(top.end < intervals.get(i).end) {
                top.end = intervals.get(i).end;
                merged_st.pop();
                merged_st.push(top);
            }
        }

        System.out.print("The Merged Intervals: ");
        while(!merged_st.isEmpty()) {
            Interval itl = merged_st.pop();
            System.out.print("[" + itl.start + ", " + itl.end + "]");   
        }

    }

    public static void main(String args[]) {

        List<Interval> input_l = new ArrayList<Interval>();
        input_l.add(new Interval(1, 3));
        input_l.add(new Interval(2, 6));
        input_l.add(new Interval(8, 10));
        input_l.add(new Interval(15, 22));

        mergeIntervals(input_l);

    }

}




























