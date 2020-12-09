import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {

  public NoNullArrayList() {
    super();
  }

  public NoNullArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public T set(int index, T value) throws IllegalArgumentException {
    if (value.equals(null)) {
      throw new IllegalArgumentException();
    } else {
      super.set(index, value);
    }
    return value;
  }

  public boolean add(T value) throws IllegalArgumentException {
    if (value.equals(null)) {
      throw new IllegalArgumentException();
    } else {
      super.add(value);
    }
    return true;
  }

  public void add(int index, T value) throws IllegalArgumentException {
    if (value.equals(null)) {
      throw new IllegalArgumentException();
    } else {
      super.add(index, value);
    }
  }



}
