#include <stdlib.h>
class ImmutableList {
public:
  ImmutableList() :
    total((int*) calloc(1, sizeof(int))),
    items((int*) malloc(100)) { }
  ~ImmutableList() {
    free(this->total);
    free(this->items);
  }
  void add(int number) {
    int pos = *(this->total);
    (this->items)[pos] = number;
    *(this->total) = pos + 1;
  }
private:
  int* const total;
  int* const items;
};
