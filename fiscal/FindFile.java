import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FindFile {
    public static void main(String[] args) {
        System.out.println("Testing");
        final Pattern pattern = Pattern.compile("-(\\d+)");
        String opts[] = {
            "DEBTORS_INVOICE-invoice-262756--jm",
            "FISCAL-TAX-INVOICE-invoice-262754",
            "CREDIT_NOTE--CN-023233--jm"
        };
        
        for(int i=0; i< opts.length; i++) {
            Matcher matcher = pattern.matcher(opts[i]);
            System.out.println(matcher.find());
            String group = matcher.group(0);
            System.out.println(group.contains("023"));
            System.out.println(group);
        }

    }
}
