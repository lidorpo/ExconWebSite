package loginExmaple;

import java.io.IOException;

import javax.ws.rs.core.UriBuilder;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class LoginExample {
	private String path;
	private static final String url = "http://localhost:8080/ExconWS/excon/login";

	public LoginExample(String userName, String password) {
		path = url + "/" + userName + "/" + password;
	}

	public String TryLogin() throws IOException {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(UriBuilder.fromUri(path).build());
		String data = service.get(String.class);

		return data;
	}
}
