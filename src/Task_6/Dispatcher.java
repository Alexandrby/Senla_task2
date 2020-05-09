package Task_6;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {
    public static void main(String[] args) {
        List<Item> listItem = new ArrayList<>();
        listItem.add(new Item("Item1", 2, 450));
        listItem.add(new Item("item2", 1, 6000));
        listItem.add(new Item("Item3", 5, 450));
        listItem.add(new Item("item4", 3, 7000));
        listItem.add(new Item("item5", 4, 550));

        Backpack backpack = new Backpack(10);
        backpack.MakeAllSets(listItem);
        for (Item i : backpack.getBestSet()) {
            System.out.println(i.name);
        }
    }
}
