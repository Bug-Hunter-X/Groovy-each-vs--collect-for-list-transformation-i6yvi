def list = [1, 2, 3]
println list.each { it * 2 } //This will print the list itself, not the doubled values

//Correct way
def list = [1, 2, 3]
println list.collect { it * 2 } //This will print the doubled values [2, 4, 6]