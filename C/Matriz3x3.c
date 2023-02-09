#include <stdio.h>

int main(int argc, char const *argv[]) {
  int m[3][3];
  for (int x = 0; x < 3; x++) {
    for (int y = 0; y < 3; y++) {
      printf("Posición %d %d: ", x, y);
      scanf("%d", &m[x][y]);
    }
  }
  for (int x = 0; x < 3; x++) {
    for (int y = 0; y < 3; y++) {
      printf("%d ", m[x][y]);
    }
    puts("");
  }
  return 0;
}
