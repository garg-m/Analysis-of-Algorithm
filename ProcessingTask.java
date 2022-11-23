import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ProcessingTask {
    public static void main(String[] args) {
        int[][] tasks = new int[][]{
            {1, 3, 2},
            {2, 5, 3},
            {5, 6, 2}
        };

        Arrays.sort(tasks, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if(a[0] == b[0]) {
                    return a[1] - b[1];
                }
                return a[0] - b[0];
            }
        });

    //minimum time to process all tasks
    int timeCount = 0;

   for(int i = 0; i < tasks.length-1; i ++) {
    int currTaskStart = tasks[i][0];
    int currTaskEnd = tasks[i][1];
    int currTaskTime = tasks[i][2];
    List<Integer> currTaskArray = new ArrayList<>();
    for(int a = currTaskStart; a < currTaskEnd; a ++) {
        currTaskArray.add(a);
    }

    int nextTaskStart = tasks[i + 1][0];
    int nextTaskEnd = tasks[i + 1][1];
    int nextTaskTime = tasks[i + 1][2];
    List<Integer> nextTaskArray = new ArrayList<>();
    for(int b = nextTaskStart; b < nextTaskEnd; b ++) {
        nextTaskArray.add(b);
    }

    if(nextTaskArray.size() > currTaskArray.size()) {
    {
        int numsMatch = 0;
        for(int a = 0; a < currTaskArray.size(); a++) {
            for(int b = 0; b < nextTaskArray.size(); b++) {
                if(currTaskArray.get(a) == nextTaskArray.get(b)) {
                    numsMatch++;
                    System.out.println("numsMatch: " + numsMatch);
                    // break;
                }
            }
        }
        if(numsMatch + 1 == currTaskTime) {
            timeCount += currTaskTime;
        }
    }
    if(currTaskArray.size() > nextTaskArray.size()) {
        int numsMatch = 0;
        for(int a = 0; a < nextTaskArray.size(); a++) {
            for(int b = 0; b < currTaskArray.size(); b++) {
                if(nextTaskArray.get(a) == currTaskArray.get(b)) {
                    numsMatch++;
                    // System.out.println("numsMatch: " + numsMatch);
                    // break;
                }
            }
        }
        if(numsMatch + 1 == nextTaskTime) {
            timeCount += nextTaskTime;
        }
    }
}
    
   }

   timeCount += tasks[tasks.length - 1][2];
   System.out.println("timeCount: " + timeCount);
}
}


