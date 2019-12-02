<%--
    Document   : produtos
    Created on : 21/08/2019, 17:26:44
    Author     : gutol
--%>

<%@page import="modelos.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>Minha Loja</title>
      <link rel="stylesheet" href="css/bootstrap.min.css">
   </head>
   <body>

      <jsp:include page="menu.jsp">
         <jsp:param name="item" value="produtos" />
      </jsp:include>

      <div class="container">
         <h1>Produtos da Minha Loja!</h1>

         <%
            boolean logado = false;

            if (session != null
                    && session.getAttribute("logado") != null) {
               logado = (boolean) session.getAttribute("logado");
            }

            if (logado) {
         %>

         <form action="AddProduto" method="post">
            Descrição: <input name="descricao">
            Preço: <input name="preco">

            <button type="submit">OK</button>
         </form>


         <% } %>

         <%
            String init = request.getParameter("inicio");
            String end = request.getParameter("fim");

            int inicio = init != null ? Integer.parseInt(init) : 0;
            int fim = end != null ? Integer.parseInt(end) : 10;

         %>

         <div class="ofertas">
            <div class="row">
               <%    for (int i = inicio; i <fim; i++){
                         Produto p = Produto.lista.get(i);
               %>
         <div class="col-md-4">
            <div class="card mb-4" style="width: 18rem;">
               <img src="<%=p.getImagem()%>" class="img-responsive" alt="img" style="width: 200px; height:320px">
               <div class="card-body border-top">
                  <h5 class="card-title"> <a href="produto.jsp?id=<%= i %>"> <%=p.getDescricao()%> <a> </h5>
                  <p class="card-text">R$<%=p.getPreco()%></p>
                  <a href="#" class="btn btn-primary">comprar</a>
                  </div>
                  </div>
                  </div>
               <%}%>
               </div>
               </div>


      </div>

      <nav aria-label="Page navigation example">
         <ul class="pagination justify-content-center">
            <li class="page-item">
               </li>

            <li class="page-item"><a class="page-link" href="?inicio=0&fim=10">1</a></li>
            <li class="page-item"><a class="page-link" href="?inicio=10&fim=12">2</a></li>
               </nav>

               <script src="js/bootstrap.min.js"></script>
               </body>
               </html>