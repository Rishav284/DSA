class Solution {
    public int totalNumbers(int[] digits) {
    int[] freq = new int[10];
    for (int d : digits) freq[d]++;

    int result = 0;
    for (int last = 0; last <= 8; last += 2) {
        if (freq[last] == 0) continue;
        freq[last]--;

        for (int hundred = 1; hundred <= 9; hundred++) {
            if (freq[hundred] == 0) continue;
            freq[hundred]--;

            int distinctCount = 0;
            for (int d = 0; d <= 9; d++) {
                if (freq[d] > 0) distinctCount++;
            }
            result += distinctCount;

            freq[hundred]++;
        }
        freq[last]++;
    }
    return result;
}
}