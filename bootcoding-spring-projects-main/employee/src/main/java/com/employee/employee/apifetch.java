package com.employee.employee;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class apifetch {
    public static void main(String[] args) {
        try{

            String url="https://bard.google.com/extensions";
            HttpURLConnection conn= (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestMethod("GET");

            int responseCode = conn.getResponseCode();
            if(responseCode == 200){
                BufferedReader rs= new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputline;
                StringBuilder content = new StringBuilder();

                while((inputline=rs.readLine()) != null){
                    content.append(inputline);
                }
                rs.close();
                String JsonDdata = content.toString();
            } else {
                System.out.println("Error - "+ responseCode);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
