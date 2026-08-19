class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Arrays.sort(reservedSeats, (a, b) -> Integer.compare(a[0], b[0]));
        int m = reservedSeats.length;
        int totalGroups = 0;
        int rowsWithReservation = 0;
        int p = 0;

        while (p < m) {
            int row = reservedSeats[p][0];
            boolean group1 = true, group2 = true, group3 = true;

            while (p < m && reservedSeats[p][0] == row) {
                int seat = reservedSeats[p][1];
                if (seat >= 2 && seat <= 3) group1 = false;
                else if (seat >= 4 && seat <= 5) { group1 = false; group2 = false; }
                else if (seat >= 6 && seat <= 7) { group2 = false; group3 = false; }
                else if (seat >= 8 && seat <= 9) group3 = false;
                p++;
            }

            if (group1 && group3) totalGroups += 2;
            else if (group1 || group2 || group3) totalGroups += 1;

            rowsWithReservation++;
        }
        totalGroups += 2L * (n - rowsWithReservation) > Integer.MAX_VALUE
                ? 0 : 2 * (n - rowsWithReservation);
        return totalGroups;
    }
}