
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.apache.commons.codec.binary.Hex;
import org.joda.time.DateTimeUtils;

public class Main {

	public static void main(String[] args) {

		// Chave publica da conta na API da Marvel
		String publicKey = "NUMERO_CHAVE_PUBLICA";
		// Chave privada da conta na API da Marvel
		String privateKey = "NUMERO_CHAVE_PRIVADA";

		// Pegando a data e hora atual
		Long currentTime = DateTimeUtils.currentTimeMillis();

		// Gerando Hash - necessário para chamada/consumo da API da Marvel
		byte[] hash = org.apache.commons.codec.digest.DigestUtils.md5(currentTime + privateKey + publicKey);

		// Convertendo em string o hash gerado
		String result = new String(Hex.encodeHex(hash));

		// URL para teste
		// MARVEL API: http://gateway.marvel.com:80/v1/public/characters/1009150

		// LOCAL API:
		// http://localhost:8080/RESTFullWebService/backend/user/service/index
		// LOCAL API: http://localhost:8080/RESTFullWebService/backend/usuario

		// FREE API: http://services.groupkt.com/country/get/all

		// 1. Criando um client com Jersey
		Client client = ClientBuilder.newClient();

		// 2. Setanto o target para o cliente , estabelecendo conexão com a api e buscando seus resultados
		// WebTarget targetClient = cliente.target("http://localhost:8080/RESTFullWebService/backend/usuario");
		WebTarget baseTarget = client.target("http://gateway.marvel.com:80/v1/public/characters/1009610")
				.queryParam("ts", currentTime).queryParam("apikey", publicKey).queryParam("hash", result);

		// 3. Recebendo o retorno da API da Marvel
		// System.out.println(baseTarget.request(MediaType.TEXT_XML).get(String.class) + " \nFim do resultado");
		System.out.println(baseTarget.request(MediaType.APPLICATION_JSON).get(String.class) + " \nFim do resultado");

	}

}
