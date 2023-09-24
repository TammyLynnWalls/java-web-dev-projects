package org.launchcode;

import java.util.ArrayList;

public class IceCreamMain {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        flavors.sort(new FlavorComparator());
        cones.sort(new ConeComparator());

        System.out.println("\n*****\nSorted Flavors: ");
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getName());
        }

        System.out.println("\n*****\nSorted Cones:");
        for (Cone cone : cones) {
            String formattedCost = String.format("$%.2f", cone.getCost());
            System.out.println(cone.getName() + " " + formattedCost);
        }


        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}