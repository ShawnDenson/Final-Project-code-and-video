import java.util.*;
import java.lang.Math.*;
import java.util.ArrayList.*;
class Systems extends Class {
    double room;
    public Systems( String Class, double time, double room ) {
       super( Class, time );
       this.room = room;
    }
    public void setRoom( double room ) {
       this.room = room;
    }
    public double getRoom() {
       return room;
    }    
    @Override
    public String toString() {
        System.out.println("Class: " + super.getClass());
        System.out.println("Start Time: " + super.getTime());
        System.out.println("Room: " + Math.round(room * 10) / 10.0 + " Synovous Center for Commerce Technology)");
        return " ";
    }
}
