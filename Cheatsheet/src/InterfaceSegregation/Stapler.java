/*
*  Instead of having one large Job class, a Staple Job interface or a Print Job interface was created that
*  would be used by the Staple or Print classes, respectively, calling methods of the Job class.
*
* */
package InterfaceSegregation;

public class Stapler {
    StaplerJob j = new Job();
    public Stapler() {
        j.stapleStrong();
        j.stapleWeek();
    }
}
