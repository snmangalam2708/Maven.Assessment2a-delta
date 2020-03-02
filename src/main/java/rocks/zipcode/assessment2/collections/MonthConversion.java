package rocks.zipcode.assessment2.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Use a map to solve
 */
public class MonthConversion {

    private Map<Integer, String> myMap = new LinkedHashMap<>();

    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    public void add(Integer monthNumber, String monthName) {

        myMap.put(monthNumber, monthName);

    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {

        if (monthNumber > 12 || monthNumber < 1){
            throw new NullPointerException();
        }
        else  return myMap.get(monthNumber);
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {
        
        Set<Map.Entry<Integer, String>> set = myMap.entrySet();
        for (Map.Entry<Integer, String> iterator : set) {
            if (iterator.getValue().equals(monthName)) {
                return iterator.getKey();
            }
        } return (Integer) null;
    }


    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {

        return myMap.containsKey(monthNumber);
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {

        return myMap.containsValue(monthName);
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {

        return myMap.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {

        myMap.replace(monthNumber, monthName);

    }
}
