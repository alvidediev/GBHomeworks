package GBLVL2.Homework3;

import java.util.*;

public class UniqueWords {
    public static void main(String[] args) {
        UniqueWords uniqueWords = new UniqueWords();
        List<String> listOfWords = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            listOfWords.add(uniqueWords.randomWord());
        }
        System.out.println(listOfWords);
        Set<String> unique = new LinkedHashSet<>(listOfWords);
        System.out.println(unique);
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
