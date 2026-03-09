import java.util.HashMap;
import java.util.Map;

public class OopsBannerUC8 {

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildPatternMap();

        String word = "OOPS";

        renderBanner(word, patternMap);
    }

    
    public static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*       ",
                "*       ",
                "*       "
        });

        map.put('S', new String[]{
                " ***** ",
                "*       ",
                "*       ",
                " ***** ",
                "       *",
                "       *",
                " ***** "
        });

        return map;
    }

   
    public static void renderBanner(String word, Map<Character, String[]> patternMap) {

        for (int row = 0; row < 7; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    lineBuilder.append(pattern[row]).append("  ");
                }
            }

            System.out.println(lineBuilder);
        }
    }
}