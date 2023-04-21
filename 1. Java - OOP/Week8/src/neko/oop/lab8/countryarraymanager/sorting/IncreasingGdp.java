package neko.oop.lab8.countryarraymanager.sorting;

import neko.oop.lab8.countryarraymanager.Country;

import java.util.Comparator;

public class IncreasingGdp implements Comparator<Country> {
    @Override
    public int compare(Country o1, Country o2) {
        if(o1.getGdp() - o2.getGdp() > 0) return 1;
        else if(o1.getGdp() - o2.getGdp() < 0) return -1;
        else return 0;
    }
}
