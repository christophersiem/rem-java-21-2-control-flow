public class FillStudentArray {
    public static String[] getStudentNames(int size) {
        String[] strings = new String[size];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = "Student " + (i+1);
        }
        return strings;
    }
}
