<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
            <!DOCTYPE html>
            <html lang="en">

            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Document</title>
            </head>

            <body>
                <h1>
                    <c:out value="${pais.getNombre()}" />
                </h1>

                <h4>Agregar idioma</h4>
                <form:form action="/paises/edit/${pais.getId()}" method="post" modelAttribute="pais_model">
                    <p>
                        <form:select path="idiomas">
                            <form:options items="${idiomas}" itemLabel="nombre" itemValue="id" />
                        </form:select>
                    </p>
                    <input type="submit" value="Submit" />
                </form:form>

                <h2>Idiomas hablados</h2>
                <ul>
                    <c:forEach var="idioma" items="${pais.getIdiomas()}">
                        <li>
                            <c:out value="${idioma.getNombre()}" />
                        </li>
                    </c:forEach>
                </ul>

                <a href="/paises"><button>Volver</button></a>
            </body>

            </html>