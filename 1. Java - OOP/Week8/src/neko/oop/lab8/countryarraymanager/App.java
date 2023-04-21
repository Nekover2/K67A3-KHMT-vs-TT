package neko.oop.lab8.countryarraymanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static final CountryArrayManager countryManager = new CountryArrayManager();

    public static void main(String[] args) {
        init();

        /* TODO: write code to test program */
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file in java line by line.
            String line;
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                if (dataList.size() != 6) {
                    continue;
                }

                switch (dataList.get(5)) {
                    case "Oceania" -> countryManager.append(
                            new OceaniaCountry(dataList.get(0),
                                    dataList.get(1),
                                    Integer.parseInt(dataList.get(2)),
                                    Double.parseDouble(dataList.get(3)), Double.parseDouble(dataList.get(4)))
                    );
                    case "Africa" -> countryManager.append(
                            new AfricaCountry(dataList.get(0),
                                    dataList.get(1),
                                    Integer.parseInt(dataList.get(2)),
                                    Double.parseDouble(dataList.get(3)), Double.parseDouble(dataList.get(4)))
                    );
                    case "Asia" -> countryManager.append(
                            new AsiaCountry(dataList.get(0),
                                    dataList.get(1),
                                    Integer.parseInt(dataList.get(2)),
                                    Double.parseDouble(dataList.get(3)), Double.parseDouble(dataList.get(4)))
                    );
                    case "Europe" -> countryManager.append(
                            new EuropeCountry(dataList.get(0),
                                    dataList.get(1),
                                    Integer.parseInt(dataList.get(2)),
                                    Double.parseDouble(dataList.get(3)), Double.parseDouble(dataList.get(4)))
                    );
                    case "North America" -> countryManager.append(
                            new NorthAmericaCountry(dataList.get(0),
                                    dataList.get(1),
                                    Integer.parseInt(dataList.get(2)),
                                    Double.parseDouble(dataList.get(3)), Double.parseDouble(dataList.get(4)))
                    );
                    case "South America" -> countryManager.append(
                            new SouthAmericaCountry(dataList.get(0),
                                    dataList.get(1),
                                    Integer.parseInt(dataList.get(2)),
                                    Double.parseDouble(dataList.get(3)), Double.parseDouble(dataList.get(4)))
                    );
                }


            }
           CountryArrayManager.print(countryManager.getCountries());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null) {
                    dataReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void init() {
        String filePath = "D:/0. Nekov0.00 - Base/1. Java - OOP/Week8/src/neko/oop/lab8/data/countries.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        String codesString = CountryArrayManager.codeOfCountriesToString(countryManager.getCountries());
        System.out.print(codesString);
    }

    public static void testSortIncreasingByPopulation() {
        Country[] countries = countryManager.sortByIncreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testSortDecreasingByPopulation() {
        Country[] test = countryManager.sortByDecreasingPopulation();
        CountryArrayManager.print(test);
    }

    public static void testSortIncreasingByArea() {
        Country[] test = countryManager.sortByIncreasingArea();
        CountryArrayManager.print(test);
    }

    public static void testSortDecreasingByArea() {
        Country[] test = countryManager.sortByDecreasingArea();
        CountryArrayManager.print(test);
    }

    public static void testSortIncreasingByGdp() {
        Country[] test = countryManager.sortByIncreasingGdp();
        CountryArrayManager.print(test);
    }

    public static void testSortDecreasingByGdp() {
        Country[] test = countryManager.sortByDecreasingGdp();
        CountryArrayManager.print(test);
    }

    public static void testFilterAfricaCountry() {
        Country[] test = countryManager.filterAfricaCountry();
        CountryArrayManager.print(test);
    }

    public static void testFilterAsiaCountry() {
        Country[] test = countryManager.filterAsiaCountry();
        CountryArrayManager.print(test);
    }

    public static void testFilterEuropeCountry() {
        Country[] test = countryManager.filterEuropeCountry();
        CountryArrayManager.print(test);
    }

    public static void testFilterNorthAmericaCountry() {
        Country[] test = countryManager.filterNorthAmericaCountry();
        CountryArrayManager.print(test);
    }

    public static void testFilterOceaniaCountry() {
        Country[] test = countryManager.filterOceaniaCountry();
        CountryArrayManager.print(test);
    }

    public static void testFilterSouthAmericaCountry() {
        Country[] test = countryManager.filterSouthAmericaCountry();
        CountryArrayManager.print(test);
    }

    public static void testFilterMostPopulousCountries() {
        int howmany = 0;
        Country[] test = countryManager.filterMostPopulousCountries(howmany);
        CountryArrayManager.print(test);
    }

    public static void testFilterLeastPopulousCountries() {
        int howmany = 0;
        Country[] test = countryManager.filterLeastPopulousCountries(howmany);
        CountryArrayManager.print(test);
    }

    public static void testFilterLargestAreaCountries() {
        int howmany = 0;
        Country[] test = countryManager.filterLargestAreaCountries(howmany);
        CountryArrayManager.print(test);
    }

    public static void testFilterSmallestAreaCountries() {
        int howmany = 0;
        Country[] test = countryManager.filterSmallestAreaCountries(howmany);
        CountryArrayManager.print(test);
    }

    public static void testFilterHighestGdpCountries() {
        int howmany = 0;
        Country[] test = countryManager.filterHighestGdpCountries(howmany);
        CountryArrayManager.print(test);
    }

    public static void testFilterLowestGdpCountries() {
        int howmany = 0;
        Country[] test = countryManager.filterLowestGdpCountries(howmany);
        CountryArrayManager.print(test);
    }
}
