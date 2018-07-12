import java.io.IOException;
import java.util.*;
import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.    CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class ConvertResponseDemo{
    public static final String ACCESS_KEY = "d032d7882007d149240aaa0836348cc4";
    public static final String BASE_URL = "http://apilayer.net/api/";
    public static final String ENDPOINT = "live";
    static double ans;
    String orgs1[]=new String[168];
    String orgd[]=new String[168];
   static ConvertResponseDemo cd=new ConvertResponseDemo();
    // this object is used for executing requests to the (REST) API
    static CloseableHttpClient httpClient = HttpClients.createDefault();
    
    public static double sendConvertRequest(String str1,String str2){
    	
        // the "from", "to" and "amount" can be set as variables
        HttpGet get = new HttpGet(BASE_URL + ENDPOINT + "?access_key=" + ACCESS_KEY);
        try {
            CloseableHttpResponse response =  httpClient.execute(get);
            HttpEntity entity = response.getEntity();
            JSONObject jsonObject = new JSONObject(EntityUtils.toString(entity));
            
            //System.out.println(jsonObject+"\n");
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            String S=jsonObject.getJSONObject("quotes").toString();
            StringTokenizer t=new StringTokenizer(S);
            String s1[]=new String[168]; String d[]=new String[168];
            int i=0; String temp;StringTokenizer t2;
            while(t.hasMoreTokens())
                {
                 
                temp=(t.nextToken(","));
                t2=new StringTokenizer(temp);
                int count=0;
                while(t2.hasMoreTokens())
                {
                    if(count==0) s1[i]= t2.nextToken(":");
                    if(count==1) d[i]= t2.nextToken(":");
                    {
                    
                    }
                    count++;
                }
                i++;
                }
            
            
            
                
            StringBuilder sb;
            StringBuilder sb1=new StringBuilder(s1[0]);
            StringBuilder sb2= new StringBuilder(d[167]);
                sb1.deleteCharAt(0);
                sb1.deleteCharAt(0);                
                sb1.deleteCharAt(6);
                s1[0]= sb1.toString();
                sb2.deleteCharAt(1);
                d[167]=sb2.toString();
                /*for(int j=0; j<d.length;j++)
            {
                //System.out.println(s1[j]);
                System.out.println(d[j]);
            }*/
            for(int x=1; x<168;x++)
            {
                sb=new StringBuilder(s1[x]);
                sb.deleteCharAt(0);
                sb.deleteCharAt(6);
                s1[x]= sb.toString();
            }
            /*for(int x=0; x<s1.length;x++)
            {
            System.out.println(s1[x]);
            }*/
            for(int j=0;j<168;j++)
            {
            	cd.orgs1[j]=s1[j];
            	cd.orgd[j]=d[j];
            }
            /*for(int j=0;j<cd.orgs1.length;j++)
            	System.out.println("hi"+cd.orgs1[j]);*/
             
            
            String fix= "USD";
            
            String trial1= fix.concat(str1);
            String trial2= fix.concat(str2);
            int w;
            int index1=-1;
            int index2=-1;
            for(w=0;w<168;w++)
            {
                if(trial1.equalsIgnoreCase(s1[w]))
                {
                 index1= w;
                 break;
                }
            }
            for(w=0;w<168;w++)
            {
                if(trial2.equalsIgnoreCase(s1[w]))
                {
                  index2= w;
                 break;
                }
            }
            
            //System.out.println(d[index1]+"= "+d[index2]);
            
            ans=( Double.parseDouble(d[index2]))/(Double.parseDouble(d[index1]));
            
            System.out.println("1GBP= "+ans+ "INR");
             // access the parsed JSON objects
            // System.out.println("From : " + jsonObject.getJSONObject("quotes").getString("from"));
            //System.out.println("USD to INR : " + jsonObject.getJSONObject("quotes").getDouble("USDINR"));
            // System.out.println("Amount : " + jsonObject.getString("source"));
            // System.out.println("Conversion Result : " + jsonObject.getDouble("result"));
            System.out.println("\n");
            response.close();
        } catch (ClientProtocolException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return ans;
    }

}