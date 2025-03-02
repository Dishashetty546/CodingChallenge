Goals?
-max cpu utilization
-less process starvation
-higher priority job execution

Types?
-single processing - MS DOS
-batch - ATLAS
-multiprogramming - THE
-multitasking - CTSS
-multi processing - WINDOWS
-distributed - LOCUS
-real time os - ATCS

\*single - only 1 process exicute at a time from a ready queue

\*Batch - they create jobs using punch cards, then assign multiple jobs in a single batch, multiple jobs exicute same time if they are in same batch, priorities cant set, starvation happens. cpu may be idle in some situation

\*multiprogramming - cpu utilization happens, where cpu is buzy with one or the other jobs, single cpu,context switching for processes, switch happens when current job goes to wait state, cpu idle time reduced.

\*multitasking - logical extention of multiprogramming, single cpu, able to run more then 1 at a time, simultainously, context switching and time sharing, cpu idle time is more reduced.

\*Multiprocessing - more then 1 cpi in a single computer, 1 cpu fails other will work, less starvation,better throughtput, this is used more recently.

\*Distributed - >=1 cpu , >=1 memory , >=gpu, loosely connected autonomous, collection of independent networks,
RTOS - real time os - error free, with tight time boundries, air traffic control system.
