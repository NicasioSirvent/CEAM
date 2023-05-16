<?php
$masa = readline("Dime tu Peso:");
$altura = readline("Dime tu Altura:");
$imc = $masa / ($altura * $altura);
echo "Tu IMC es " . $imc;