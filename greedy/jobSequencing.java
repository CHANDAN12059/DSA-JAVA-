package greedy;
import java.util.*;
public class jobSequencing {

    public static class Job{
int deadline;
int profit;
int id;

Job(int id,int deadline,int profit){
    this.id=id;
    this.deadline=deadline;
    this.profit=profit;
}

    }
    public static void main(String[] args) {
        int jobsInfo[][] = {
            {11, 321}, {2, 62}, {5, 456}, {8, 394}, {11, 424}, 
            {10, 22}, {1, 393}, {6, 87}, {3, 118}, {8, 384}, 
            {10, 83}
        };        ArrayList<Job> job=new ArrayList<>();
       

        for(int i=0;i<jobsInfo.length;i++){
            job.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }
        Collections.sort(job,(a,b)->b.profit-a.profit);

        int time=0;
        ArrayList<Integer> seq=new ArrayList<>();
        for(int i=0;i<job.size();i++){
            Job curr=job.get(i);
            if(time<curr.deadline){
                time++;
                seq.add(curr.id);
            }
        }
        System.out.println("MAX JOBS : "+time);
        System.out.println(seq);


    }
}
