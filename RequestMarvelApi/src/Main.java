
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class Main {
	public static void main(String[] args) {

		//URL para teste
		// MARVEL API: http://gateway.marvel.com:80/v1/public/characters/1009150 ÑOK
		// LOCAL  API: http://localhost:8080/RESTFullWebService/backend/user/service/index OK
		// FREE   API: http://services.groupkt.com/country/get/all 

		// 1. Criando um cliente
		Client cliente = ClientBuilder.newClient();

		// 2. Setanto o target para o cliente
		WebTarget targetClient = cliente.target("http://services.groupkt.com/country/get/all");

		// 3. Recebendo o retorno da API da Marvel
		System.out.println(targetClient.request(MediaType.APPLICATION_JSON).get(String.class) + " \nFim do resultado");
	}
}
