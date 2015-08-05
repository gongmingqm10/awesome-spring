<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<c:set var="pageTitle" scope="request" value="漂流阅读－用户"/>
<%@ include file="../header.jsp" %>

<div class="container">
    <div class="page_header">
        <h3>用户列表</h3>
    </div>
    <table class="table table-striped">
        <thead>
            <tr>
                <th>姓名</th>
                <th>城市</th>
                <th>Email</th>
                <th>手机</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${users}" var="user">
            <tr>
                <td>${user.username}</td>
                <td>${user.city}</td>
                <td>${user.email}</td>
                <td>${user.telephone}</td>
            </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

<%@ include file="../footer.jsp" %>