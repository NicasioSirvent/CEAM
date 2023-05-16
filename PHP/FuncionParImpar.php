<?php

function ParImpar(int $num): String {
  if ($num % 2 == 0) {
    return "Par";
  } else {
    return "Impar";
  }
}

$numero = readline("Dime un Numero: \n");
echo "El numero es " . ParImpar($numero) . "\n";