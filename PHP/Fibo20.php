<?php
//Programa que pide un número entero n, y saca por pantalla los n primeros números 
//de la Serie de Fibonacci pero al revés (de mayor a menor). 1 < n < 20

$numero = readline("Dime un numero del 1 al 20: ");

$x = 1;
$y = 0;
$fibo = array();
for ($i = 0; $i <= 20; $i++) {
  $temp = $x + $y;
  $x = $y;
  $y = $temp;
  $fibo[] = $y;
}

echo "Los " . $numero . " numeros de Fibonnaci al reves son:\n";
for ($i = $numero; $i > 0; $i--) {
  echo " " . $fibo[$i];
}
echo "\n";