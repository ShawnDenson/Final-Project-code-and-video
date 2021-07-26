
/**
 * Number Class
 * Prints the number of classes Shawn is taking
 * 
 */
import java.util.*;
import java.lang.Math.*;
import java.util.ArrayList.*;
class fallSemester {
    ArrayList<Class> inventory;
    public fallSemester() {
       inventory=new ArrayList<>();
    }
    public void addClass(Class c) {
       inventory.add(c);
    }
    public int getInventoryCount() {
        System.out.println("Number of classes being taken is (" + inventory.size() + " for fall 2021):") ;
        return inventory.size();
    }
    @Override
    public String toString() {
        String str="";
        for( int i=0;i<inventory.size();i++ ) {
            System.out.println("Class #"+(i+1)+"\n");
            str += inventory.get(i)+"\n\n";
        }
        return str;
    }
}
