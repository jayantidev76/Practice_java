public class countnumbersofwordsinastring {
    public static void main(String[] args) {
        String words = "hey !! jiya here ";
        int CountWords = words.split("\\s").length;
        System.out.println(CountWords);

    }
}
