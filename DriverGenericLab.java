import java.util.ArrayList;
public class DriverGenericLab {

  public static void main(String[] args) {
    ArrayList<String> a = new NoNullArrayList<String>();
    ArrayList<String> b = new NoNullArrayList<String>(8);
    System.out.println("\nNoNullArrayList tests");
    a.add("Kling");  a.add("Glockchen");  a.add("klingeling");
    System.out.println(a);
    a.add("mich");  a.add(3, "Last");  a.add(5, "ein");
    System.out.println(a);
    a.add("ihr Kinder"); a.set(3, "/ Lasst"); a.set(1, "Gloeckchen");
    System.out.println(a);
    try {
      a.add(null);
      a.add(2, null);
      a.set(5, null);
    } catch (IllegalArgumentException e) {
      System.out.println("No nulls inserted, perfect");
    } catch (RuntimeException e) {
      System.out.println("Not throwing the right exception");
    }

    ArrayList<Double> c = new OrderedArrayList<Double>();
    ArrayList<Integer> d = new OrderedArrayList<Integer>(81);
    System.out.println("\nOrderedArrayList tests");

    Integer x = 9;  Integer y = 12;   Integer z = 14;
    d.add(x);  d.add(y); d.add(z);
    System.out.println(d);
    x = 10;  y = 16;   z = 6;
    d.add(x);  d.add(y); d.add(z);
    System.out.println(d);
    x = 13; d.set(2, x);  y = 3;  d.add(5, y);
    System.out.println(d);
    try {
      d.add(null);
      d.add(2, null);
      d.set(5, null);
    } catch (IllegalArgumentException e) {
      System.out.println("no nulls inserted, great");
    } catch (RuntimeException e) {
      System.out.println("Not throwing the right exception"+d);
    }

    Double p = -60.67;  Double q = -74.0;   Double r = 80.3;
    c.add(p);  c.add(q); c.add(r);
    System.out.println(c);
    p = -580.09;  q = -60.66;   r = 5.6890;
    c.add(p);  c.add(q); c.add(r);
    System.out.println(c);
    p = -72.6; c.set(2, p);  q = 80.34;  c.add(5, q);
    System.out.println(c);
    try {
      c.add(null);
      c.add(2, null);
      c.set(5, null);
    } catch (IllegalArgumentException e) {
      System.out.println("no nulls inserted, great");
    } catch (RuntimeException e) {
      System.out.println("Not throwing the right exception"+c);
    }

  }



}
