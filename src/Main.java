public class Main {
    public static void main(String[] args) {

//- Задача
//
//    Дан массив строк, необходимо удалить из него все дубли, оставшиеся строки объединить в одну в порядке следования в массиве.

        String[] strings = {"I", "need", "some", "need", "sleep", "need", "I"};

//        String unitedString = "";
        StringBuilder unitedStringTrue = new StringBuilder();
        for (int string = 0; string < strings.length; string++) {
            for (int stringSub = string + 1; stringSub < strings.length; stringSub++) {
                if (strings[string].equals(strings[stringSub])) {
                    strings[stringSub] = strings[stringSub].replace(strings[stringSub], "");
                }
            }
            if (!strings[string].isBlank()) {
                unitedStringTrue.append(strings[string] + " ");
            }

        }
        System.out.println(unitedStringTrue);
    }
}