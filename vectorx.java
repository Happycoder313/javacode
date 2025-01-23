import java.util.*;

class vectorx {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        v.add("Apple");
        v.add("Banana");
        v.add("Mango");
        v.add("Cherry");
        System.out.println("Size is:" + v.size());
        System.out.println("Default capacity is:" + v.capacity());
        System.out.println("vector element is:" + v);
        v.addElement("watermelon");
        v.addElement("pinapple");
        v.addElement("coconut");
        System.out.println("size after addition:" + v.size());
        System.out.println("capacity after addition:" + v.capacity());
        System.out.println("Element are:" + v);
        if (v.contains("Mango")) {
            System.out.println("Mango is present at index" + v.indexOf("Mango"));

        } else {
            System.out.println("Mango is not present in list.");

        }
        System.out.println("The first furit of the vector is:" + v.firstElement());
        System.out.println("The last furit of the vector is:" + v.lastElement());

    }
}