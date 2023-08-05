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
                <h1>Nuevo Idioma</h1>
                <form:form action="/idiomas" method="post" modelAttribute="idioma">
                    <p>
                        <form:label path="nombre">Nombre:</form:label>
                        <form:errors path="nombre" />
                        <form:input path="nombre" />
                    </p>
                    <input type="submit" value="Submit" />
                </form:form>
                <a href="/idiomas"><button>Volver</button></a>
            </body>

            </html>