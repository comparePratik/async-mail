<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
    <meta name="layout" content="main"/>
</head>

<body>
<h1>Persons</h1>

<table style="width:100%;">
    <thead>
    <tr>
        <th>Name</th>
        <th>Age</th>
        <th>Address</th>
    </tr>
    </thead>
    <tbody>
    <g:each in="${persons}" var="person" status="p">
        <tr>
            <td>${person.name}</td>
            <td>${person.age}</td>
            <td>${person.address}</td>
        </tr>
    </g:each>
    </tbody>
</table>

</body>
</html>