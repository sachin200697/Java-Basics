/**
 * This is the how we can generate the documentation for java project.
 * <h1>Java8 Essential Training</h1>
 * <h3>This project is used to practice the code to understand the concept of java8 essential training</h3>
 *
 * Notes to generate document:
 * We can use html tags here.
 * Use "/** *some infor *  /
 * For methods it will automatically give params and some error throwing info
 *
 *
 * To generate doc:
 * Create a new directory(or can use existing one to save the doc) - docs
 * Go -> Tools -> Generate Javadoc -> use meeter barr to include all nested classes(if you want by default
 * only public and protected class will be included) then can check some other options as well -> Select
 * location -> OK
 */

package com.example.java;

import com.example.java.subpackage.SubClass;
import org.apache.commons.io.FileUtils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.net.URL;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    /**
     *
     * @param args - This is main class that holds main function
     * @throws IOException
     */

    public static void main(String[] args) throws  IOException{
//        bigDouble();
//        charProperty();
//        numberFormater();
//        //date api
//        dateExample();
//        debugCode();

//        int val = 10;
//        callByValue(val);   //20
//        System.out.println("Original value:"+val);  //10
//
//        Integer val1 = 10;
//        callByValue(val1);   //20
//        System.out.println("Original value:"+val1);  //10
//        //    for arrays and user defined objects, call by refrence will work

        //copy of array
//        copyOfArray();

//        forEach loop
//        List<String> list = new ArrayList<>();
//        list.add("Sachin");
//        list.add("Kumar");
//        list.add("Pradeep");
//
//        list.forEach(System.out::print);
//        System.out.println();
//
//        SubClass sc = new SubClass();
//        System.out.println(sc.square(10));

//        //enum example
//          enumExample();

//        commonIO();

//        readOnlineFiles();

        System.out.println("Jar is working");
    }

    public static void bigDouble(){
        double val = 34;
        BigDecimal d1 = new BigDecimal(val);
        BigDecimal d2 = d1.add(d1).add(d1); //can add a BigDecimal to only BigDecimal
        // (34 + 34) + 34

        System.out.println(d1); //34
        System.out.println(d2); //102
    }

    public static void charProperty(){
        char c1 = 'a';
        char c2 = 'E';
        System.out.println(Character.toUpperCase(c1) + " " + Character.toLowerCase(c2));    //A e
    }

    public static void numberFormater(){
        // we can use _ while using long
        long million = 10_000_000;
        System.out.println(million);    //10000000

        //to format the number using some saprate symbol like : , or . or _
        NumberFormat formater = NumberFormat.getNumberInstance();
        String million_str = formater.format(million);
        System.out.println(million_str);    //10,000,000

        //to control the saprate symbol:
        Locale loc = new Locale("in", "IN");
        formater = NumberFormat.getNumberInstance(loc);
        million_str = formater.format(million);
        System.out.println(million_str);

        //to get currency formater
        formater = NumberFormat.getCurrencyInstance();
        System.out.println("Currency: " + formater.format(million));

        //for country
        formater = NumberFormat.getCurrencyInstance(loc);
        System.out.println("Country Currency: " + formater.format(million));

        //as append returns back the refrence of current object so we can make a chain on this
        StringBuilder sb = new StringBuilder("Sachin").append(" ").append("Kumar");
        System.out.println(sb); //Sachin Kumar
        sb.delete(0, sb.length());
        System.out.println(sb); //
    }

    public static void dateExample(){
        Date d = new Date();
        System.out.println(d);  //Fri Apr 01 12:26:05 IST 2022

        //to represent a day
        GregorianCalendar gc = new GregorianCalendar(2022, 0,5);
        System.out.println(gc); //it is not printable effeciently

        //will add 1 in day of month
        gc.add(GregorianCalendar.DATE, 1);
        Date d1 = gc.getTime();
        System.out.println(d1);

        //formating the date
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(df.format(d1));  //Thursday, January 6, 2022

        //java 8 or later version date
        //in new api months go from 1 to 12 but in old api 0 to 11.
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt); //2022-04-01T12:53:24.511112200

        LocalDate ld = LocalDate.of(2019, 2,4);
        System.out.println(ld); //2019-02-04

        //to formate the data
        DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE;

        System.out.println("Date with formate:" + dtf.format(ld));

        dtf = DateTimeFormatter.ofPattern("M/d/yyy");
        System.out.println("Date with formate:" + dtf.format(ld));

    }

    public static void debugCode(){
        /*
            1. set Breakpoint by simply clicking the line no.
            2. Run -> Debugg Main
            3. Step over (F8) to execute next instruction
            4. Conditional Breakpoint: Right click on the breakpoint added (on the round circle)
                then put condition like i==7 -> Done.
         */
        for(int i =0; i < 10 ; i++){
            System.out.println(i+1);
        }
    }

    public static void callByValue(int val){
        val+=10;
        System.out.println("Method value: "+val);
    }

    public static void callByValue(Integer val){
        val+=10;
        System.out.println("Method value: "+val);
    }

    public  static  void copyOfArray(){
        int source[] = new int[]{1,2,3,4,5,6,7,8,9,10};
        int sourceStartIndex = 5;

        int destination[] = new int[5];
        int destinationStartIndex=2;
        int noOfElementToCopy = 3;

        System.arraycopy(source, sourceStartIndex, destination, destinationStartIndex, noOfElementToCopy);

        for(int i=0;i<source.length;i++)
            System.out.print(source[i] + " ");  //1 2 3 4 5 6 7 8 9 10
        System.out.println();

        for(int i=0;i<destination.length;i++)
            System.out.print(destination[i] + " "); //0 0 6 7 8
        System.out.println();

    }

    public static void enumExample(){
        enum Days{
            SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
        }

        Days d = Days.SATURDAY;

        System.out.println(d);

        //enum with defined values
        enum Flag{
            ON("1"), OFF("0");

            private String name;
            Flag(String name){
                this.name = name;
            }
            public String toString(){
                return this.name;
            }
        }

        Flag f = Flag.ON;
        System.out.println(f);
    }

    public static void commonIO(){
        /*
            1. Go to https://commons.apache.org/proper/commons-io/download_io.cgi
            2. Download zip file and extract it
            3. Copy commons-io-2.11.0.jar file
            4. Come the to intelliJ project (into id)
            5. On current project click right and create a new directory called lib
            6. then using right click on this lib directory copy the jar file
            7. right click on jar file and select add as library.
            8. Confirm it using click File->Project structure ->Libraries -> Can see copied jar file.

            Now we can use the Classes available in jar file.

         */
        // C:\Users\sachink1\Documents\Courses\5. Java Essential Training\3. IntelliJ IDEA Project\files\source.txt

        /*
            Create a new directory files and create a source.txt inside it
         */
        File sourceFile = new File("files/source.txt");
        File destinationFile = new File("files/destination.txt");

        //to copy the files using commons-io
        try{
            FileUtils.copyFile(sourceFile, destinationFile);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }


    public static void readOnlineFiles() throws  IOException{
        //throws IOException to use .close() method , main should also throws IOException as well
        BufferedInputStream bis = null;
        InputStream is = null;
        try {
            String url = "https://www.w3schools.com/html/html_basic.asp";
            URL urlReader = new URL(url);
            is = urlReader.openStream();

            bis = new BufferedInputStream(is);

            StringBuilder sb = new StringBuilder();

            while(true){
                int data = bis.read();
                if(data==-1) break;
                sb.append((char)data);
            }

            System.out.println(sb);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            is.close();
            bis.close();
        }
    }

}
