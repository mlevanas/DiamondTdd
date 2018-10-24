package Katas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class DiamondPrinter {

    private static final int LETTER_A = 65;

    List<String> makeDiamond(char letter) {
        List<String> result = new ArrayList<String>();
        StringBuilder builder = new StringBuilder();

        for (char currentLetter = LETTER_A; currentLetter <= letter; currentLetter++) {
            int padding = letter - currentLetter;
            int inner = (currentLetter - LETTER_A) * 2 - 1;
            if(padding > 0) {
                setPadding(builder, padding);
                builder.append(currentLetter);
                insertSpaces(builder, currentLetter, inner);
                setPadding(builder, padding);
                result.add(builder.toString());
            }
            else {
                builder.append(currentLetter);
                insertSpaces(builder, currentLetter, inner);
                result.add(builder.toString());
            }
            builder.setLength(0);
        }

        addBottomPart(result);

        return result;
    }

    private void addBottomPart(List<String> result) {
        List<String> sub = new ArrayList<String>(result.subList(0, result.size() - 1));
        Collections.reverse(sub);
        result.addAll(sub);
    }

    private void insertSpaces(StringBuilder builder, char currentLetter, int inner) {
        if (inner > 0) {
            for (int i = 0; i < inner; i++)
                builder.append(" ");
            builder.append(currentLetter);
        }
    }

    private void setPadding(StringBuilder builder, int padding) {
        for (int p = 0; p < padding; p++)
            builder.append(" ");
    }
}
