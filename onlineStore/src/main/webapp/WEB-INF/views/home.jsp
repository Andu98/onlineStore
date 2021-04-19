<%@taglib prefix ="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/views/template/header.jsp"%>


<!-- Carousel
================================================== -->
<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>
    <div class="carousel-inner" role="listbox">
        <div class="item active">
            <img class="first-slide home-image" src="<c:url value="/resources/images/back2.jpg"/>" alt="First slide">
            <div class="container">
                <div class="carousel-caption">
                    <h1>Pe OnlineStore gasesti orice!</h1>
                    <p>Pe site-ul nostru gasiti o gama foarte larga de produse, atat noi cat si SH.</p>
                    
                </div>
            </div>
        </div>
        <div class="item">
            <img class="second-slide home-image" src="<c:url value="/resources/images/back1.jpg"/>" alt="Second slide">
            <div class="container">
                <div class="carousel-caption">
                    <h1>Transportul este acoperit de noi!</h1>
                    <p> Daca veti efectua comenzi pe site-ul OnlineStore, toate comenzile vor avea livrarea gratuita pentru produsele mai scumpe de 60 de lei.</p>

                </div>
            </div>
        </div>
        <div class="item">
            <img class="third-slide home-image" src="<c:url value="/resources/images/back3.jpg"/>" alt="Third slide">
            <div class="container">
                <div class="carousel-caption">
                    <h1>Promovare la doar 10 lei/luna.</h1>
                    <p>Daca doriti ca produsul dumneavoastra sa fie promovat in recomandari, pretul standard per produs este de 10 lei/luna</p>

                </div>
            </div>
        </div>
    </div>
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div><!-- /.carousel -->


<!-- Marketing messaging and featurettes
================================================== -->
<!-- Wrap the rest of the page in another container to center all the content. -->

<div class="container marketing">
    <!-- Three columns of text below the carousel -->
    <div class="row">
        <div class="col-lg-4">
            <a class="btn btn-default" href="<c:url value="/product/productList?searchCondition=Telefon" />"
               role="button">
                <img class="img-circle" src="<c:url value="/resources/images/11.jpg" />" alt="Instrument
                Image" width="140" height="140"></a>

            <h2>Telefoane</h2>
            <p>Pe site-ul OnlineStore puteti gasi o gama foarte variata de telefoane mobile.</p>

        </div><!-- /.col-lg-4 -->



        <div class="row">
            <div class="col-lg-4">
                <a class="btn btn-default" href="<c:url value="/product/productList?searchCondition=Laptop" />"
                   role="button">
                    <img class="img-circle" src="<c:url value="/resources/images/14.jpg" />" alt="Instrument
                Image" width="140" height="140"></a>

                <h2>Laptopuri</h2>
                <p>Laptopuri noi si SH. </p>

            </div><!-- /.col-lg-4 -->

            <div class="row">
                <div class="col-lg-4">
                    <a class="btn btn-default" href="<c:url value="/product/productList?searchCondition=Accesorii" />"
                       role="button">
                        <img class="img-circle" src="<c:url value="/resources/images/13.jpg" />" alt="Instrument
                Image" width="140" height="140"></a>

                    <h2>Accesorii</h2>
                    <p>Gasiti cele mai potrivite accesorii pentru gadget-urile dv.</p>

                </div><!-- /.col-lg-4 -->


            </div><!-- /.row -->

            <%@include file="/WEB-INF/views/template/footer.jsp" %>
