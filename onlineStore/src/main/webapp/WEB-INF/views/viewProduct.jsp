<%@taglib prefix ="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@include file="/WEB-INF/views/template/header.jsp"%>


<div class="container-wrapper">
    <div class = "container">
        <div class="page-header">
            <h1>Detalii produs</h1>
            <p class="lead">Aceasta pagina contine informatii despre produsul selectat de dv.</p>
        </div>

        <div class="container" ng-app="cartApp">
            <div class="row">
                <div class="col-md-5">
                   <img src="<c:url value="/resources/images/${product.productId}.png"/> " alt="image"
                        style="width:100%"/>
                </div>
                <div class="col-md-5">
                    <h3>${product.productName}</h3>
                    <p>${product.productDescription}</p>
                    <p>
                        <strong> Producator </strong> : ${product.productManufacturer}
                    </p>
                    <p>
                        <strong> Categorie </strong> : ${product.productCategory}
                    </p>
                    <p>
                        <strong> Stare </strong> : ${product.productCondition}
                    </p>
                    <h4>${product.productPrice} RON</h4>
                    <br>

                    <c:set var="role" scope="page" value="${param.role}"/>
                    <c:set var ="url" scope="page" value="/product/productList"/>
                    <c:if test="${role='admin'}">
                        <c:set var ="url" scope="page" value="/admin/productInventory"/>
                    </c:if>


                    <!-- Daca esti admin si dai back, te va duce la productInventory,
                     daca esti user si dai back, te duce la productList-->
                    <p ng-controller="cartCtrl">
                        <a href="<c:url value="/product/productList/all" />" class="btn btn-default">Back</a>
                        <a href="#" class="btn btn-warning btn-large"
                           ng-click="addToCart('${product.productId}')"><span
                                class="glyphicon glyphicon-shopping-cart"></span>Adauga in cos!</a>
                        <a href="<spring:url value="/customer/cart" />"
                           class="btn btn-default"><span class="glyphicon glyphicon-hand-right"></span>Vezi cos</a>
                    </p>
                </div>
            </div>
        </div>



        <script src="<c:url value="/resources/js/controller.js" /> "></script>
<%@include file="/WEB-INF/views/template/footer.jsp"%>