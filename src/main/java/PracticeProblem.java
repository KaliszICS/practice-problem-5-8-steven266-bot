import java.util.HashMap;
public class PracticeProblem {

	public static void main(String args[]) {

}
    public static HashMap<String, Integer> combineParallelArrays(String[] names, int[] ages) {
        HashMap<String, Integer> people = new HashMap<>();

        for (int i = 0; i < names.length; i++) {
            people.put(names[i], ages[i]);
        }

        return people;
    }

    public static void increaseAge(HashMap<String, Integer> people, String name) {
        if (people.containsKey(name)) {
            people.put(name, people.get(name) + 1);
        }
    }

    public static void replaceName(HashMap<String, Integer> people, String oldName, String newName) {
        if (people.containsKey(oldName)) {
            int age = people.get(oldName);
            people.remove(oldName);
            people.put(newName, age);
        }
    }

 
    public static void main1(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};
        int[] ages = {20, 25, 30};

        HashMap<String, Integer> people = combineParallelArrays(names, ages);

        System.out.println(people);

        increaseAge(people, "Bob");
        System.out.println(people);

        replaceName(people, "Charlie", "David");
        System.out.println(people);
    }
}

