<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Document</title>
        </head>

        <body>
            <h1>Lista de usuarios</h1>
            <ul>
                <c:forEach var="usuario" items="${usuarios}">
                    <li>
                        <a href="/users/${usuario.getId()}">
                            <c:out value="${usuario.getNombres()}" />
                        </a>
                    </li>
                </c:forEach>
            </ul>
        </body>

        </html>