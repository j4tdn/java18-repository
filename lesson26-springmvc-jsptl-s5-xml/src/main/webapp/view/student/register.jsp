<%@ include file="/taglib/base.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Page - Register</title>

<link href="${contextPath}/resources/css/style.css" rel="stylesheet">

</head>
<body>
	<h1 class="title">Student Page - Register</h1>

	<hr>
	
	<form:form modelAttribute="student" action="${contextPath}/student/register" method="post">
		<table>
			<tr>
				<td><label>ID</label></td>
				<td><form:input path="id"/></td>
				<td><form:errors path="id" cssClass="text-danger"/></td>
			</tr>
			<tr>
				<td><label>Name</label></td>
				<td><form:input path="name"/></td>
				<td><form:errors path="name" cssClass="text-danger"/></td>
			</tr>
			<tr>
				<td><label>Phone</label></td>
				<td><form:input path="phone"/></td>
				<td><form:errors path="phone" cssClass="text-danger"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"></td>
				<td><input type="reset" value="Reset"></td>
			</tr>
		</table>
	</form:form>

	<hr>

	<h3>
		<a href="${contextPath}/welcome" title="#">Back to Start page</a>
	</h3>

</body>
</html>