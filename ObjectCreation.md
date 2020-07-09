<!-- class A{
    int a;
    public void show(){
        System.out.println("Hello");
    }
} -->

<!-- A obj // obj is reference not object coz in java objects are made in heap memory for that we use new keyword
A obj = new A() // constructor which allocates memory in heap
now obj is directly linked to that object in heap mem
obj.show() // accessing instance member function -->

# variables are of two types

* primitive 
* reference 

all these variables belong to stack memory
 __________________________________________________________
|name   |    value                                         |
|  i    |      5                                           |
| obj   |   hashcode(address) of the instance in heap mem  |
|__________________________________________________________
<!-- 
everytime we use new A() it will create an instance in heap and if we assign that to a
previously created reference then hashcode will be updated in stack -->

<!-- The previous object in heap is now ready for garbage collection -->
<!-- another way to destroy object is to use obj = null -->