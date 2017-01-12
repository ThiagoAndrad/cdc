<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Título</th>
				<th>Valores</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${products}" var="product">
			<tr>
				<td>
					<a href="/produtos/show?id=${product.id}">${product.title}</a>
				</td>
				<td>
					<c:forEach items="${product.prices}" var="price">
						[${price.value} - ${price.bookType}]					
					</c:forEach>
				</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>