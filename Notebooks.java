package Final_homework_Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Notebooks {

    private String name;
    private Integer RAM;
    private Integer HDCapacity;
    private String OS;
    private String color;
    


public Notebooks (String name, Integer RAM, Integer HDCapacity, String OS, String color){
    this.name = name;
    this.RAM = RAM;
    this.HDCapacity = HDCapacity;
    this.OS = OS;
    this.color = color;
}

public String getName(){
    return name;

}
public void setName(){
    this.name = name;
}

public Integer getRAM() {
    return RAM;
}

public void setRAM(int RAM) {
    this.RAM = RAM;
}

public Integer getHDCapacity() {
    return HDCapacity;
}

public void setHDCapacity(Integer HDCapacity) {
    this.HDCapacity = HDCapacity;
}

public String getOS() {
    return OS;
}

public void setOS(String OS) {
    this.OS = OS;
}

public String getColor() {
    return color;
}

public void setColor(String color) {
    this.color = color;
}



    public static List<String> propertiesForFilter(){
        List<String> list = new ArrayList<>();
        list.add("name");
        list.add("RAM");
        list.add("HDCapacity");
        list.add("OS");
        list.add("color");

        return list;

    }

    @Override
    public String toString() {
        return "Ноутбук: (" + name + "): " +
                "количество опретивной памяти:" + RAM +
                ", жёсткий диск: " + HDCapacity + '\'' +
                ", операционная сиситема: " + OS +
                ", цвет: " + color;
    }

}

