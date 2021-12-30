/*
* one interface was created for each job type, which was all implemented by the Job class.
 */
package InterfaceSegregation;
import java.awt.*;

public class Job implements PrintJob, StaplerJob{
    @Override
    public void printSmall() {

    }

    @Override
    public void printBig() {

    }

    @Override
    public void stapleWeek() {

    }

    @Override
    public void stapleStrong() {

    }

}
