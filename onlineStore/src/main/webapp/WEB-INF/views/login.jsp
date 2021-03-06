<%--
  Created by IntelliJ IDEA.
  User: tudor
  Date: 09-Apr-21
  Time: 10:37 PM
  To change this template use File | Settings | File Templates.
--%>

<%@include file="/WEB-INF/views/template/header.jsp"%>

<div class ="container-wrapper">
    <div class="container">
        <div id="login-bar">
            <h2>Login</h2>
            <c:if test="${not empty msg}">
                <div class="msg">${msg}</div>
            </c:if>

            <form name ="loginForm" action="<c:url value="/j_spring_security_check"/>"method="post">
                <!--Daca avem erori in LoginCon afiseaza eroarea -->
                <c:if test="${not empty error}">
                    <div class="error"style="color:#ff0000;">${error}</div>
                </c:if>
                <div class="form-group">
                    <label for="username">Username: </label>
                    <input type="text" id="username"name="username"class="form-control"/>
                </div>
                <div class="form-group">
                    <label for="password">Parola</label>
                    <input type="password" id="password" name="password"class="form-control"/>
                </div>
                <input type="submit" value="Submit" class="btn btn-default">
                <!-- protectie cross script-->
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
            </form>
        </div>

    </div>
</div>

<%@include file="/WEB-INF/views/template/footer.jsp"%>