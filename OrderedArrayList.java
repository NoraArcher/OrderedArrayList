public class OrderedArrayList< T extends Comparable<T> > extends NoNullArrayList<T> {

  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public T set(int index, T value) throws IllegalArgumentException {
    T toReturn = get(index);
    remove(index);
    add(0, value);
    return toReturn;
  }

  public boolean add(T value) throws IllegalArgumentException {
    add(0, value);
    return true;
  }

  public void add(int index, T value) throws IllegalArgumentException {
    index = 0;
    if (value == null) {
      throw new IllegalArgumentException();
    } else {
      for (int i = 0; i < size(); i++) {
        if (  value.compareTo( get(i) ) > 0  ) index = i+1;
      }
      super.add(index, value);
    }
  }



}
