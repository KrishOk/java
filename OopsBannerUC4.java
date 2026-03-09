public class OopsBannerUC4 {

    public static void main(String[] args) {

        // Create banner lines using String.join()
        String line1 = String.join("  ",
                " ***** ",
                " ***** ",
                " ***** ",
                " ***** ");

        String middleLine = String.join(" ",
                "*     *",
                "*     *",
                "*     *",
                "*     *");

        // Store all lines in array
        String[] banner = {
                line1,
                middleLine,
                middleLine,
                middleLine,
                middleLine,
                middleLine,
                line1
        };

        // Print using loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}