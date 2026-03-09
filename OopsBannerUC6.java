public class OopsBannerUC6 {

    public static void main(String[] args) {

        
        String[][] word = {
                buildO(),
                buildO(),
                buildP(),
                buildS()
        };

        
        for (int row = 0; row < 7; row++) {
            for (int letter = 0; letter < word.length; letter++) {
                System.out.print(word[letter][row] + "  ");
            }
            System.out.println();
        }
    }

    
    public static String[] buildO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    
    public static String[] buildP() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*       ",
                "*       ",
                "*       "
        };
    }

    
    public static String[] buildS() {
        return new String[]{
                " ***** ",
                "*       ",
                "*       ",
                " ***** ",
                "       *",
                "       *",
                " ***** "
        };
    }
}