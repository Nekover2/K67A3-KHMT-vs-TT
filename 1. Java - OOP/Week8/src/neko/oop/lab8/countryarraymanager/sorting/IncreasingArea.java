package neko.oop.lab8.countryarraymanager.sorting;

import neko.oop.lab8.countryarraymanager.Country;

import java.util.Comparator;

public class IncreasingArea implements Comparator<Country> {
    @Override
    public int compare(Country o1, Country o2) {
        if(o1.getArea() - o2.getArea() > 0) return -1;
        else if(o1.getArea() - o2.getArea() < 0) return 1;
        else return 0;
    }
}
