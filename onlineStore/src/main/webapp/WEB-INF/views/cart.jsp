<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: tudor
  Date: 10-Apr-21
  Time: 2:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@include file="/WEB-INF/views/template/header.jsp"%>
<div class="container-wrapper">
    <div class = "container">
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1> Cos de cumparaturi</h1>

                    <p>Toate produsele din cosul de cumparaturi vor putea fi previzualizate in aceasta sectiune!</p>
                </div>
            </div>
        </section>

        <section class="container" ng-app="cartApp">
            <div ng-controller = "cartCtrl" ng-init="initCartId('${cartId}')">
            <div>
                <a class="btn btn-danger pull-left" ng-click="clearCart()"><span
                        class="glyphicon glyphicon-remove-sign"></span>Goleste Cos</a>
                <a href="<spring:url value="/order/${cartId}"/>" class="btn btn-success pull-right"><span class="glyphicon-shopping-cart glyphicon"></span> Plaseaza Comanda </a>
            </div>

            <table class="table table-hover">
                <tr>
                    <th>Produs</th>
                    <th>Pret/buc</th>
                    <th>Cantitate</th>
                    <th>Pret</th>
                    <th>Actiune</th>
                </tr>
                <tr ng-repeat = "item in cart.cartItems">
                    <td>{{item.product.productName}}</td>
                    <td>{{item.product.productPrice}}</td>
                    <td>{{item.quantity}}</td>
                    <td>{{item.totalPrice}}</td>
                    <td><a href="#" class="label label-danger" ng-click="removeFromCart(item.product.productId)">
                        <span class="glyphicon glyphicon-remove"></span>Elimina</a></td>
                </tr>
                <tr>
                    <th></th>
                    <th></th>
                    <th>Total</th>
                    <th>{{calGrandTotal()}}</th>
                    <th></th>
                </tr>
            </table>

                <a href="<spring:url value="/product/productList/all" />" class="btn btn-default">Continua cumparaturile</a>
            </div>
        </section>
      </div>
</div>



<%@include file="/WEB-INF/views/template/footer.jsp"%>


<script>

    var cartApp = angular.module ("cartApp", []);

    cartApp.controller("cartCtrl", function ($scope, $http){

        $scope.refreshCart = function () {
            $http.get('/onlineStore/rest/cart/'+$scope.cartId).success(function (data) {
                $scope.cart=data;
            });
        };

        $scope.clearCart = function () {
            $http.delete('/onlineStore/rest/cart/'+$scope.cartId).success($scope.refreshCart());
        };

        $scope.initCartId = function (cartId) {
            $scope.cartId = cartId;
            $scope.refreshCart(cartId);
        };

        $scope.addToCart = function (productId) {
            $http.put('/onlineStore/rest/cart/add/'+productId).success(function () {
                alert("Produsul a fost adaugat in cos cu succes!")
            });
        };



        $scope.removeFromCart = function (productId) {
            $http.put('/onlineStore/rest/cart/remove/'+productId).success(function (data) {
                $scope.refreshCart();
            });
        };

        $scope.calGrandTotal = function () {
            var grandTotal=0;

            for (var i=0; i<$scope.cart.cartItems.length; i++) {
                grandTotal+=$scope.cart.cartItems[i].totalPrice;
            }

            return grandTotal;
        };
    });
</script>