 <?php
 class Animal {
  private string $name;
  private string $age;
  public Persona $petHolder;

  public function __construct(string $name, string $age, Persona $pepHolder) {
    $this->name = $name;
    $this->age = $age;
    $this->pepHolder = $pepHolder;
  }


  //setters and getters
  function setName(string $name): self {
    $this->name = $name;
    return $this;
  }

  function getName(): string {
    return $this->name;
  }

  function setAge(int $age): self {
    $this->age = $age;
    return $this;
  }

  function getAge(int $age): int {
    return $this->$age;
  }

  public function setPetHolder(Persona $petHolder): self {
    $this->petHolder = $petHolder;
  }

  public function getPepHolder(): Persona {
    return $this->pepHolder;
  }
}
?>