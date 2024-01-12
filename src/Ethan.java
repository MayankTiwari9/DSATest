import java.util.ArrayList;
import java.util.List;

public class Ethan {

    //Not Correct

    static long maximumReward(int n, List<Pair<Long, Long>> tasks) {
        tasks.sort((task1, task2) -> Long.compare(task1.second, task2.second));

        long currentTime = 0;
        long totalReward = 0;

        for (Pair<Long, Long> task : tasks) {
            currentTime += task.first;
            totalReward += Math.max(0, task.second - currentTime);
        }

        return totalReward;
    }

    static class Pair<L, R> {
        L first;
        R second;

        public Pair(L first, R second) {
            this.first = first;
            this.second = second;
        }
    }

    public static void main(String[] args) {
        List<Pair<Long, Long>> tasks = new ArrayList<>();
        tasks.add(new Pair<>(6L, 10L));
        tasks.add(new Pair<>(8L, 15L));
        tasks.add(new Pair<>(5L, 12L));

        int n = tasks.size();

        long result = maximumReward(n, tasks);
        System.out.println(result);
    }
}
