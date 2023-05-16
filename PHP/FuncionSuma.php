<?php

function suma(int $num1, int $num2): int {
  return $num1 + $num2;
}

$numero1 = readline("Dime Primer Numero: ");
$numero2 = readline("Dime Segundo Numero: ");

echo "La suma es " . suma($numero1, $numero2) . "\n";