import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ethan {
    public static void main(String[] args) {

        // Corrected 
        
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Task[] tasks = new Task[n];

        for (int i = 0; i < n; i++) {
            int duration = scanner.nextInt();
            int deadline = scanner.nextInt();
            tasks[i] = new Task(duration, deadline);
        }

        Arrays.sort(tasks, Comparator.comparing(Task::getDuration).thenComparing(Task::getDeadline));

        int maxReward = calculateMaxReward(tasks);
        System.out.println(maxReward);
    }

    private static int calculateMaxReward(Task[] tasks) {
        int currentTime = 0;
        int maxReward = 0;

        for (Task task : tasks) {
            currentTime += task.duration;
            maxReward += task.deadline - currentTime;
        }

        return maxReward;
    }

    static class Task {
        int duration;
        int deadline;

        public Task(int duration, int deadline) {
            this.duration = duration;
            this.deadline = deadline;
        }

        public int getDuration() {
            return duration;
        }

        public int getDeadline() {
            return deadline;
        }
    }
}
