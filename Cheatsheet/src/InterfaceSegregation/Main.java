/**
 * Project illustrates the Interface Segregation Principle using the example that established the principle
 *
 * Xerox had created a new printer system that could perform a variety of tasks such as stapling and faxing.
 * The software for this system was created from the ground up. As the software grew, making modifications became
 * more and more difficult so that even the smallest change would take a redeployment cycle of an hour,
 * which made development nearly impossible.
 *
 *
 * The design problem was that a single Job class was used by almost all of the tasks.
 * Whenever a print job or a stapling job needed to be performed, a call was made to the Job class.
 * This resulted in a 'fat' class with multitudes of methods specific to a variety of different clients.
 * Because of this design, a staple job would know about all the methods of the print job, even though there
 * was no use for them.
 *
 * The solution suggested by Martin utilized what is today called the Interface Segregation Principle.
 *  Applied to the Xerox software, an interface layer between the Job class and its clients was added using
 *  the Dependency Inversion Principle.
 *  Instead of having one large Job class, a Staple Job interface or a Print Job interface was created that
 *  would be used by the Staple or Print classes, respectively, calling methods of the Job class.
 *
 * Therefore, one interface was created for each job type, which was all implemented by the Job class.
 */

package InterfaceSegregation;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
