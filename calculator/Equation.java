 
import java.util.*;
public interface Equation{
    String toString();
    List<Point> getRoots();
    void createEquation();
    boolean equals(Equation to);
    double getValue(double x);
}