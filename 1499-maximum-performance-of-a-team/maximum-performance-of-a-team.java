class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int MOD = 1_000_000_007;
        
        // Combine speed and efficiency into pairs and sort by efficiency descending
        int[][] engineers = new int[n][2];
        for (int i = 0; i < n; i++) {
            engineers[i] = new int[] {efficiency[i], speed[i]};
        }
        Arrays.sort(engineers, (a, b) -> b[0] - a[0]);
        
        // Min-heap to keep the top k speeds
        PriorityQueue<Integer> speedHeap = new PriorityQueue<>(k, (a, b) -> a - b);
        long maxPerformance = 0, speedSum = 0;
        
        // Iterate over the sorted engineers
        for (int[] engineer : engineers) {
            int currEfficiency = engineer[0];
            int currSpeed = engineer[1];
            
            // Add current speed to the heap
            speedHeap.add(currSpeed);
            speedSum += currSpeed;
            
            // If more than k speeds, remove the smallest one
            if (speedHeap.size() > k) {
                speedSum -= speedHeap.poll();
            }
            
            // Calculate the performance with the current minimum efficiency
            maxPerformance = Math.max(maxPerformance, speedSum *currEfficiency);
        }
        
        return (int) (maxPerformance % MOD);
    }
    }



