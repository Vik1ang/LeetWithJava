package Array.medium.q1109;

public class Solution1 {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] res = new int[n];
        for (int i = 0; i < bookings.length; i++) {
            int count = bookings[i][2];
            int first = bookings[i][0];
            int last = bookings[i][1];
            for (int j = first; j <= last; j++) {
                res[j - 1] += count;
            }
        }
        return res;
    }
}
