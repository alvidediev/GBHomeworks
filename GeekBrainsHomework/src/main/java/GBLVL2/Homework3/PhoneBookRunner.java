package GBLVL2.Homework3;

public class PhoneBookRunner {
    public static void main(String[] args) {
        PhoneBook test = new PhoneBook();
        test.add("Dediev", "9288924752");
        test.add("Dediev", "9227293790");
        test.add("Dediev", "8887798779");
        test.add("Zakruev", "9285666666");
        test.add("Zakruev", "9285606060");
        test.add("Mr.Anderson", "88002000600");
        test.add("Mr.Anderson", "88002000600");
        System.out.println(test.get("Dediev"));
        System.out.println(test.get("Zakruev"));
        System.out.println(test.get("Mr.Anderson"));
    }
}
