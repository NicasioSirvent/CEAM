<?php
/* 
Programa que pida 10 números enteros, clasificando esos números en dos arrays, 
uno de pares y otro de impares. 
Sacar la suma del subtotal de cada lista y la total.
*/

$pares = array();
$impares = array();

for ($i = 0; $i < 10; $i++) {
  $numero = readline("Dime Numero: ");
  if ($numero % 2 == 0) {
    $pares[] = $numero;
  } else {
    $impares[] = $numero;
  }
}

$suma_par = 0;
foreach ($pares as $num) {
  $suma_par += $num;
}

$suma_impar = 0;
foreach ($impares as $num) {
  $suma_impar += $num;
}

echo "Suma par: " . $suma_par . "\n";
echo "Suma impar: " . $suma_impar . "\n";
echo "Suma Total: " . $suma_par + $suma_impar . "\n";
