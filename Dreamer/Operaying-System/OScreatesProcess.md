Process?
app.js file we create
compiler will compile
Then convert into executable form by compiler
that form is named as program

OS converts program into process
process - program under execution
user have to make work

How os creates process?
-load the program and static data to memory
-Allocate runtime stack
Stack is part of memmory used to store local value
-Allocate heap
-IO tasks - input,output and error handler
-OS only knows main, it gives control to main
-This is convertion from program to process

Architecture of process?

stack - memory
heap
data
text - global and static data

stack overflow? - Base case set
out of memory? - deallocate the momroy object

Attributes of process?
process table - where it take down process p1,p2,p3...
Process control block - contains everything we need about process

PCB?
Process ID
program counter
Process state
Priority
Registers
Open file list
Open device list
