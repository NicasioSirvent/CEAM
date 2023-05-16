<?php
class Arbol extends Vegetal {
  private int $altura;

  public function __construct(int $altura) {
    $this->altura = $altura;
  }

  //getter
  public function getAltura(): int {
    return $this->altura;
  }
}