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
            <a href="/">home</a>
        </body>

        </html>