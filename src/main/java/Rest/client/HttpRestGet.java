package Rest.client;import org.apache.http.HttpResponse;import org.apache.http.client.ClientProtocolException;import org.apache.http.client.methods.HttpGet;import org.apache.http.impl.client.DefaultHttpClient;import java.io.IOException;import static Rest.client.OutputServer.run;public class HttpRestGet {    public void get(){        try {            DefaultHttpClient httpClient = new DefaultHttpClient();            HttpGet getRequest = new HttpGet(                    "http://localhost:8080/rest/employees");            getRequest.addHeader("accept", "application/json");            HttpResponse response = httpClient.execute(getRequest);            if (response.getStatusLine().getStatusCode() != 200) {                throw new RuntimeException("Failed : HTTP error code : "                        + response.getStatusLine().getStatusCode());            }            run ( httpClient, response );        } catch (ClientProtocolException e) {            e.printStackTrace();        } catch (IOException e) {            e.printStackTrace();        }    }}