<?php

function volumenCubo(int $lado): int {
  return $lado * $lado * $lado;
}


while(true) {
  $lado = readline("Dime el Lado: \n");
  if ($lado == 0) {
    echo "Adios\n";
    break;
  }
  echo "El Volumen del cubo es " . volumenCubo($lado) . "u.a.\n";
}