<%@taglib prefix ="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/views/template/header.jsp"%>


<div class="container-wrapper">
    <div class = "container">
        <div class="page-header">
            <h1>Adaugati un produs</h1>
            <p class="lead">Completati toate campurile pentru a adauga un produs!</p>
        </div>

        <!-- in action precizam path-ul unde se va face submit-->
        <!-- multipart/form-data suporta file upload-->
     <form:form action = "${pageContext.request.contextPath}/admin/product/addProduct" method = "post" commandName="product" enctype="multipart/form-data">
        <div class="form-group">
            <label for="name"> Nume</label><form:errors path="productName" cssStyle="color: #ff0000;"/>
            <form:input path="productName" id="name" class="form-Control"/>
        </div>

        <div class ="form-group">
            <label for="category">Categorie</label>
            <label class ="checkbox-inline"><form:radiobutton path ="productCategory" id="category" value="Telefon"/>Telefoane</label>
            <label class ="checkbox-inline"><form:radiobutton path ="productCategory" id="category" value="Laptop"/>Laptopuri</label>
            <label class ="checkbox-inline"><form:radiobutton path ="productCategory" id="category" value="Accesorii"/>Accesorii</label>
        </div>

        <div class="form-group">
            <label for="description"> Descriere</label>
            <form:textarea path="productDescription" id="description" class="form-Control"/>
        </div>

        <div class="form-group"> <form:errors path="productPrice" cssStyle="color: #ff0000;"/>
            <label for="price"> Pret</label>
            <form:input path="productPrice" id="price" class="form-Control"/>
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


        <div class="form-group"> <form:errors path="unitInStock" cssStyle="color: #ff0000;"/>
            <label for="unitsInStock">Unitati disponibile </label>
            <form:input path="unitInStock" id="unitsInStock" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="manufacturer">Producator</label>
            <form:input path="productManufacturer" id="manufacturer" class="form-Control"/>
        </div>

    <div class="form-group">
        <label class="control-label" for="productImage">Upload imagine</label>
        <form:input id="productImage" path="productImage" type="file" class="form:input-large"/>
    </div>



    <br><br>
        <input type ="submit" value="Submit" class="btn btn-success">
        <a href ="<c:url value="/admin/productInventory"/> " class="btn btn-danger">Cancel</a>
    </form:form>


<%@include file="/WEB-INF/views/template/footer.jsp"%>