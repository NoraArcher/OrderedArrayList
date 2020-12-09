public class NoNullArrayList<T> extends ArrayList<T> {

  public NoNullArrayList() {
    this = new ArrayList<T>();
  }

  public NoNullArrayList(int startingCapacity) {
    this = new ArrayList<T>(startingCapacity);
  }

  public void set(int index, T value) throws IllegalArgumentException {
    if (value.equals(null)) {
      throw new IllegalArgumentException();
    } else {
      this.set(index, value);
    }
  }

  public void add(T value) throws IllegalArgumentException {
    if (value.equals(null)) {
      throw new IllegalArgumentException();
    } else {
      this.add(value);
    }
  }

  public void add(int index, T value) throws IllegalArgumentException {
    if (value.equals(null)) {
      throw new IllegalArgumentException();
    } else {
      this.add(index, value);
    }
  }

}
