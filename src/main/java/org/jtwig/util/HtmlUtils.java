package org.jtwig.util;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.util.Arrays.asList;
import static java.util.regex.Pattern.compile;
import static java.util.regex.Pattern.quote;

public final class HtmlUtils {

    private static final String START_COMMENT = "<!--";

    private static final String END_COMMENT = "-->";

    private HtmlUtils() {
    }

    public static String stripTags(String input, String allowedTags) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static String stripTags(String input) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static String removeUnknownTags(String input, String knownTags) {
        List<String> knownTagList = asList(knownTags.replaceAll("^<", "").replaceAll(">$", "").split("><"));
        return removeTags(input, knownTagList);
    }

    private static String removeTags(String input, List<String> knownTagList) {
        Pattern tag = compile("</?([^\\s>]*)\\s*[^>]*>", Pattern.CASE_INSENSITIVE);
        Matcher matches = tag.matcher(input);
        String result = input;
        while (matches.find()) {
            if (!knownTagList.contains(matches.group(1))) {
                result = result.replaceAll(quote(matches.group()), "");
            }
        }
        return result;
    }

    private static String removeTags(String input, String startTag, String endTag) {
        String result = input;
        while (result.contains(startTag)) {
            int start = result.indexOf(startTag);
            int end = result.substring(start + startTag.length()).indexOf(endTag);
            if (end == -1)
                result = result.substring(0, start);
            else
                result = result.substring(0, start) + result.substring(start + startTag.length() + end + endTag.length());
        }
        return result;
    }

    private static String removeHtmlComments(String input) {
        return removeTags(input, START_COMMENT, END_COMMENT);
    }
}
