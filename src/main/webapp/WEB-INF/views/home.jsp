<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
</head>
<body>
	<h1>Calendar</h1>
	<table border="1" width="500">
		<tr>
			<th colspan="7">${year }년${month }월${day }일</th>
		</tr>
		<tr>
			<th>일</th>
			<th>월</th>
			<th>화</th>
			<th>수</th>
			<th>목</th>
			<th>금</th>
			<th>토</th>
		</tr>
		<c:forEach var="i" items="${ arr}">
			<c:choose>
				<c:when test="${i==0 }">
					<th></th>
				</c:when>
				<c:otherwise>
					<th>${i}</th>
				</c:otherwise>
			</c:choose>
			<c:set var="sum" value="${sum=sum+1}" />
			<c:if test="${sum%7==0 }">
				<tr></tr>
			</c:if>
		</c:forEach>
	</table>
</body>
</html>