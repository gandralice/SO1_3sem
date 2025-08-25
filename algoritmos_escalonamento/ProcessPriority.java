public class ProcessPriority extends Process{
    int priority;

    public ProcessPriority(int pid, int arrivalTime, int burstTime, int priority){
        super(pid, arrivalTime, burstTime);
        this.priority = priority;
    }
}
