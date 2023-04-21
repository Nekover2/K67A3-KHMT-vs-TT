package neko.oop.lab8.countryarraymanager;

import neko.oop.lab8.countryarraymanager.sorting.*;

import java.util.Arrays;

public class CountryArrayManager {
    private Country[] countries;
    private int length;

    public CountryArrayManager() {
        countries = new Country[1];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        countries = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[2 * this.countries.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i-1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    /**
     * Sort the countries in order of increasing population 
     *  using selection sort algorithm.
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        Arrays.sort(newArray,new DecreasingPopulation());

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population 
     *  using selection sort algorithm.
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        
        Arrays.sort(newArray, new DecreasingPopulation());

        return newArray;
    }

    /**
     * Sort the countries in order of increasing area 
     *  using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        
        Arrays.sort(newArray, new IncreasingArea());

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area 
     *  using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        
        Arrays.sort(newArray, new DecreasingArea());

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP 
     *  using insertion sort algorithm.
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        
        Arrays.sort(newArray, new IncreasingGdp());

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP 
     *  sing insertion sort algorithm.
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        
        Arrays.sort(newArray, new DecreasingGdp());

        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        int cnt = 0;
        for(Country country : this.countries) {
            if(country.getClass().getName().equals( AfricaCountry.class.getName())) cnt++;
        }
        AfricaCountry[] res = new AfricaCountry[cnt];
        cnt = 0;

        for(Country country : this.countries) {
            if(country.getClass().getName().equals( AfricaCountry.class.getName())) res[cnt++] = (AfricaCountry) country;
        }
        return res;
    }

    public AsiaCountry[] filterAsiaCountry() {
        int cnt = 0;
        for(Country country : this.countries) {
            if(country.getClass().getName().equals( AsiaCountry.class.getName())) cnt++;
        }
        AsiaCountry[] res = new AsiaCountry[cnt];
        cnt = 0;

        for(Country country : this.countries) {
            if(country.getClass().getName().equals( AsiaCountry.class.getName())) res[cnt++] = (AsiaCountry) country;
        }
        return res;
    }

    public EuropeCountry[] filterEuropeCountry() {
        int cnt = 0;
        for(Country country : this.countries) {
            if(country.getClass().getName().equals( EuropeCountry.class.getName())) cnt++;
        }
        EuropeCountry[] res = new EuropeCountry[cnt];
        cnt = 0;

        for(Country country : this.countries) {
            if(country.getClass().getName().equals( EuropeCountry.class.getName())) res[cnt++] = (EuropeCountry) country;
        }
        return res;
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        int cnt = 0;
        for(Country country : this.countries) {
            if(country.getClass().getName().equals( NorthAmericaCountry.class.getName())) cnt++;
        }
        NorthAmericaCountry[] res = new NorthAmericaCountry[cnt];
        cnt = 0;

        for(Country country : this.countries) {
            if(country.getClass().getName().equals( NorthAmericaCountry.class.getName())) res[cnt++] = (NorthAmericaCountry) country;
        }
        return res;
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        int cnt = 0;
        for(Country country : this.countries) {
            if(country.getClass().getName().equals( OceaniaCountry.class.getName())) cnt++;
        }
        OceaniaCountry[] res = new OceaniaCountry[cnt];
        cnt = 0;

        for(Country country : this.countries) {
            if(country.getClass().getName().equals( OceaniaCountry.class.getName())) res[cnt++] = (OceaniaCountry) country;
        }
        return res;
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        int cnt = 0;
        for(Country country : this.countries) {
            if(country.getClass().getName().equals( SouthAmericaCountry.class.getName())) cnt++;
        }
        SouthAmericaCountry[] res = new SouthAmericaCountry[cnt];
        cnt = 0;

        for(Country country : this.countries) {
            if(country.getClass().getName().equals( SouthAmericaCountry.class.getName())) res[cnt++] = (SouthAmericaCountry) country;
        }
        return res;
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        howMany = Integer.MIN_VALUE;
        for (Country country : this.countries) {
            if(country.getPopulation() > howMany) howMany = country.getPopulation();
        }
        int cnt = 0;
        for (Country country : this.countries) {
            if(country.getPopulation() == howMany) cnt++;
        }
        Country[] res = new Country[cnt];
        cnt=0;
        for (Country country : this.countries) {
            if(country.getPopulation() == howMany) res[cnt++] = country;
        }
        return res;
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        howMany = Integer.MAX_VALUE;
        for (Country country : this.countries) {
            if(country.getPopulation() < howMany) howMany = country.getPopulation();
        }
        int cnt = 0;
        for (Country country : this.countries) {
            if(country.getPopulation() == howMany) cnt++;
        }
        Country[] res = new Country[cnt];
        cnt=0;
        for (Country country : this.countries) {
            if(country.getPopulation() == howMany) res[cnt++] = country;
        }
        return res;
    }

    public Country[] filterLargestAreaCountries(double howMany) {
        howMany = Integer.MIN_VALUE;
        for (Country country : this.countries) {
            if(country.getArea() > howMany) howMany = country.getArea();
        }
        int cnt = 0;
        for (Country country : this.countries) {
            if(country.getArea() == howMany) cnt++;
        }
        Country[] res = new Country[cnt];
        cnt=0;
        for (Country country : this.countries) {
            if(country.getArea() == howMany) res[cnt++] = country;
        }
        return res;
    }

    public Country[] filterSmallestAreaCountries(double howMany) {
        howMany = Integer.MAX_VALUE;
        for (Country country : this.countries) {
            if(country.getArea() < howMany) howMany = country.getArea();
        }
        int cnt = 0;
        for (Country country : this.countries) {
            if(country.getArea() == howMany) cnt++;
        }
        Country[] res = new Country[cnt];
        cnt=0;
        for (Country country : this.countries) {
            if(country.getArea() == howMany) res[cnt++] = country;
        }
        return res;
    }

    public Country[] filterHighestGdpCountries(double howMany) {
        howMany = Integer.MAX_VALUE;
        for (Country country : this.countries) {
            if(country.getGdp() < howMany) howMany = country.getGdp();
        }
        int cnt = 0;
        for (Country country : this.countries) {
            if(country.getGdp() == howMany) cnt++;
        }
        Country[] res = new Country[cnt];
        cnt=0;
        for (Country country : this.countries) {
            if(country.getGdp() == howMany) res[cnt++] = country;
        }
        return res;
    }

    public Country[] filterLowestGdpCountries(double howMany) {
        howMany = Integer.MIN_VALUE;
        for (Country country : this.countries) {
            if(country.getGdp() > howMany) howMany = country.getGdp();
        }
        int cnt = 0;
        for (Country country : this.countries) {
            if(country.getGdp() == howMany) cnt++;
        }
        Country[] res = new Country[cnt];
        cnt=0;
        for (Country country : this.countries) {
            if(country.getGdp() == howMany) res[cnt++] = country;
        }
        return res;
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }
        
        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
