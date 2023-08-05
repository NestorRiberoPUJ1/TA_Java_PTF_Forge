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
                <h1>Lista de idiomas</h1>
                <a href="/idiomas/new"><button>Agregar</button></a>

                <ul>
                    <c:forEach var="idioma" items="${idiomas}">
                        <li>
                            <c:out value="${idioma.getNombre()}" />
                        </li>
                    </c:forEach>
                </ul>
            </body>

            </html>