 // Write a class to show meaning of passing object in method

public class Room {

    // fields
    private int Length;
    private int Width;

    // Overloading constructor
    public Room(int l , int w){
        Length = l;
        Width = w;
    }

    // Passing object in method
     public void room_modified( Room ob) {
        ob.Length = 10;
        ob.Width = 7;
     }

    // Getter
     public int get_Length() {
        return Length;
     }
     public int get_Width() {
         return Width;
     }

}