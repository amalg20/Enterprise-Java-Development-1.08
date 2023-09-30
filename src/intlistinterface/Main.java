package intlistinterface;


public class Main {
    public static void main(String[] args){
        IntArrayList inarr = new IntArrayList();
        IntVector invect = new IntVector();
        inarr.add(2);
        inarr.add(3);
        inarr.add(4);
        inarr.add(5);
        inarr.add(6);
        inarr.add(0);
        inarr.add(7);
        inarr.add(8);
        inarr.add(9);
        inarr.add(2);
        inarr.add(8);
        inarr.add(9);
        inarr.add(2);
        inarr.get(10);
        inarr.get(4);
        invect.add(2);
        invect.add(3);
        invect.add(4);
        invect.add(5);
        invect.add(6);
        invect.add(0);
        invect.add(7);
        invect.add(8);
        invect.add(2);
        invect.add(3);
        invect.add(4);
        invect.add(2);
        invect.add(3);
        invect.add(4);
        invect.add(5);
        invect.add(6);
        invect.add(0);
        invect.add(7);
        invect.add(8);
        invect.add(2);
        invect.add(3);
        invect.add(4);
        invect.get(10);
        invect.get(4);
        System.out.println(inarr.get(4));
        System.out.println(inarr.get(10));
        System.out.println(invect.get(4));
        System.out.println(invect.get(10));

    }
}

