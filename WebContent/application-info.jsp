<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Applications Information</title>
<link href="style.css" type="text/css" rel="stylesheet">
</head>
<body>

<header class="header">

<h2>LIST OF APPLICATION ON GOOGLE PLAY</h2>

</header>


<table>
<tr>
    <th>Name</th>
    <th>Category</th>
    <th>Downloads</th>
    <th>Reviews</th>
</tr>

<c:forEach var="x" items="${MY_APPS}">

<tr>
<td>${x.name}</td>
<td>${x.category}</td>
<td>${x.downloads}</td>
<td>${x.reviews}</td>
</tr>

</c:forEach>



</table>


</body>
</html>