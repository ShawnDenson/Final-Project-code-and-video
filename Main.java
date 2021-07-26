
/**
 * Final Project Class Schedule
 * @author (Shawn Denson)
 * @version (7/28/21)
 * 
 */

import java.util.*;
import java.lang.Math.*;
import java.util.ArrayList.*;


/**
 * Driver code for Class Schedule
 * 
 */
public class Main {

  public static void main( String[] args ){
        Systems operatingSystems = new Systems( "Operating Systems", 1, 408 );
        Design objectDesign = new Design( "Object-Oriented Design", 2, 407);       
        Survey baccalaureateSurvey = new Survey( "Baccalaureate Survey", 0, 0);
        Networks computerNetworks = new Networks( "Computer Networks", 8, 406);
        Programming defensiveProgramming = new Programming( "Defensive Programming", 3, 405);
        

       
        
        Class fallSemester = new Class();
        
        

        
        fallsemester.addClass( operatingSystems);
        fallsemester.addClass( objectDesign );
        fallsemester.addClass( baccalaureateSurvey );
        fallsemester.addClass( computerNetworks );
        fallsemester.addClass( defensiveProgramming );
        

        
        System.out.println("Shawns class schedule has " + fallsemester.getInventoryCount() + " classes");
        System.out.println( fallSemester ); // implicit call to .toString()

        
        System.out.println( fallSemester ); // implicit call to .toString(
  }
}