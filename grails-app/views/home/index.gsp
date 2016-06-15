<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
    <meta name="layout" content="main"/>
</head>

<body>
    <h1>Test Async Mail here!</h1>

    <a href="${createLink(controller: 'home', action: 'sendNormalMail')}" class="test-links">Send Normal Mail</a>
    <a href="${createLink(controller: 'home', action: 'sendAsyncMail')}" class="test-links">Send Async Mail</a>
    <a href="${createLink(controller: 'home', action: 'checkPerson')}" class="test-links">Check Data</a>
</body>
</html>