<?php
class Veterinario extends Persona {
  private int $salario;

  //constructor
  public function __construct(int $salario) {
    $this->salario = $salario;
  }

  public function setSalario(int $salario): self {
    $this->salario = $salario;
    return $this;
  }

  public function getSalario(): int {
    return $this->salario;
  }
}