<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Document</title>
            <c:set value="Aprendiendo JSP" var="pageTitle" />
        </head>

        <body>
            <h1>
                <c:out value="${pageTitle}" />
            </h1>
            <h2>Con:
                <c:out value="${profesor}" />
            </h2>
            <h6>
                <c:out value="${2+2}" />
            </h6>
            <h3>
                <c:out value="${nombres[2]}" />
            </h3>


            <c:forEach var="item" items="${numeros}">
                <h4>
                    <c:out value="No. ${item}" />
                    <c:choose>
                        <c:when test="${item % 2 == 0}">
                            Es par
                        </c:when>
                        <c:otherwise>
                            Es impar
                        </c:otherwise>
                    </c:choose>
                </h4>
            </c:forEach>

            <h3>Pilotos</h3>
            <ul>
                <c:forEach var="piloto" items="${nombres}">
                    <li>
                        <c:out value="${piloto}" />
                    </li>
                </c:forEach>
            </ul>


        </body>

        </html>