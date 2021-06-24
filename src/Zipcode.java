import com.sun.jdi.PathSearchingVirtualMachine;
import jdk.swing.interop.SwingInterOpUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;


  //  private HttpURLConnection conn;



public class Zipcode extends ServiceCommunicator{



    public static void main(String[] args){
        System.out.println(new Zipcode("33033").get());  //Here is where you can change your zipcode. use get method
        System.out.println(new Zipcode("32301").get());
        System.out.println(new Zipcode("30002").get());
        System.out.println(new Zipcode("11105").get());


    }
      //create constructor and super with ul and zipcode.
      Zipcode(String zipcode) {
            super("http://api.zippopotam.us/us/" + zipcode); //enters a url link for a zipcode

                   }


               }
