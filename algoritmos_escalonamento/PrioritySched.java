import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PrioritySched {
    public static void main(String args[]) {
        List<ProcessPriority> processes = Arrays.asList(
                new ProcessPriority(1, 0, 3, 2),
                new ProcessPriority(2, 2, 1, 1),
                new ProcessPriority(3, 4, 2, 3),
                new ProcessPriority(4, 6, 1, 2)
        );

        processes.sort(Comparator.comparingInt(p-> p.priority));
        int time = 0;

        for (ProcessPriority p : processes) {
            if (time < p.arrivalTime) time = p.arrivalTime;
            System.out.println("Processo"+ p.pid +" executando de"+ time +"até"+ (time + p.burstTime));
            time += p.burstTime;
        }
    }
}
