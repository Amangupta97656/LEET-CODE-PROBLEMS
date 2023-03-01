import java.util.List;
import java.util.ArrayList;

public class Solution {

    private class LineData {

        int startIndexWords;
        int endIndexWords;
        int textLength;
        int singleSapcesBetweenWordsLength;

        LineData(int index, String[] words) {
            if (index < words.length) {
                startIndexWords = index;
                endIndexWords = index;
                textLength = words[index].length();
                singleSapcesBetweenWordsLength = 0;
            }
        }
    }

    private static final int SINGLE_SPACE = 1;
    private LineData lineData;
    private int maxWidth;

    public List<String> fullJustify(String[] words, int maxWidth) {
        this.maxWidth = maxWidth;
        lineData = new LineData(0, words);
        List<String> fullyJustifiedText = new ArrayList<>();

        for (int i = 1; i < words.length; ++i) {

            if (lineData.textLength + lineData.singleSapcesBetweenWordsLength + SINGLE_SPACE + words[i].length() < maxWidth) {
                lineData.textLength += words[i].length();
                ++lineData.singleSapcesBetweenWordsLength;
                ++lineData.endIndexWords;
                continue;
            }
            if (lineData.textLength + lineData.singleSapcesBetweenWordsLength + SINGLE_SPACE + words[i].length() == maxWidth) {
                lineData.textLength += words[i].length();
                ++lineData.singleSapcesBetweenWordsLength;
                ++lineData.endIndexWords;

                createLine(fullyJustifiedText, words, false);
                lineData = new LineData(++i, words);
                continue;
            }
            createLine(fullyJustifiedText, words, false);
            lineData = new LineData(i, words);
        }

        if (lineData.textLength > 0) {
            createLine(fullyJustifiedText, words, true);
        }
        return fullyJustifiedText;
    }

    private void createLine(List<String> fullyJustifiedText, String[] words, boolean isLastLine) {

        int totalSpaceInLine = maxWidth - lineData.textLength;
        int spaceBetweenWordsWithoutRemainder = 0;
        int totalSpaceRemainder = 0;
        int spaceAfterLastWordInLastLine = 0;
        int numberOfWords = lineData.endIndexWords - lineData.startIndexWords + 1;

        if (!isLastLine) {
            spaceBetweenWordsWithoutRemainder = (numberOfWords > 1) ? totalSpaceInLine / (numberOfWords - 1) : totalSpaceInLine;
            totalSpaceRemainder = (numberOfWords > 1) ? totalSpaceInLine % (numberOfWords - 1) : 0;
        } else {
            spaceBetweenWordsWithoutRemainder = 1;
            spaceAfterLastWordInLastLine = totalSpaceInLine - (numberOfWords - 1);
        }

        StringBuilder line = new StringBuilder();

        if (numberOfWords == 1 && !isLastLine) {
            line.append(words[lineData.startIndexWords]);
            appendSpaceToLine(spaceBetweenWordsWithoutRemainder, line);
            fullyJustifiedText.add(line.toString());
            return;
        }

        while (lineData.startIndexWords < lineData.endIndexWords) {
            line.append(words[lineData.startIndexWords]);
            int spaceBetweenWords = (totalSpaceRemainder-- > 0) ? 1 + spaceBetweenWordsWithoutRemainder : spaceBetweenWordsWithoutRemainder;
            appendSpaceToLine(spaceBetweenWords, line);
            ++lineData.startIndexWords;
        }
        line.append(words[lineData.endIndexWords]);
        appendSpaceToLine(spaceAfterLastWordInLastLine, line);
        fullyJustifiedText.add(line.toString());
    }

    private void appendSpaceToLine(int spacesToAppend, StringBuilder line) {
        while (spacesToAppend-- > 0) {
            line.append(" ");
        }
    }
}