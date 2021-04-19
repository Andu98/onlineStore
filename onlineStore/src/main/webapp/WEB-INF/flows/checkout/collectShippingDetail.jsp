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

        <h3> Adresa de livrare </h3>

        <div class="form-group">
            <label for="shippingStreet"> Strada  </label>
            <!-- streetName apartine de clasa ShippingAddress, iar Customer refera clasa shippingAddress -->
            <form:input path="cart.customer.shippingAddress.streetName" id="shippingStreet" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="shippingApartmentNumber"> Apartament  </label>
            <form:input path="cart.customer.shippingAddress.apartmentNumber" id="shippingApartmentNumber" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="shippingCity"> Oras </label>
            <form:input path="cart.customer.shippingAddress.city" id="shippingCity" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="shippingState"> Judet  </label>
            <form:input path="cart.customer.shippingAddress.state" id="shippingState" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="shippingCountry"> Tara  </label>
            <form:input path="cart.customer.shippingAddress.country" id="shippingCountry" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="shippingZipCode"> Cod Postal </label>
            <form:input path="cart.customer.shippingAddress.zipCode" id="shippingZipCode" class="form-Control"/>
        </div>


        <input type="hidden" name="_flowExecutionKey" />

        <br><br>
        <button class="btn btn-default" name="_eventId_backToCollectCustomerInfo">Back</button>
        <input type ="submit" value="Next" class="btn btn-success" name="_eventId_shippingDetailCollected" />
        <button class="btn btn-default" name="_eventId_cancel">Cancel</button>
        </form:form>


<%@include file="/WEB-INF/views/template/footer.jsp"%>