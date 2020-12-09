import java.util.ArrayList;
//import RunTimeException;
public class DriverGenericLab {

  public static void main(String[] args) {
    ArrayList<String> p = new ArrayList<String>(10);
    System.out.println("systems check:");
    p.add("Hallo");   p.add(" und Auf Wiedersehen");
    System.out.println(p.get(0)+p.get(1));
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
      System.out.println("no nulls inserted:\n"+a);
    } catch (RuntimeException e) {
      System.out.println("Not throwing the right exception:\n"+a);
    }
    ArrayList<Integer> c = new OrderedArrayList<Integer>();
    ArrayList<Integer> d = new OrderedArrayList<Integer>(81);
    System.out.println("\nOrderedArrayList tests");
    Integer x = 9;  Integer y = 12;   Integer z = 14;
    d.add(x);  d.add(y); d.add(z);
    System.out.println(d);
    x = 10;  y = 16;   z = 6;
    d.add(x);  d.add(y); d.add(z);
    System.out.println(d);

  }



}
