<?php
class Persona {
  private string $name;
  private int $age;

  //constructor
  public function __construct(string $name, int $age) {
    $this->name = $name;
    $this->age = $age;
  }

  //setters and getters
  public function setName(string $miname): self {
    $this->name = $miname;
    return $this;
  }

  public function getName(): string {
    return $this->name;
  }

  public function setAge(int $age): self {
    $this.$age = $age;
    return $this;
  }

  public function getAge(int $age): int {
    return $this->$age;
  }
}
?>