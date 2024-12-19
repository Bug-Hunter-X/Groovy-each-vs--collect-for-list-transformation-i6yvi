# Groovy each vs. collect
This example demonstrates a common misunderstanding in Groovy regarding the `each` and `collect` methods when working with lists.  The `each` method iterates through a list and performs an operation on each element, but it doesn't modify the original list and returns the original list itself.  In contrast, the `collect` method iterates and applies a transformation, returning a *new* list with the transformed values. 

The provided code shows how `each` returns the original list, highlighting the need to use `collect` for list transformations.