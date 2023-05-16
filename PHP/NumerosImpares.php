<?php
$n1 = readline("Dime Primer Numero:");
$n2 = readline("Dime Segundo Numero:");

if ($n1 < $n2) {
  for ( $i = $n1; $i <= $n2; $i++ ) {
    if ($i % 2 == 1) {
      echo $i . ' ';
    }
  }
}