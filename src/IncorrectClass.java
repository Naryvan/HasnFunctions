import java.util.Objects;
import java.util.Random;

public class IncorrectClass {

    static int nextIndex = 1;
    int index;
    String name;

    public IncorrectClass(String name) {
        index = nextIndex++;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        //check if classes are the same
        return o.getClass() == getClass();
    }

    @Override
    public int hashCode() {
        //generate hash based on index
        return index >= 1 ? 1 : 0;
    }

    @Override
    public String toString() {
        return "IncorrectClass{" +
                "index=" + index +
                ", name='" + name + '\'' +
                '}';
    }
}
