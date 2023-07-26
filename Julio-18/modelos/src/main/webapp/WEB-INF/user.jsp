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
            <h1>
                <c:out value="${usuario.getNombres()} ${usuario.getApellidos()}" />
            </h1>

            <h2>
                <c:out value="${usuario.getCreated_at()}" />
            </h2>
            <c:choose>
                <c:when test="${usuario.getPasaporte()!=null}">
                    <h5>SI HAY PASAPORTE</h5>
                    <h4>Serial: <c:out value="${usuario.getPasaporte().getSerial()}" /> </h4>
                </c:when>
                <c:otherwise>
                    <h5>NO HAY PASAPORTE</h5>
                    <form action="/pasaporte" method="post">
                        <div>
                            <label for="serial">Serial</label>
                            <input type="text" name="serial" id="serial" >
                        </div>
                        <input type="hidden" name="usuario" value="${usuario.getId()}">
                        <button type="submit">CREAR</button>
                    </form>
                </c:otherwise>
            </c:choose> <a href="/">home</a>
        </body>

        </html>