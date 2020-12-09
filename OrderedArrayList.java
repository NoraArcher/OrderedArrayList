public class OrderedArrayList< T extends Comparable<T> > extends NoNullArrayList<T> {

  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public T set(int index, T value) {
    remove(index);
    add(0, value);
    return value;
  }

  public boolean add(T value) {
    add(0, value);
    return true;
  }

  public void add(int index, T value) {
    index = 0;
    for (int i = 0; i < size(); i++) {
      if (  value.compareTo( get(i) ) > 0  ) index = i+1;
    }
    super.add(index, value);
    // if (size() == 0) {
    //   super.add(0, value);
    // } else {
    //   index = 0; //thees = {1, 3, 4} value = 5
    //   while ( value.compareTo( get(index) ) > 0 && index < size() - 1 ) {
    //     index++;
    //     //if (index == size() - 1 && value.compareTo( get(index) ) > 0 ) index++;
    //   }
    //   super.add(index, value);
    // }
  }



}
