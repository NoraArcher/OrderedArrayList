public class OrderedArrayList< T extends Comparable<T> > extends NoNullArrayList<T> {

  private NoNullArrayList<T> thees;

  public OrderedArrayList() {
    thees = new NoNullArrayList<T>();
  }

  public OrderedArrayList(int startingCapacity) {
    thees = new NoNullArrayList<T>(startingCapacity);
  }

  public T set(int index, T value) {
    thees.remove(index);
    thees.add(0, value);
    return value;
  }

  public boolean add(T value) {
    thees.add(0, value);
    return true;
  }

  public void add(int index, T value) {
    index = 0; //thees = {1, 3, 4} value = 5
    while (value.compareTo( thees.get(index) ) > 0 && index < thees.size()) {
      index++;
    }
    thees.add(index, value);
  }




}
