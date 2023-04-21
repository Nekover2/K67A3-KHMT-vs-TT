package neko.oop.lab8.countryarraymanager.sorting;

import neko.oop.lab8.countryarraymanager.Country;

import java.util.Comparator;

public class IncreasingPopulation implements Comparator<Country> {
    @Override
    public int compare(Country o1, Country o2) {
        if(o1.getPopulation() - o2.getPopulation() > 0) return 1;
        else if(o1.getPopulation() - o2.getPopulation() < 0) return -1;
        else return 0;
    }
}
