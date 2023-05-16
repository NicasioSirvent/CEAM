<?php
class Vegetal {
  private string $nombreVulgar;

  public function __construct(string $nombre) {
    $this->nombreVulgar = $nombre;
  }
  
  //getters and setters;

  function setNombreVulgar(string $name): self {
    $this->nombreVulgar = $name;
    return $this;
  }

  function getNombreVulgar(): string {
    return $this->nombreVulgar;
  }
}