#include <stdio.h>
#include <string.h>

int main(int argc, char const *argv[]) {
  char i[] = "hola";
  char* p = i;
  puts(p);
  printf("%c\n", *(p+2) );
  printf("tamaño: %d\n", (int)strlen(p+1));
  while(putchar(*p++));
  return 0;
}
