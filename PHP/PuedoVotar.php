<?php
$edad = readline("Dime tu edad:");
if ($edad > 18) {
  echo "Puedes Votar!\n";
} else {
  echo "No puedes votar, pero lo podras hacer dentro de " . 18 - $edad . " Años\n";
}