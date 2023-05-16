<?php
/*
Desarrolla un programa que pida el identificador de un alumno, seguido de su nota, hasta introducir un -1. Tras esto, sacar por pantalla:


Listado ordenado por id de alumnos.
Listado ordenado de notas separadas por Sobresaliente, Notable, etc…
Listado de los ids de alumnos aprobados ordenados por nota.
Listado de alumnos que obtendrán Beca (nota>8).
*/

$alumnos = array();

while (true) {
  $alumno = readline("Dime el Nombre del Alumno: ");
  if ( $alumno == -1 ) {
    break;
  }
  $nota = readline("Dime su nota: ");
  $alumnos[$alumno] = $nota;
}

//Lista ordenada por id
ksort($alumnos);
echo "Lista Ordenada por id de alumno\n";
foreach ($alumnos as $id => $nota) {
  echo "$id = $nota\n";
}

//Ordeno por nota
arsort($alumnos);

//Lista ordenada por notas.
foreach ($alumnos as $id => $nota) {
  if( $nota > 8) {
    $sobresalientes[$id] = $nota;
  } else if ( $nota > 6) {
    $notables[$id] = $nota;
  } else if ($nota > 5) {
    $suficientes[$id] = $nota;
  } else {
    $suspensos[$id] = $nota;
  } 
}

//Sobresalientes
if (!empty($sobresalientes)) {
  echo "Sobresalientes:\n";
  foreach ($sobresalientes as $id => $nota) {
    echo $id . ": " . $nota . "\n";
  }
}

//Notables
if (!empty($notables)) {
  echo "Notables:\n";
  foreach ($notables as $id => $nota) {
    echo $id . ": " . $nota . "\n";
  }
}

//Suficientes
echo "Suficientes:\n";
foreach ($suficientes as $id => $nota) {
  echo $id . ": " . $nota . "\n";
}

//Suspensos
echo "Suspensos:\n";
foreach ($suspensos as $id => $nota) {
  echo $id . ": " . $nota . "\n";
}


echo "Alumnos Aprobados Ordenados por Nota:\n";
//Aprobados ordenados por nota (ya ordenados)
foreach ($alumnos as $id => $nota) {
  if ($nota > 5) {
  echo $id . ": " . $nota . "\n";
  }
}

echo "Alumnos Becados:\n";
if(!empty($sobresalientes)) {
  foreach ($sobresalientes as $id => $nota) {
    echo $id . ": " . $nota . "\n";
  }
}

