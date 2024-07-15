<!DOCTYPE html>
<html>
<head>
    <title>Result</title>
</head>
<body>
<h2>Selected Condiments:</h2>
<c:forEach var="item" items="${condiments}">
    <p>${item}</p>
</c:forEach>
</body>
</html>
