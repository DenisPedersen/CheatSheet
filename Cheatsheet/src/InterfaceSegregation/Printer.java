/*
 *  Instead of having one large Job class, a Staple Job interface or a Print Job interface was created that
 *  would be used by the Staple or Print classes, respectively, calling methods of the Job class.
 *
 * */
package InterfaceSegregation;

import java.awt.*;

public class Printer {
    PrintJob p = new Job();
    public Printer(){
       p.printBig();
       p.printSmall();
    }
}
