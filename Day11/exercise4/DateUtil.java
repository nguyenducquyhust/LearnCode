package Day12.exercise4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static Date chuyenTuStringSangDate(String dateString , String dateFormatPattern) {
        Date ngay;
        SimpleDateFormat dateFormat = new SimpleDateFormat(dateFormatPattern);//yyyy/MM/dd
        try {
            ngay = dateFormat.parse(dateString);
        } catch (ParseException e) {
            System.out.println("Ngay san xuat khong hop le. Dat ngay mac dinh.");
            ngay = new Date();
        }
        return ngay;
    }

    public static String inMau( String doMau ) {
        return  "Toi dang co" + doMau;
    }

}
