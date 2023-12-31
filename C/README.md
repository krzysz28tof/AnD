# Sorting Algorithms in C

## Understanding C
### Pointers
```c
int a = 10;
int *aPtr = &a | int* aPtr = &a;
```
`a` is a variable, <br>
`aPtr` is a pointer variable, <br>
`&a` is the address of a.

By dereferencing a pointer variable we can edit the value at the given address.
```c
*aPtr = 2; //dereferences aPtr, changes value to 2 at (aPtr as a pointer variable).
```

#### Function Pointers
a function pointer points to the the code of the function <br>
```c
void func(int a){}

void (*func_ptr)(int) = &func;
```
`void` is the return type, <br>
`func_ptr` is the pointer variable, <br>
`int` is the type of the first parameter, <br>
`&func`

### Arrays
```c
int arr[3];
arr[0] = 1; arr[1] = 2, arr[2] = 3;
int arr[3] = {1, 2, 3};
int arr[] = {1, 2, 3};
```
It's difficult to determine size of array, <br>
and C has no out of bounds check.

### Functions
Returning a pointer to a variable, or array-address doesn't make sense, since all variables declared within a function are deleted after the execution of the function.

### Preprocessors / Macros
Preprocessors begin with a #, like #include or #ifndef. <br>
\#ifndef is a <i>macro</i>. Defining a macro replaces the macro by an expression, or block of code before compilation.