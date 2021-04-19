<%--
  Created by IntelliJ IDEA.
  User: tudor
  Date: 13-Apr-21
  Time: 7:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix ="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/views/template/header.jsp"%>


<div class="container-wrapper">
    <div class = "container">
        <div class="page-header">
            <h1>Inregistrare utilizator</h1>
            <p class="lead">Completati toate campurile pentru a crea un nou utilizator!</p>
        </div>

        <!-- in action precizam path-ul unde se va face submit-->
        <!-- multipart/form-data suporta file upload-->
        <form:form action = "${pageContext.request.contextPath}/register" method = "post" commandName="customer" >

        <h1>Informatii initiale</h1>


        <div class="form-group">
            <label for="name"> Nume </label> <form:errors path="customerName" cssStyle="color: #ff0000"/>
            <form:input path="customerName" id="name" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="email">Email</label><span style="color: #ff0000">${emailMsg}</span>
            <form:errors
                path="customerEmail" cssStyle="color: #ff0000"/>
            <form:input path="customerEmail" id="email" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="phone"> Telefon </label>
            <form:input path="customerPhone" id="phone" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="username">Username</label><span style="color: #ff0000">${usernameMsg}</span><form:errors
                path="username" cssStyle="color: #ff0000"/>
            <form:input path="username" id="username" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="password">Password</label><form:errors path="password" cssStyle="color: #ff0000"/>
            <form:password path="password" id="password" class="form-Control"/>
        </div>

        <br><br>

        <h3> Adresa de plata </h3>

        <div class="form-group">
            <label for="billingStreet"> Strada  </label>
            <!-- streetName apartine de clasa BillingAddress, iar Customer refera clasa BillingAddress -->
            <form:input path="billingAddress.streetName" id="billingStreet" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="billingApartmentNumber"> Apartament  </label>
            <form:input path="billingAddress.apartmentNumber" id="billingApartmentNumber" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="billingCity"> Oras </label>
            <form:input path="billingAddress.city" id="billingCity" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="billingState"> Judet  </label>
            <form:input path="billingAddress.state" id="billingState" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="billingCountry"> Tara  </label>
            <form:input path="billingAddress.country" id="billingCountry" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="billingZipCode"> Cod Postal </label>
            <form:input path="billingAddress.zipCode" id="billingZipCode" class="form-Control"/>
        </div>


<br><br>

        <h3>Adresa de livrare</h3>
            <div class="form-group">
                <label for="shippingStreet"> Strada  </label>
                <form:input path="shippingAddress.streetName" id="shippingStreet" class="form-Control"/>
            </div>

            <div class="form-group">
                <label for="shippingApartmentNumber"> Apartament  </label>
                <form:input path="shippingAddress.apartmentNumber" id="shippingApartmentNumber" class="form-Control"/>
            </div>

            <div class="form-group">
                <label for="shippingCity"> Oras </label>
                <form:input path="shippingAddress.city" id="shippingCity" class="form-Control"/>
            </div>

            <div class="form-group">
                <label for="shippingState"> Judet  </label>
                <form:input path="shippingAddress.state" id="shippingState" class="form-Control"/>
            </div>

            <div class="form-group">
                <label for="shippingCountry"> Tara  </label>
                <form:input path="shippingAddress.country" id="shippingCountry" class="form-Control"/>
            </div>

            <div class="form-group">
                <label for="shippingZipCode"> Cod Postal </label>
                <form:input path="shippingAddress.zipCode" id="shippingZipCode" class="form-Control"/>
            </div>



        <br><br>
        <input type ="submit" value="Submit" class="btn btn-success">
        <a href ="<c:url value="/"/> " class="btn btn-danger">Cancel</a>
        </form:form>


<%@include file="/WEB-INF/views/template/footer.jsp"%>