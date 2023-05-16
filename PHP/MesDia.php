<?php
$meses = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
 "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"];
$dias = ["Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"];

//pedimos dia y mes
$dia = readline("Dime Numero de Dia:");
$mes = readline("Dime Numero de Mes:");

echo "El dia es " . $dias[$dia-1] . " y el mes es " . $meses[$mes-1];