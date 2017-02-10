#include <stdio.h>
#include "main.cpp"
int main(int argc, char** agrv) {
  ImmutableList* list = new ImmutableList();
  list->add(1);
  list->add(2);
  list->add(3);
  printf("Done!\n");
}
