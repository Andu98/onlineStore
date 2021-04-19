<%@taglib prefix ="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<div class="container-wrapper">
    <div class = "container">
        <div class="page-header">

            <h1>Editati Produsul</h1>

        </div>

        <!-- in action precizam path-ul unde se va face submit-->
        <!-- multipart/form-data suporta file upload-->
        <form:form action = "${pageContext.request.contextPath}/admin/product/editProduct" method = "post" commandName="product" enctype="multipart/form-data">

        <!-- reasigneaza id-ul catre noul produs realizat in urma update-ului -->
        <form:hidden path="productId" value="${product.productId}"/>


        <div class="form-group">
            <label for="name"> Nume</label>
            <form:input path="productName" id="name" class="form-Control" value ="${product.productName}"/>
        </div>

        <div class ="form-group">
            <label for="category">Categorie</label>
            <label class ="checkbox-inline"><form:radiobutton path ="productCategory" id="category" value="Telefon"/>Telefoane</label>
            <label class ="checkbox-inline"><form:radiobutton path ="productCategory" id="category" value="Laptop"/>Laptopuri</label>
            <label class ="checkbox-inline"><form:radiobutton path ="productCategory" id="category" value="Accesorii"/>Accesorii</label>
        </div>

        <div class="form-group">
            <label for="description"> Descriere</label>
            <form:textarea path="productDescription" id="description" class="form-Control" value="${product.productDescription}"/>
        </div>

        <div class="form-group">
            <label for="price"> Pret</label>
            <form:input path="productPrice" id="price" class="form-Control" value="${product.productPrice}"/>
        </div>

        <div class ="form-group">
            <label for="condition">Stare </label>
            <label class ="checkbox-inline"><form:radiobutton path ="productCondition" id="condition" value="Nou"/>Nou</label>
            <label class ="checkbox-inline"><form:radiobutton path ="productCondition" id="condition" value="SH"/>SH</label>
        </div>

        <div class ="form-group">
            <label for="status">Disponibilitate </label>
            <label class ="checkbox-inline"><form:radiobutton path ="productStatus" id="status" value="Disponibil"/>Disponibil</label>
            <label class ="checkbox-inline"><form:radiobutton path ="productStatus" id="status" value="Indisponibil"/>Indisponibil</label>
        </div>


        <div class="form-group">
            <label for="unitsInStock">Unitati disponibile </label>
            <form:input path="unitInStock" id="unitsInStock" class="form-Control" value="${product.unitInStock}"/>
        </div>

        <div class="form-group">
            <label for="manufacturer">Producator</label>
            <form:input path="productManufacturer" id="manufacturer" class="form-Control" value="${product.productManufacturer}"/>
        </div>

        <div class="form-group">
            <label class="control-label" for="productImage">Upload Picture</label>
            <form:input id="productImage" path="productImage" type="file" class="form:input-large"/>
        </div>



        <br><br>
        <input type ="submit" value="Submit" class="btn btn-success">
        <a href ="<c:url value="/admin/productInventory"/> " class="btn btn-danger">Cancel</a>
        </form:form>


<%@include file="/WEB-INF/views/template/footer.jsp"%>