system call?
user and kernel mode switch and kernel to hardware interaction is possible by system calls
implemented in c language in order to interact with hardware

Aim of system call?
creates a directory

ex: we are making a new folder, mkdir

user mode
system call interface
kernel mode
hardware

how do apps interacts with kernel ?
using system calls

types of system calls?
process control - end abort load execute create process terminate process wait for time allocate and free memory
file management - creat delete file open close read write operationd
device management - requiest deveice release device read write reposition logically attach
info maintainance - get time or date, set time or date get process ffile device attributes
communication management - create delete connections send and receive messages attach nd detach remote devices

some of system calls
process control - fork() exit() wait()
file management - open() read() write() chmod() close()
device management - loct() read() write()
info management - getpid() alarm() sleep()
communication - pipe() mmap()

In os, everything works in the form of tree, if we open terminal and create a new directory and make some operations

open terminal - parent tree
make directory - child root
