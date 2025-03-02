components?
User space - 1
Kernel space - 2
Hardware

user space?
-gui- graphical user interface
-no hardware
-convinent environment user apps
-CLI- compand line interface ex: terminal,cammand line
-interact with kernel

Kernel?
-interacts with hardware
-heart of os

functions of kernel ?
\*\*process management?
process creation,termination
process and threads schedule
process synchronize
process communication

\*\*memory management?
allocate and delocate memory
free space management

\*\*file management?
file create , delete, directory management

\*\*i/o management
management and controlling of all operations

components of i/o
spooling
caching
buffering

types of kernel?
\*\*monolethic kernel-
all functional - process,file,memory,i/o
takes palce in kernel mode

software interrupts - interrupts particular process, in os, it is used to make switch b/w user and kernel mode.

these are less reliable, any malfunctional in any components

\*\*micro kernel-
memory and process management is in kernel mode - by ram and cpu
file and i/o management is in user mode

less bulky, more reliable
performance is less, more no. of switchings
ex: l4 linux, symbian os

user and kernel communication is by?
--IPC - inter process communication

--shared memory?
memory block, where if p1 and p2 communications using this shared space

--message passing?
logical pipe b/w two processes p1,p2, make communication with this

\*\*hybrid kernel-
combined approach
user mode - file management
kernel mode - process management, i/o management

ex: mac os,windows

\*\*nano and exo kernel
