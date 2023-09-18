class Solution {
    
    class RowSum implements Comparable<RowSum> {
        int index;
        int value;

        RowSum(int index, int value) {
            this.index = index;
            this.value = value;
        }

        @Override
        public int compareTo(RowSum other) {
            if (this.value == other.value) return this.index - other.index;
            else return this.value - other.value;
        }
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        int[] weakest = new int[k];
        PriorityQueue<RowSum> pq = new PriorityQueue<>();

        for (int i = 0; i < mat.length; i++) {
            pq.offer(new RowSum(i, Arrays.stream(mat[i]).sum()));
        }

        for (int i = 0; i < k; i++) {
            weakest[i] = pq.poll().index;
        }

        return weakest;
    }
}