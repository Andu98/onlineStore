<%@taglib prefix ="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@include file="/WEB-INF/views/template/header.jsp"%>



<script>
    $(document).ready(function(){
        var searchCondition = '${searchCondition}';

        $('.table').DataTable({
            "lengthMenu": [[3,5,10,-1], [3,5,10, "All"]],
            "oSearch": {"sSearch": searchCondition}
        });
    });
</script>


<div class="container-wrapper">
    <div class = "container">
        <div class="page-header">
            <h1>Toate Produsele</h1>
            <p class="lead">Produse disponibile pe OnlineStore!</p>
        </div>
        <table class ="table table-striped table-hover">
            <thead>
            <tr class="bg-success">
                <th>Preview</th>
                <th>Nume Produs</th>
                <th>Categorie</th>
                <th>Stare</th>
                <th>Pret</th>
                <th></th>
            </tr>
            </thead>


            <%-- Deoarece avem mai multe produse, trebuie folosit foreach pentru a ne asigura ca sunt afisate toate produsele si detaliile lor --%>
            <c:forEach items ="${products}" var="product">
                <tr>
                    <td><img src="<c:url value="/resources/images/${product.productId}.png"/> " alt="image"
                             style="width:100%"/></td>
                    <td>${product.productName}</td>
                    <td>${product.productCategory}</td>
                    <td>${product.productCondition}</td>
                    <td>${product.productPrice} RON</td>
                    <td><a href="<spring:url value="/product/viewProduct/${product.productId}"/>"
                    ><span class="glyphicon glyphicon-info-sign"></span> </a></td>
                </tr>
            </c:forEach>
        </table>

<%@include file="/WEB-INF/views/template/footer.jsp"%>