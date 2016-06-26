package Hard;

public class GasStation {

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int sumRemaining = 0; // track current remaining
        int total = 0; // track total remaining
        int start = 0;
        for (int i = 0; i < gas.length; i++) {
            int remaining = gas[i] - cost[i];
            //if sum remaining of (i-1) >= 0, continue
            if (sumRemaining >= 0) {
                sumRemaining += remaining;
            //otherwise, reset start index to be current
            } else {
                sumRemaining = remaining;
                start = i;
            }
            total += remaining;
        }
        if (total >= 0) {
            return start;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int gas[]= {1,2,3,4,5};
        int cost[]= {1,2,3,4,5};
        System.out.println(canCompleteCircuit(gas,cost));
    }
}
