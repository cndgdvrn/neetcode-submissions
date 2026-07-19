/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public  boolean canAttendMeetings(List<Interval> intervals) {

        for (int i=0; i<intervals.size() ; i++) {
            if(i==intervals.size()-1) break;
            int start = intervals.get(i).start;
            int end = intervals.get(i).end;

                for (int k=i+1; k<intervals.size(); k++){
                    int secondStart = intervals.get(k).start;
                    int secondEnd = intervals.get(k).end;
                    List<Integer> timeLine = createTimeLine(start, end);
                    if ((timeLine.contains(secondStart) || timeLine.contains(secondEnd)) && end !=secondStart){
                        return false;
                    }
                }
        }
        return true;
    }

    public  List<Integer> createTimeLine(int start, int end){
        ArrayList<Integer> timeLine = new ArrayList<>();
        for (int i= start; i<=end; i++){
            timeLine.add(i);
        }
        return timeLine;
    }
}
