package com.myProject.SpringMVC.test;
import java.io.BufferedReader;
import java.io.IOException;  
import java.io.InputStream;  
import java.io.InputStreamReader;
import java.net.HttpURLConnection;  
import java.net.MalformedURLException;  
import java.net.URL;  
  
public class TestThread extends Thread{  
      
    private String httpurl;  
      
    public TestThread(String httpurl){  
        this.httpurl = httpurl;  
    }  
      
    public void run() {  
        HttpURLConnection connection = null;  
        InputStream urlStream = null;  
        URL url = null;  
          try {  
	            url = new URL(httpurl);  
	            connection = (HttpURLConnection)url.openConnection();
	            connection.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT)"); 
	            connection.setRequestProperty("X-Forwarded-For","112.211.0.125");
	            connection.setRequestProperty("http.proxyHost", "112.211.0.125");
	            connection.connect();  
	            urlStream = connection.getInputStream(); 
	            BufferedReader br = new BufferedReader(new InputStreamReader(urlStream));  
                StringBuilder buffer = new StringBuilder(); 
	            while(br.read()!=-1){
	            	buffer.append(br.readLine()).append("\r\n");
	            }
	            
	            //String content = new String(buffer);  
                //content = new String(content.getBytes("ISO-8859-1"), "UTF-8");  
                System.out.println(buffer); 
	           // System.out.println("buffer:"+buffer);
	            
	             
                //br.close();  

	            Thread.sleep(10L); 
            } catch (InterruptedException e) { 
            	
          }  
          catch (MalformedURLException e)  
          {  
            e.printStackTrace();  
          }  
          catch (IOException e) {  
            e.printStackTrace();  
          }  
      }  
}  
