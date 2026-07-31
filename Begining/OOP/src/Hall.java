 // Write a class to show meaning of returning an object

public class Hall {

    // fields
    private int Length;
    private int Width;

    // Normal constructor
    public Hall() {}

    // Overloading constructor
    public Hall(int l , int w){
        Length = l;
        Width = w;
    }

    // Shape 1
    public Hall add(Hall ob1 , Hall ob2) {
        Hall result = new Hall();
        result.Length = ob1.Length + ob2.Length;
        result.Width = ob1.Width + ob2.Width;
        return result;
    }

    // Shape 2
    public Hall add(Hall ob) {
        Hall result = new Hall();
        result.Length = this.Length + ob.Length;
        result.Width = this.Width + ob.Width;
        return result;
    }

    // Shape 3
    public Hall Add(Hall ob) {
        ob.Length = this.Length + ob.Length;
        ob.Width = this.Width + ob.Width;
        return ob;
    }

    // Add isEqual method to compare between objects
    public boolean isEqual(Hall ob) {
        if(this.Width == ob.Width && this.Length == ob.Length) {
            return true;
        }else {
            return false;
        }
    }

    // Getter
    public int get_Length() {
        return Length;
    }
    public int get_Width() {
        return Width;
    }

}