<%@ page pageEncoding="UTF-8"%>
<% String[] cine=(String[]) session.getAttribute("data"); %>
<h2><%= cine[1] %></h2>
<div class="cine-info">
	<div class="cine-info datos">
		<p><%= cine[4] %> -<%= cine[6] %></p>
		<p>Teléfono: <%= cine[5] %></p>
		<br>
		<div class="tabla">
			<% String[][] cinetarifas=(String[][]) session.getAttribute("mTarifas");
				boolean bolFila = true;
				for (String[] cinetarifa:cinetarifas){%>
					<div class=<%=bolFila ? "fila": "fila impar" %> >
						<div class="celda-titulo"><%= cinetarifa[0] %></div>
						<div class="celda"><%= cinetarifa[1] %></div>
					</div>
				<% bolFila=!bolFila;} %>
		</div>
		<div class="aviso">
			<p>A partir del 1ro de julio de 2016, Cinestar Multicines
				realizará el cobro de la comisión de S/. 1.00 adicional al tarifario
				vigente, a los usuarios que compren sus entradas por el aplicativo
				de Cine Papaya para Cine Star Comas, Excelsior, Las Américas,
				Benavides, Breña, San Juan, UNI, Aviación, Sur, Porteño, Tumbes y
				Tacna.</p>
		</div>
	</div>
	<img src="img/cine/1.2.jpg"> <br>
	<br>
	<h4>Los horarios de cada funcion estan sujetos a cambios sin
		previo aviso</h4>
	<br>
	<div class="cine-info peliculas">
		<div class="tabla">
			<div class="fila">
				<div class="celda-cabecera">Películas</div>
				<div class="celda-cabecera">Horarios</div>
			</div>
			<% String[][] cinepeliculas=(String[][]) session.getAttribute("mPeliculas");
				bolFila = false;
				for (String[] cinepelicula:cinepeliculas) {%>
			<div class=<%=bolFila ? "fila": "fila impar" %>>
				<div class="celda-titulo"><%= cinepelicula[0]%></div>
				<div class="celda"><%= cinepelicula[1]%></div>
			</div>
			<% bolFila=!bolFila;} %>
		</div>
	</div>
</div>
<div>
	<img style="float: left;" src="img/cine/<%= cine[0] %>.3.jpg"> <span
		class="tx_gris">Precios de los juegos: desde S/1.00 en todos
		los Cine Star.<br> Horario de atención de juegos es de 12:00 m
		hasta las 10:30 pm. <br />
	<br /> Visitános y diviértete con nosotros. <br />
	<br /> <b>CINESTAR</b>, siempre pensando en tí
	</span>
</div>
