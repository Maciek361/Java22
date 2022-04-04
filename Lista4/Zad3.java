package lista4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Zad3 {


    public static void main(String[] args) throws ParseException 
    {
        String format ="dd.MM.yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
        format);



        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj 1 date: ");
        String input1 = skaner.nextLine();

        System.out.println("Podaj 2 date: ");
        String input2 = skaner.nextLine();

        skaner.close();


        Date date1 = simpleDateFormat.parse(input1);
        System.out.println(date1);

        Date date2 = simpleDateFormat.parse(input2);
        System.out.println(date2);

        long diff = date2.getTime() - date1.getTime();

        TimeUnit time = TimeUnit.DAYS; 
        long diffrence = time.convert(diff, TimeUnit.MILLISECONDS);
        System.out.println("Liczba dni, która up³ynê³a to: "+diffrence);

        }




}