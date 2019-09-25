import java.util.*;

/*
Create a class with two methods: inc() and count().
Count should return the number of times that inc was called in the last five minutes.
 */

class OracleInterviewQue {
    int count = 0;

    Map<Long, Integer> incCount = new HashMap<Long, Integer>();

    public int inc() {

        incCount.put(System.currentTimeMillis(), ++count);
        System.out.println("CurrentTime : "+System.currentTimeMillis()+" Count :"+count);

        return 0;
    }

    public void count() {

        for (Map.Entry<Long, Integer> entry : incCount.entrySet())

            if ((System.currentTimeMillis()-entry.getKey())> 300000) {
                  System.out.println((System.currentTimeMillis()-entry.getKey())+" searchTimestamp is older than 5 minutes "+entry.getValue());
                  break;
            }
    }

    public static void main(String[] args) throws InterruptedException {


        OracleInterviewQue solution = new OracleInterviewQue();
        for (int i = 0; i < 4; i++) {                    //calling method 4 times and
            Thread.sleep(60000);           //Sleeping for 1 minute in every iteration
            solution.inc();
        }

        solution.count();

    }
}