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
                <h1>Lista de Paises</h1>
                <a href="/paises/new"><button>Agregar</button></a>

                <ul>
                    <c:forEach var="pais" items="${paises}">
                        <li>
                            <a href="/paises/${pais.getId()}">
                                <c:out value="${pais.getNombre()}" />
                            </a>
                        </li>
                    </c:forEach>
                </ul>
            </body>

            </html>