program and process?
program are initially stored in hard disk, by clicking double times it comes to ram
for the cpu to work on program, program is shifted to ram, program in ram is program under execution,this is termed as process

Thread?
independently executes
its a program inside a program
light weight process
ex: multiple tabs in a browser, they are running paralelly
IDE - ex vs code editor, we are writting code, they are simultainously getting saved, error correction etc

diff b/w multithreading nd multitasking?
multiTasking
-multiple process concept
-isolation nd memory protection
-isolation and memory protection
-p1,p2,p3
-no of cpu is 1

multiThreading
-threads use same memory block p1-> t1,t2,t3..
-no isolation of memory
-multiple threads working on a single process, to increase productivity.
-no of cpu is more then or equal to 1

threads scheduling?
-scheduled for execution based on prirority,os sets the priority

Context switching
In thread
-it saves current thread state and switches to another thread of same process
-doesnt switches to meory address space
-fast
-cpu cache preserved

In process
-saves current state of process and switches ro another process by restoring its state.
-includes switching memory address space
-slow
-cpu cache flushed
