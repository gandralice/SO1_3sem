import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RoundR {
    public static void main(String[] args){
        int quantum = 2;
        Queue<Process> queue = new LinkedList<>(Arrays.asList(
                new Process(1, 0, 5),
                new Process(2, 2, 3),
                new Process(3, 4, 6)
        ));
        int time = 0;

        while (!queue.isEmpty()) {
            Process p = queue.poll();

            if (time < p.arrivalTime) time = p.arrivalTime;
            int execTime = Math.min(quantum, p.burstTime);

            System.out.println("Processo "+ p.pid +" executando de "+ time + " até " + (time + execTime));

            time += execTime;


            p.burstTime -= execTime;
            if (p.burstTime > 0) queue.add(p);
        }
    }
}
