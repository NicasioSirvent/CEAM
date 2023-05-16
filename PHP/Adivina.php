<?php
$numero = random_int(5,20);

$intentos = 0;
for ($i = 1; $i < 6; $i++) {
  $intento = readline("Dime Numero " . ++$intentos);
  if ($intento == $numero) {
    echo "Has Acertado!";
    break;
  } else {
    if ($i == 5) {
      echo "Has Perdido!\n";
    } else {
      echo "Niet!.. Intentalo otra Vez\n";
    }
  }
} 