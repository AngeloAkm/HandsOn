# HandsOn
Estudo para Hands On CI&amp;T

Este projeto foi um simples teste de como se faz para consumir dados e/ou informações de uma API.

No projeto foi usado
 * Eclipse (IDE) 
 * Linguagem Java (JSP)
 * Apache TomCat 7.0 - Server
 * Jersey - RESTful Web Services in Java.
 * Git - Github ;)

Anotações:
 - Para consumo da API da Marvel é necessário estar logado ... não consegui via DHC ou pelo próprio projeto.
 - URL's para consulta da API
   - MARVEL:   http://gateway.marvel.com:80/v1/public/characters/1009150 (necessário estar logado para ter retorno)
   - LOCAL:    http://localhost:8080/RESTFullWebService/backend/user/service/index
   - FREE API: http://services.groupkt.com/country/get/all 
 - Link para o uso do [Jersey] 
 - Link para consulta de [API's] que não exige login
 - Configuração do arquivo web.xml (Projeto/WebContent/WEB-INF/web.xml)
 
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
 [Jersey]: <https://jersey.java.net/download.html>
 [API's]: <http://www.groupkt.com/post/f2129b88/free-restful-web-services-to-consume-and-test.htm>
