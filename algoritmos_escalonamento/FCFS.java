import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FCFS {
    public static void main(String[] args) {
        List<Process> processes = Arrays.asList(
                new Process (1, 0, 5),
                new Process (2, 2, 3),
                new Process (3, 4, 2)
        );
        processes.sort(Comparator.comparingInt(p->p.arrivalTime));
        int time = 0;

        for(Process p : processes){
            if(time<p.arrivalTime) time = p.arrivalTime;
            System.out.println("processo " + p.pid + " executando de " + time + " ate " + (time + p.burstTime));
            time += p.burstTime;
        }
    }
}
