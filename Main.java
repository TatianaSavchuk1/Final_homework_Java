package Final_homework_Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.jar.Attributes.Name;

public class Main {
    public static void main(String[] args) {

        Notebooks Notebook1 = new Notebooks("Notebook1", 8, 2, "Windows10", "black");
        Notebooks Notebook2 = new Notebooks("Notebook2", 16, 4, "Windows10", "white");
        Notebooks Notebook3 = new Notebooks("Notebook3", 32, 4, "linux", "black");
        Notebooks Notebook4 = new Notebooks("Notebook4", 64, 5, "linux", "grey");

        Set<Notebooks> set = new HashSet<>();
        set.add(Notebook1);
        set.add(Notebook2);
        set.add(Notebook3);
        set.add(Notebook4);

        Scanner scan = new Scanner(System.in);

        System.out.println("Choose parameter for your search: 1 - RAM, 2 - HDCapacity, 3 - OS, 4 - color");
        int search = scan.nextInt();
        if (search == 1) {
            System.out.println("Choose the RAM you need (8, 16, 32, 64)");
            int searchRam = scan.nextInt();
            for (Notebooks notebook : set)
                if (searchRam == notebook.getRAM()) {
                    System.out.println(notebook);

                }
        } else if (search == 2) {
            System.out.println("Choose the HDCapacity you need (2, 4, 5)");
            int searchHD = scan.nextInt();
            for (Notebooks notebook : set)
                if (searchHD == notebook.getHDCapacity()) {
                    System.out.println(notebook);
                }

        } else if (search == 3) {
            System.out.println("Choose the OS you need (Windows10, linux)");
            String searchOS = scan.next();

            for (Notebooks notebook : set) {
                if (searchOS.equals(notebook.getOS())) {
                    System.out.println(notebook);

                }
            }

        } else if (search == 4) {
            System.out.println("Choose the color you need (white, black, grey)");
            String searchColor = scan.next();
            for (Notebooks notebook : set)
                if (searchColor.equals(notebook.getColor())) {
                    System.out.println(notebook);

                }

        }
    }
}
