<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <title>Cachorro Info</title>
        <style>
             div {
                font-family: sans-serif;
                text-align: start;
                margin: 100px auto;
                width: 450px;
                background-color: #bbb3b3;
                border-radius: 15px;
                padding: 20px;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
                display: block;
             }

             h2 {
                text-decoration: underline;
                text-align: center;
             }

             table {
                 width: 100%;
                 border-collapse: collapse;
                 border: 2px solid #333;
             }

             table, th, td {
                 border: 1px solid #333;
             }

             th, td {
                 padding: 8px;
                 text-align: left;
             }
        </style>
    </head>
    <body>
    <div>
        <h2>Informações RGA do Cachorro</h2>
            <table>
                <tr>
                    <th>Nome</th>
                    <th>Espécie</th>
                    <th>Idade</th>
                    <th>Raça</th>
                    <th>Cor</th>
                    <th>Som</th>
                </tr>
                <tr>
                    <td><c:out value="${cachorro.nome}" /></td>
                    <td><c:out value="${cachorro.especie}" /></td>
                    <td><c:out value="${cachorro.idade}" /></td>
                    <td><c:out value="${cachorro.raca}" /></td>
                    <td><c:out value="${cachorro.cor}" /></td>
                    <td><c:out value="${cachorro.fazerSom()}" /></td>
                </tr>
            </table>
        <br>
        <a href="index.html">Voltar</a>
    </div>
    </body>
    </html>
