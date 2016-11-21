# HandsOn - Consultando a API da Marvel com Java
Estudo para Hands On CI&amp;T

Este projeto foi um simples teste de como se faz para consumir dados e/ou informações de uma API.

No projeto foi usado
 * Eclipse (IDE) 
 * Linguagem Java (JSP)
 * Apache TomCat 7.0 - Server
 * Jersey - RESTful Web Services in Java.
 * Git - Github ;)

Anotações:
- Não é necessário baixar todos os arquivos e diretórios, para ver como se funiona apenas baixe a pasta [RequestMarvelApi], nela criei um "MAIN" simples e rápido.
 
- Para consumo da API da Marvel é necessário estar logado , para isso é necessário a chave publica e privada que são geradas no momento em que você cria a conta. Jersey vai auxiliar nesta conexão entre cliente(você) e servidor(Marvel API). O segredo está na classe WebTarget.
- Segue um exemplo da linha de código aonde se faz a requisição:
```sh

	String publicKey = "NUMERO_CHAVE_PUBLICA";

	String privateKey = "NUMERO_CHAVE_PRIVADA";

	Long currentTime = DateTimeUtils.currentTimeMillis();

	byte[] hash = org.apache.commons.codec.digest.DigestUtils.md5(currentTime + privateKey + publicKey);

	String result = new String(Hex.encodeHex(hash));

	Long currentTime = DateTimeUtils.currentTimeMillis();

	byte[] hash = org.apache.commons.codec.digest.DigestUtils.md5(currentTime + chavePrivada + chavePublica);

	WebTarget baseTarget = client.target("http://gateway.marvel.com:80/v1/public/characters/1009610")
		.queryParam("ts", currentTime).queryParam("apikey", chavePublica).queryParam("hash", result);
```
 
- URL's para consulta da API
   - MARVEL:   http://gateway.marvel.com:80/v1/public/characters/1009150 (necessário estar logado para ter retorno)
   - LOCAL:    http://localhost:8080/RESTFullWebService/backend/user/service/index
   - FREE API: http://services.groupkt.com/country/get/all 
 
- [Doc Api Marvel] para consulta de métodos "1009610 ID do Spider-Man"
- Link para o uso do [Jersey] 
- Link para consulta de [API's] que não exige login
- Link para o Git do [pablocabrera85] aonde tem um projeto completo para teste de consumo ( é necesário ter o Maven instalado )
- O retorno das consultas são em JSON, se necessário segue um link com um formatador de [Json]
- Configuração do arquivo web.xml para o uso do Jersey (Projeto/WebContent/WEB-INF/web.xml)
 
```sh
<servlet>
      <servlet-name>Jersey</servlet-name>
      <servlet-class>com.sun.jersey.spi.container.servlet.ServletContainer</servlet-class>
  </servlet>
  <servlet-mapping>
      <servlet-name>Jersey</servlet-name>
      <url-pattern>/backend/*</url-pattern>
  </servlet-mapping>
```
[RequestMarvelApi]: <https://github.com/AngeloAkm/HandsOn/tree/master/RequestMarvelApi>
 [Json]: <https://jsonformatter.curiousconcept.com/>
 [pablocabrera85]: <https://github.com/pablocabrera85/marvel-api-client>
 [Jersey]: <https://jersey.java.net/download.html>
 [API's]: <http://www.groupkt.com/post/f2129b88/free-restful-web-services-to-consume-and-test.htm>
 [Doc Api Marvel]: <http://developer.marvel.com/docs#!/public/getCreatorCollection_get_0>
