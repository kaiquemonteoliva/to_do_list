import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Data {

    public static void main(String[] args) throws ParseException {


        Scanner scanner = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();
//        Date date = calendar.getTime();

//        DateFormat formato = DateFormat.getDateInstance();
//        System.out.println("Data Brasileira: " + formato.format(date));

        System.out.println("Digite uma data DD/MM/YYYY: ");
        String dateIn = scanner.nextLine();

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

//        try {
            LocalDate date = LocalDate.parse(dateIn, dateFormat);
            System.out.println("Data valida: " + date.format(dateFormat));
//        }catch (DateTimeParseException e) {
//            System.out.println("Data invalida");
//        }


    }
}
