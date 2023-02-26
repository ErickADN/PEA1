<%@page import="bean.Cine"%>
<%@ page import="java.util.List" %>
<%@ page pageEncoding="UTF-8" %>
<br/><h1>Nuestros Cines</h1><br/>
<% List<Cine> cines = (List<Cine>)session.getAttribute("data");
	for(Cine cine: cines) {
%>
<div class="contenido-cine">
    <img src="img/cine/<%= cine.getId()%>.1.jpg" widht="227" height="170">
    <div class="datos-cine">
        <h4><%= cine.getRazonSocial() %></h4>
        <span><%= cine.getDireccion() %> - <%= cine.getDetalle()%> <br><br>Teléfono: <%= cine.getTelefonos() %></span>
    </div>
    <br>
    <a href="svlCine?id=<%= cine.getId() %>">
        <img src="img/varios/ico-info2.png" width="150" height="40">
    </a>
</div>
<%}%>