#include <stdio.h>

int cal_area_rec(int base, int altura);

int main(int argc, char const *argv[])
{
  int a = 0, b = 0, area = 0;
  printf("Base?: ");
  scanf("%d", &b);
  printf("Altura?: ");
  scanf("%d", &a);
  area = cal_area_rec(b, a);
  printf("El area es: %d\n", area);
  return 0;
}

int cal_area_rec(int base, int altura) {
  return base * altura;
}