<%@include file="/WEB-INF/views/template/header.jsp"%>


<div class="container-wrapper">
    <div class = "container">
        <div class="page-header">
            <h1>Administrare produse</h1>
            <p class="lead">Din acest panou pot fi administrate produsele disponibile pe OnlineStore</p>
        </div>

        <c:if test="${pageContext.request.userPrincipal.name != null}">
        <h2>
            Bun venit, ${pageContext.request.userPrincipal.name} | <a href="<c:url value = "/j_spring_security_logout"/>">Logout</a>
        </h2>
        </c:if>

        <h3>
          <a href="<c:url value="/admin/productInventory"/>"> Inventar Produse</a>
        </h3>

        <p>Puteti vizualiza, modifica sau sterge produsele din inventar!</p>

        <h3>
            <a href="<c:url value="/admin/customer"/>"> Management clienti</a>
        </h3>

        <p>Puteti vizualiza, modifica sau sterge informatiile despre clienti!</p>

<%@include file="/WEB-INF/views/template/footer.jsp"%>