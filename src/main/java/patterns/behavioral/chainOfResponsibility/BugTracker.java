package patterns.behavioral.chainOfResponsibility;

import patterns.behavioral.chainOfResponsibility.notifier.EmailNotifier;
import patterns.behavioral.chainOfResponsibility.notifier.Notifier;
import patterns.behavioral.chainOfResponsibility.notifier.SimpleReportNotifier;
import patterns.behavioral.chainOfResponsibility.notifier.SmsNotifier;
import patterns.behavioral.chainOfResponsibility.priority.Priority;

public class BugTracker {
    public static void main(String[] args) {

        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SmsNotifier(Priority.ASAP);
        
        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);
        
        reportNotifier.notifyManager("Everything is OK", Priority.ROUTINE);
        reportNotifier.notifyManager("Something went wrong", Priority.IMPORTANT);
        reportNotifier.notifyManager("Critical bug", Priority.ASAP);
    }
}
