<?php
$desde = readline("Dime Primer Numero:");
$hasta = readline("Dime Segundo Numero:");

for ($i = $desde; $i <= $hasta; $i++) {
  if (($i % 4 == 0) && ($i % 100 != 0) || ( ($i % 100 == 0 ) && ($i % 400 == 0))) {
    print("$i\n");
  }
}
