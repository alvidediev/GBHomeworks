package GBLVL2.Homework3;

import java.util.*;

public class UniqueWords {
    public static void main(String[] args) {
        UniqueWords uniqueWords = new UniqueWords();
        List<String> listOfWords = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            listOfWords.add(uniqueWords.randomWord());
        }
        System.out.println("Список слов в массиве: ");
        System.out.println(listOfWords);
        Set<String> unique = new LinkedHashSet<>(listOfWords);
        System.out.println("Список уникальный слов в массиве: ");
        System.out.println(unique);
        System.out.println("Сколько раз встречается каждое слово в массиве: ");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(listOfWords, key) + " раза.");
        }
    }

    private String randomWord() {
        Random random = new Random();
        String[] words = {
                "Бархатцы", "Василиск", "Гистология", "Изумруд", "Кукарекать", "Огниво", "Оргия",
                "Притеснитель", "Сожитель", "Трест", "Вылечить", "Либерализм", "Одногодичный",
                "Палаццо", "Пародийный", "Предстоящий", "Пренебрежительный", "Сотник", "Тура", "Частность"
        };
        return words[random.nextInt(20)];
    }
}
