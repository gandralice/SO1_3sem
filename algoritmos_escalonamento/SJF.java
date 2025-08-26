import java.util .*;

public class SJF {
    public static void main(String[] args) {
        List<Process> processes = Arrays.asList(
                new Process(1, 0, 6),
                new Process(2, 2, 8),
                new Process(3, 4, 3),
                new Process(4, 6, 4)
        );
        processes.sort(Comparator.comparingInt(p -> p.burstTime));
        int time = 0;

        for (Process p : processes) {
            if (time < p.arrivalTime) time = p.arrivalTime;
            System.out.println("processo" + p.pid +" executando de " + time +" ate " + (time + p.burstTime));
            time += p.burstTime;
        }
    }
}
