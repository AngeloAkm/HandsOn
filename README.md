# HandsOn
Estudo para Hands On CI&amp;T

Este projeto foi um simples teste de como se faz para consumir dados e/ou informações de uma API

Anotações:
 - Para consumo da API da Marvel é necessário estar logado ... não consegui via DHC ou pelo próprio projeto.
 - Segue link para o uso dor Jersey https://jersey.java.net/download.html
 - Configuração do arquivo web.xml (Projeto/WebContent/WEB-INF/web.xml)
 <servlet>
      <servlet-name>Jersey</servlet-name>
      <servlet-class>com.sun.jersey.spi.container.servlet.ServletContainer</servlet-class>
  </servlet>
  <servlet-mapping>
      <servlet-name>Jersey</servlet-name>
      <url-pattern>/backend/*</url-pattern>
  </servlet-mapping>
