<%--
  Created by IntelliJ IDEA.
  User: tudor
  Date: 14-Apr-21
  Time: 11:54 PM
  To change this template use File | Settings | File Templates.
--%>
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
            <h1>Client</h1>
            <p class="lead">Detaliile cumparatorului </p>
        </div>


        <form:form commandName="order" class="form-horizontal">

        <h1>Informatii initiale</h1>


        <div class="form-group">
            <label for="name"> Nume </label>
            <form:input path="cart.customer.customerName" id="name" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="email"> Email </label>
            <form:input path="cart.customer.customerEmail" id="email" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="phone"> Telefon </label>
            <form:input path="cart.customer.customerPhone" id="phone" class="form-Control"/>
        </div>


        <br><br>

        <h3> Adresa de plata </h3>

        <div class="form-group">
            <label for="billingStreet"> Strada  </label>
            <!-- streetName apartine de clasa BillingAddress, iar Customer refera clasa BillingAddress -->
            <form:input path="cart.customer.billingAddress.streetName" id="billingStreet" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="billingApartmentNumber"> Apartament  </label>
            <form:input path="cart.customer.billingAddress.apartmentNumber" id="billingApartmentNumber" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="billingCity"> Oras </label>
            <form:input path="cart.customer.billingAddress.city" id="billingCity" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="billingState"> Judet  </label>
            <form:input path="cart.customer.billingAddress.state" id="billingState" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="billingCountry"> Tara  </label>
            <form:input path="cart.customer.billingAddress.country" id="billingCountry" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="billingZipCode"> Cod Postal </label>
            <form:input path="cart.customer.billingAddress.zipCode" id="billingZipCode" class="form-Control"/>
        </div>


        <input type="hidden" name="_flowExecutionKey" />

        <br><br>
        <input type ="submit" value="Next" class="btn btn-success" name="_eventId_customerInfoCollected" />
        <button class="btn btn-default" name="_eventId_cancel">Cancel</button>
        </form:form>


<%@include file="/WEB-INF/views/template/footer.jsp"%>