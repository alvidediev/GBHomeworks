package GBLVL2.Homework3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    Map<String, List<String>> hashMap = new HashMap<>();
    List<String> phoneNumbersList;

    void add(String surname, String phoneNumber) {
        if (hashMap.containsKey(surname)) {
            phoneNumbersList = hashMap.get(surname);
            phoneNumbersList.add(phoneNumber);
            hashMap.put(surname, phoneNumbersList);
        }else
            phoneNumbersList = new ArrayList<>();
        phoneNumbersList.add(phoneNumber);
        hashMap.put(surname,phoneNumbersList);
    }

    List<String> get(String surname){
        return hashMap.get(surname);
    }
}
