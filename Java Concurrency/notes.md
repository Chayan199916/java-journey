# Diff between volatile and atomic

Two problems are there

- visibility problem

let's say there are two threads thread1 and thread2
there is a golbal var flag which is initialized to true. one thread executes
while(flag){} to ensure it doesn't go into infinite loop, another thread makes flag = false. But it doesn't work in that way. if we look into mem organization
two threads have respected copies of flag in their local caches. so even if one thread makes it false, it won't be reflected in other thread's local cache. So we need volatile keyword. if we add volatile before decalring flag now when one thread will change it's value it will be flushed to shared mem and will be reflected in the local
cache of other thread.

- synchronization problem

let's say x = 1 globally initialized and two threads are performing x++ so we can expect the final output as 3 but it won't work that way. this x++ is a compound operation(x = x + 1; one read one write) so it might be possible that before one thread updated x to 2, other thread reads the value as 1 so the updation made gets lost. to avoid this we can use synchronized method
synchronized(obj){
x++;
}
this ensures that only when one thread finishes all operations, other thread gets chance. another way is to use AtomicInteger value = new AtomicInteger(1);
value.increment(); so this ensures read and writes are done atomically.
