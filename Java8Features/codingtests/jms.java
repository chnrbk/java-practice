/*//Other imports are omitted for brevity
import javax.ws.rs.client.AsyncInvoker;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

String BASE_URI = 
    "http://localhost:8080/hr-services/webresources"; 
Client client = ClientBuilder.newClient();
WebTarget webTarget = client.target(BASE_URI).path("hr").path("departments");
AsyncInvoker asyncInvoker = 
    webTarget.request(APPLICATION_JSON).async();
Future<Response> responseFuture = asyncInvoker.get();
Response response = responseFuture.get();
List<Department> depts = response...*/