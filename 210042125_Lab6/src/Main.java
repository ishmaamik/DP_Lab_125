import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LocationAPI lpi= new LocationAPI("1", "2");
        PostalEmail pl= new PostalEmail();

        System.out.println("Enter your choice of receiving notifications and your message:");
        System.out.println("1. SMS");
        System.out.println("2. SMS+ Facebook");
        System.out.println("3. SMS+ Email");
        System.out.println("4. SMS+ PostalMail");
        System.out.println("5. SMS+ Email+ Facebook");
        System.out.println("6. SMS+ PostalMail+ Facebook");
        System.out.println("7. SMS+ PostalMail+ Email");
        System.out.println("8. Email+ SMS+ Facebook+ PostalMail");
        INotifier in= new FacebookNotifier(new SMSNotifier());
        Scanner s= new Scanner(System.in);
        System.out.println("Enter message: ");
        String a= s.nextLine();
        System.out.println("Enter choice: ");
        int i= s.nextInt();


        switch(i){
            case 1:
                SMSNotifier sn=  new SMSNotifier();
                sn.send(a);
              break;
            case 2:
                SMSNotifier sl= new SMSNotifier();
                FacebookNotifier fl= new FacebookNotifier(sl);
                fl.send(a);
                break;
            case 3:
                SMSNotifier sa= new SMSNotifier();
                EmailNotifier el= new EmailNotifier(sa);
                el.send(a);
                break;
            case 4:
                SMSNotifier sb= new SMSNotifier();
                PostalEmailAdapter pm= new PostalEmailAdapter(lpi, pl);
                sb.send(a);
                pm.send(a);
                break;
            case 5:
                SMSNotifier sz= new SMSNotifier();
                EmailNotifier ez = new EmailNotifier(sz);
                FacebookNotifier fp= new FacebookNotifier(ez);
                fp.send(a);
            case 6:
                SMSNotifier ss= new SMSNotifier();
                FacebookNotifier fx= new FacebookNotifier(ss);
                fx.send(a);
                PostalEmailAdapter pe = new PostalEmailAdapter(lpi, pl);
                pe.send(a);
            case 7:
                SMSNotifier st= new SMSNotifier();
                EmailNotifier en= new EmailNotifier(st);
                en.send(a);
                PostalEmailAdapter pt = new PostalEmailAdapter(lpi, pl);
                pt.send(a);
            case 8:
                SMSNotifier sf= new SMSNotifier();
                PostalEmailAdapter pf = new PostalEmailAdapter(lpi, pl);
                EmailNotifier ef= new EmailNotifier(sf);
                FacebookNotifier ff= new FacebookNotifier(ef);
                ff.send(a);
                pf.send(a);

        }

    }
}