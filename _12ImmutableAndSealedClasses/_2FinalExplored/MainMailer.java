package _12ImmutableAndSealedClasses._2FinalExplored;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MainMailer {

    public static void main(String[] args) {

        String[] names = { "Ann Jones", "Ann Jones Ph.D.", "Bob Jones M.D.",
                "Carol Jones", "Ed Green Ph.D.", "Ed Green M.D.", "Ed Black" };

        List<StringBuilder> population = getNames(names); // this means that population will hold a list of StringBuilder objects.
        Map<StringBuilder, Integer> counts = new TreeMap<>(); // the vairable counts is declared as a Map with key of type StringBuilder and values of type Integer. The counts map is instantiated as a TreeMap.
        population.forEach(s -> {
            counts.merge(s, 1, Integer::sum);
        }); // iterates through the list of names and updates the count for each name in the map. The merge method adds the name to the map with a count of 1 if it doesn't exist, or increments the existing count by 1.
        System.out.println(counts);

        StringBuilder annJonesPhd = new StringBuilder("Ann Jones Ph.D."); // using stringbuilders as keys in a Map can be problematic because stringbuilder does not override the equals and hashcode methods from object.
        System.out.println("There are " + counts.get(annJonesPhd) +
                " records for " + annJonesPhd);

        List<StringBuilder> cleanedNames = standardizeNames(population);
        System.out.println(cleanedNames);

        System.out.println("There are " + counts.get(annJonesPhd) +
                " records for " + annJonesPhd);
        System.out.println(counts);

        StringBuilder annJones = new StringBuilder("Ann Jones");
        System.out.println("There are " + counts.get(annJones) +
                " records for " + annJones);

        System.out.println("-----------------------");
        counts.forEach((k, v) -> System.out.println(k + " : " + v));

        System.out.println("-----------------------");
        counts.keySet().forEach(k -> System.out.println(k + " : " + counts.get(k)));
    }

    private static List<StringBuilder> getNames(String[] names) {

        List<StringBuilder> list = new ArrayList<>();
        int index = 3;
        for (String name : names) {
            for (int i = 0; i < index; i++) {
                list.add(new StringBuilder(name));
            }
            index++;
        }
        return list;
    }

    private static List<StringBuilder> standardizeNames(List<StringBuilder> list) {

        List<StringBuilder> newList = new ArrayList<>();
        for (var name : list) {
            for (String suffix : new String[] { "Ph.D.", "M.D." }) {
                int startIndex = -1;
                if ((startIndex = name.indexOf(suffix)) > -1) {
                    name.replace(startIndex - 1,
                            startIndex + suffix.length(), "");
                }
            }
            newList.add(name);
        }
        return newList;
    }

}
