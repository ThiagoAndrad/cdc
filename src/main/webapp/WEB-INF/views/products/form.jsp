<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 
 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Produtos</title>
</head>
<body>
	 <form:form action="${spring:mvcUrl('PC#save').build()}" method="post" commandName="product">
		<div>
			<label for="title">Titulo</label>
			<input type="text" name="title" id="title"/>
			<form:errors path="title"/>
		</div>
		<div>
			<label for="description">Descrição</label>
			<textarea rows="10" cols="20" name="description" id="description"></textarea>
			<form:errors path="description"/>
		</div>
		<div>
			<label for="pages">Número de páginas</label>
			<input type="text" name="pages" id="pages"/>
			<form:errors path="pages"/>
		</div>
		<c:forEach items="${types}" var="bookType" varStatus="status" >
			<div>
				<label for="price_${bookType}">${bookType.nameType}</label>
				<input type="text" name="prices[${status.index}].value" id="price_${bookType}"/>
				<input type="hidden" name="prices[${status.index}].bookType" value="${bookType}"/>
			</div>
		</c:forEach>
		<div>
			<input type="submit" value="Enviar"/>
		</div>
	</form:form>
</body>
</html>