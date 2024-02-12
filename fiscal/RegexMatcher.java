import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatcher {
    public static void main(String[] args) {
        
        final String signature = "197812__0005_00015560_2509230901_01ZIM10003825#USD#14.26";
        final Pattern pattern = Pattern.compile("([0-9_]+)([A-Z]{3})(\\d+)#([A-Z]{3})#(\\d+)\\.(\\d{2})"); //(d+)#([A-Z]{3})#
        final Pattern invoiceNoPattern = Pattern.compile("[a-zA-Z0-9:\\s]+Invoice\\s+No:\\s+(\\d+)");
        final String invoiceNo = "Fiscal Tax Invoice Invoice No: 197627";
        final Matcher matcher = invoiceNoPattern.matcher(invoiceNo);
        final boolean match = matcher.find();
        final String group = matcher.group(0);

        System.out.println(match);
        System.out.println(group);
        System.out.println(getInvoiceNumber(invoiceNo));
    }

    private static String getInvoiceNumber(final String text) {
        
        final Pattern pattern = Pattern.compile("[a-zA-Z0-9:\\s]+Invoice\\s+No:\\s+(\\d+)");
        final Matcher matcher = pattern.matcher(text);
        if(matcher.find()) {
            return matcher.group(1);
        } else {
            return null;
        }
    }

}