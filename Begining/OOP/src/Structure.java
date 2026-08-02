 // Write a abstract class and abstract and normal methods

public abstract class Structure {

    // Field
    protected double edge;

    // Normal method
    public void welcome() {
        System.out.println("Hi ,You're welcome");
    }

    // Abstract methods
    public abstract double getArea();        // Only header

    public abstract double getPerimeter();// Only header

    //                      مقدرش أنشي object في ال main من الكلاس ده لأنه abstract
}