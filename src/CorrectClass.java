import java.util.Objects;

public class CorrectClass {

    static int nextIndex = 1;
    int index;
    String name;

    public CorrectClass(String name) {
        index = nextIndex++;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CorrectClass that = (CorrectClass) o;
        return index == that.index && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, name);
    }

    @Override
    public String toString() {
        return "CorrectClass{" +
                "index=" + index +
                ", name='" + name + '\'' +
                '}';
    }
}
