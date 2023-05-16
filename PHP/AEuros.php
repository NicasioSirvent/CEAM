<?php
$cantidad = 0;

do {
  echo "Convertidor a Euros\n";
  print("1 - De Dingis a Euros: \n");
  print("2 - De Norces a Euros: \n");
  print("3 - De Pinglis a Euros: \n");
  print("4 - Salir \n");
  $numero = (int)readline("Elije Opcion:");

  if ($numero == 1) {
    $cantidad = readline("¿Cantidad de Dinglis?: ");
    print($cantidad . " Dinglis son " + $cantidad / 2 + " Euros.");
  } elseif ($numero == 2) {
    $cantidad = readline("¿Cantidad de Norces?: ");
    print($cantidad . " Norces son " + $cantidad / 2 + " Euros.");
  } elseif ($numero == 3) {
    $cantidad = readline("¿Cantidad de Pinglis?: ");
    print($cantidad . " Pinglis son " + $cantidad / 2 + " Euros.");
  } elseif ($numero == 4) {
    echo "Hasta Pronto!";
  } else {
    echo "Numero Erroneo!";
  }
} while ($numero != 4);
