package listsandarrays;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //u1();
        //u2();
        u3();
        //u4b();


    }

    public static void u2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter names. Empty string ends entering");
        ArrayList names = new ArrayList();
        int i = 0;
        while (true) {
            String name;
            System.out.print("Enter name #" + (i+1) + ": ");
            name = scanner.nextLine();
            if (name.isEmpty()) {
                if (i > 0) {
                    break;
                } else {
                    System.out.println("Enter at least one name, please!");
                }
            }
            if (names.contains(name)) {
                System.out.println("Don't repeat yourself! Use another one, that isn't typed yet");
            } else {
                if (!name.isEmpty()) {
                    names.add(name);
                    i++;

                }

            }



        }
        //some arraylist functions
        System.out.println("Size of your list: " + names.size());
        System.out.println("This is foreach cycle to print names");
        //print foreach cycle
        names.forEach((n) -> System.out.println(n));
        //for loop
        System.out.println("This is for cycle. No difference in result, only length of code.");
        for (i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        //print by iterator
        System.out.println("And now is something new. Java Iterator class!!");
        Iterator iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("Let's sort our stuff alphabetically");
        Collections.sort(names);
        names.forEach((n) -> System.out.println(n));

    }



    public static void u3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter names. Empty string ends entering");
        ArrayList<String> names = new ArrayList();
        int i = 0;
        while (true) {
            String name;
            System.out.print("Enter name #" + (i+1) + ": ");
            name = scanner.nextLine();
            if (name.isEmpty()) {
                if (i > 0) {
                    break;
                } else {
                    System.out.println("Enter at least one name, please!");
                }
            }
            if (names.contains(name)) {
                System.out.println("Don't repeat yourself! Use another one, that isn't typed yet");
            } else {
                if (!name.isEmpty()) {
                    names.add(name);
                    i++;

                }

            }



        }
        //some arraylist functions
        System.out.println("Size of your list: " + names.size());
        System.out.println("This is foreach cycle to print names");
        //print foreach cycle
        names.forEach((n) -> System.out.println(n));
        //for loop
        System.out.println("This is for cycle. No difference in result, only length of code.");
        for (i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        //print by iterator
        System.out.println("And now is something new. Java Iterator class!!");
        Iterator iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("Let's sort our stuff alphabetically");
        Collections.sort(names);
        names.forEach((n) -> System.out.println(n));

    }

    public static void u4a() {
        List<String> list = Arrays.asList("Honza", "Petr", "Jirka");
        ArrayList<String> names1 = new ArrayList();
        names1.addAll(list);
        list = Arrays.asList("Bill", "Steven");
        ArrayList names2 = new ArrayList();
        names2.addAll(list);
        ArrayList allnames = new ArrayList();
        allnames.addAll(names1);
        allnames.addAll(names2);
        System.out.println(allnames.size());

    }

    public static void u4b() {
        int[] a1 = {1, 2, 3};
        int[] a2 = {2,3,4,5,6,7,8};
        //will do it in a hard way
        int size = (a1.length + a2.length);
        int[] newarray = new int[size];
        for (int i = 0; i < a1.length; i++) {
            newarray[i] = a1[i];
        }
        for (int i = 0; i<a2.length; i++) {
            newarray[i+a1.length] = a2[i];
        }
        for (int n:
             newarray) {
            System.out.println(n);
        }
    }

    public static void u1() {
        String name;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of names array: ");
        int size = Integer.valueOf(scanner.nextLine());
        String[] names = new String[size];
        System.out.println("Program will wait for [" + size + "] names. No duplicates allowed.");
        int i = 0;
        while (i < size) {
            System.out.print("Enter name #" + (i + 1) + ": ");
            name = scanner.nextLine();
            if (!isDuplicate(names, name)) {
                names[i] = name;
                System.out.println(names[i]);
                i++;
                System.out.println(i);
            }

        }
        //print pairs
        for (i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("[" + names[i] + ", " + names[j] +"] ");
            }
            System.out.println();
        }
        System.out.println(names.toString());
    }

    public static boolean isDuplicate(String[] names, String name) {
        if (names[0] == null) { return false; }
        for (String n : names) {
            if ((n != null) && (n.equals(name))) {
                System.out.println("Wrong name! I already know that one, type in something new. Use your imagination, bro");
                return true;
            }
        }
        return false;
    }
}
