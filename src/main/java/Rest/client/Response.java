package Rest.client;import org.apache.http.HttpRequest;import org.apache.http.HttpResponse;import org.apache.http.impl.client.DefaultHttpClient;import java.io.IOException;import static Rest.client.OutputServer.run;public class Response {    static void httpResponse(DefaultHttpClient httpClient, HttpResponse execute, HttpRequest Request) throws IOException {        if (execute.getStatusLine ().getStatusCode () != 200) {            throw new RuntimeException ( "Failed : HTTP error code : "                    + execute.getStatusLine ().getStatusCode () );        }        run ( httpClient, execute );    }}