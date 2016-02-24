package Entrypoint;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
public class HttpClientMain {

	private static String url = "http://www.google.com";
			
			public static void main()
			{
				HttpClient client = new DefaultHttpClient();
				
				HttpPost post= new HttpPost(url);
				HttpResponse response= null;
				
				try {
					
					response=client.execute(post);
;					
				} catch (Exception e) {
					// TODO: handle exception
				}
				

				
				
				
		
			}
}
