import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {

  private ArrayList<T> thees;

  public NoNullArrayList() {
    thees = new ArrayList<T>();
  }

  public NoNullArrayList(int startingCapacity) {
    thees = new ArrayList<T>(startingCapacity);
  }

  public T set(int index, T value) throws IllegalArgumentException {
    if (value.equals(null)) {
      throw new IllegalArgumentException();
    } else {
      thees.set(index, value);
    }
    return value;
  }

  public boolean add(T value) throws IllegalArgumentException {
    if (value.equals(null)) {
      throw new IllegalArgumentException();
    } else {
      thees.add(value);
    }
    return true;
  }

  public void add(int index, T value) throws IllegalArgumentException {
    if (value.equals(null)) {
      throw new IllegalArgumentException();
    } else {
      thees.add(index, value);
    }
  }



}
