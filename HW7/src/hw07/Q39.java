package hw07;

/*
 * - Interfaces can extend multiple interfaces. They cannot implement interfaces.
 */
interface One {}
interface Two extends One {}
interface Three extends Two, One {}
// interface Four implements One{}


/*
 * - Classes can extend only class.
 */
class Five{}
class Six{}
public class Q39 extends Five/*, Six*/ {

}
