package za.ac.cputweek;

import java.util.Iterator;

public class MainDriver {

    public static  void main(String[] args)
    {

        Item i1=new Item("Spaghetti",7.50f);
        Item i2=new Item("hamburger",6.00f);
        Item i3=new Item("chicken sandwich",6.50f);


        Menu menu =new Menu();
        menu.addItem(i1);
        menu.addItem(i2);
        menu.addItem(i3);

        System.out.println("Displaying Menu: ");
        Iterator<Item> iterator =menu.iterator();
        while (iterator.hasNext())
        {
            Item item= iterator.next();
            System.out.println(item);
        }

        System.out.println("\n Remove last item returned ");
        iterator.remove();

        System.out.println("\n Displaying Menu:");

        iterator =menu.iterator();
        while (iterator.hasNext())
        {
            Item item =iterator.next();
            System.out.println(item);
        }



    }


}
