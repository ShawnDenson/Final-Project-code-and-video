
/**
 * Class Class
 * Prints the amount of classes Shawn is taking
 *  * 
 */
import java.util.*;
import java.lang.Math.*;
import java.util.ArrayList.*;
class Class extends fallSemester {
    String Class;
    double time;
    public Class( String Class, double time ) {
        this.Class = Class;
        this.time = time;
    }
    public void setClass( String Class ) {
        this.Class = Class;
    }
    public String getclass() {
        return Class;
    }
    public void setTime( double time ) {
        this.time = time;
    }
    public double getTime() {
        return time;
    }
    @Override
    public String toString() {
        return " ";        
    } 
}