import java.util.*;// 💫💫🌟🌟🌟 , aacha hai ye sawal

// Jobs ki deadline and profit di hui hai , maximize the profit if only one job can be done at a single time
public class sixJobSequencing {
    static class Job{
        int deadline;
        int profit;
        int id;

        public Job(int i , int j , int k){
            this.id = i;
            this.deadline  = j;
            this.profit = k;
        }
    }
    public static void main(String[] args) {
        int[][] JobInfo ={{4,20},{1,10},{1,40},{1,30}};

       ArrayList<Job> jobs = new ArrayList<>();

        for(int i =0; i<JobInfo.length; i++){
            jobs.add(new Job(i, JobInfo[i][0], JobInfo[i][1]));
        }

        Collections.sort(jobs, (a,b)-> b.profit - a.profit); // soritng in descending order of profit 

        ArrayList<Integer> seq = new ArrayList<>();

        int time = 0;
        for(int i =0; i<jobs.size();i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time ++;
            }


        }
        System.out.println("max jobs "+ seq.size());
        for(int i =0; i<seq.size();i++){
            System.out.print(seq.get(i)+" , "); // 2, 0 wale place pe jo job hai
        }
        System.out.println();

        
    }
    
}
