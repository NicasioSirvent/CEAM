#include <stdio.h>
int main(int argc, char const *argv[]) {
  float vector[3];
  printf("Dime un vector: ");
  scanf("%f,%f,%f", &vector[0], &vector[1], &vector[2]);
  puts("Ahi Va!");
  printf("%.2f, %.2f, %.2f\n", vector[0], vector[1], vector[2]);
  puts("---------------------");
  for (int i=0; i < sizeof(vector)/sizeof(float); i++)
      printf("%.2f\n", vector[i]);
  puts("---------------------");

  return 0;
}