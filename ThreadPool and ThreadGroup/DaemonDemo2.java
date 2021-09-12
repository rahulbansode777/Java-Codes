class DaemonThread extends Thread {

	public void run() {

		for(int i = 0; i < 5000; i++) {

			try {

				Thread.sleep(1000);
			} catch(InterruptedException ie) {

			}
			System.out.println(Thread.currentThread().getName());
		}
	}	
}

class DaemonDemo2 {

	public static void main(String[] args) {

		DaemonThread dt1 = new DaemonThread();
		DaemonThread dt2 = new DaemonThread();
		DaemonThread dt3 = new DaemonThread();

		dt2.setDaemon(true);

		dt1.start();
		dt2.start();
		dt3.start();
	}
}

/*
("Thread-1" #14 daemon" See Below)

D:\Java\ThreadPool and ThreadGroup>jps -v
6256 DaemonDemo2
1500 Jps -Dapplication.home=C:\Program Files\Java\jdk-11.0.7 -Xms8m -Djdk.module.main=jdk.jcmd

D:\Java\ThreadPool and ThreadGroup>jstack 6256
2021-06-22 15:20:11
Full thread dump Java HotSpot(TM) 64-Bit Server VM (11.0.7+8-LTS mixed mode):

Threads class SMR info:
_java_thread_list=0x0000013cb1109440, length=13, elements={
0x0000013cb0f51800, 0x0000013cb0f52800, 0x0000013cb074c800, 0x0000013cb074d800,
0x0000013cb0fa4800, 0x0000013cb0fa8000, 0x0000013cb0fa9000, 0x0000013cb1113800,
0x0000013cb113d000, 0x0000013cb113e000, 0x0000013cb113e800, 0x0000013cb112e800,
0x0000013c91295000
}

"Reference Handler" #2 daemon prio=10 os_prio=2 cpu=0.00ms elapsed=46.57s tid=0x0000013cb0f51800 nid=0x20a8 waiting on condition  [0x00000013b0eff000]
   java.lang.Thread.State: RUNNABLE
        at java.lang.ref.Reference.waitForReferencePendingList(java.base@11.0.7/Native Method)
        at java.lang.ref.Reference.processPendingReferences(java.base@11.0.7/Reference.java:241)
        at java.lang.ref.Reference$ReferenceHandler.run(java.base@11.0.7/Reference.java:213)

"Finalizer" #3 daemon prio=8 os_prio=1 cpu=0.00ms elapsed=46.57s tid=0x0000013cb0f52800 nid=0x1fe8 in Object.wait()  [0x00000013b0fff000]
   java.lang.Thread.State: WAITING (on object monitor)
        at java.lang.Object.wait(java.base@11.0.7/Native Method)
        - waiting on <0x0000000089d08fa8> (a java.lang.ref.ReferenceQueue$Lock)
        at java.lang.ref.ReferenceQueue.remove(java.base@11.0.7/ReferenceQueue.java:155)
        - waiting to re-lock in wait() <0x0000000089d08fa8> (a java.lang.ref.ReferenceQueue$Lock)
        at java.lang.ref.ReferenceQueue.remove(java.base@11.0.7/ReferenceQueue.java:176)
        at java.lang.ref.Finalizer$FinalizerThread.run(java.base@11.0.7/Finalizer.java:170)

"Signal Dispatcher" #4 daemon prio=9 os_prio=2 cpu=0.00ms elapsed=46.56s tid=0x0000013cb074c800 nid=0x2f98 runnable  [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"Attach Listener" #5 daemon prio=5 os_prio=2 cpu=0.00ms elapsed=46.56s tid=0x0000013cb074d800 nid=0x758 waiting on condition  [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"C2 CompilerThread0" #6 daemon prio=9 os_prio=2 cpu=15.63ms elapsed=46.56s tid=0x0000013cb0fa4800 nid=0xf8c waiting on condition  [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE
   No compile task

"C1 CompilerThread0" #9 daemon prio=9 os_prio=2 cpu=15.63ms elapsed=46.56s tid=0x0000013cb0fa8000 nid=0x2320 waiting on condition  [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE
   No compile task

"Sweeper thread" #10 daemon prio=9 os_prio=2 cpu=0.00ms elapsed=46.56s tid=0x0000013cb0fa9000 nid=0x197c runnable  [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"Service Thread" #11 daemon prio=9 os_prio=0 cpu=0.00ms elapsed=46.53s tid=0x0000013cb1113800 nid=0x20d4 runnable  [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"Common-Cleaner" #12 daemon prio=8 os_prio=1 cpu=0.00ms elapsed=46.53s tid=0x0000013cb113d000 nid=0x246c in Object.wait()  [0x00000013b17fe000]
   java.lang.Thread.State: TIMED_WAITING (on object monitor)
        at java.lang.Object.wait(java.base@11.0.7/Native Method)
        - waiting on <0x0000000089c25880> (a java.lang.ref.ReferenceQueue$Lock)
        at java.lang.ref.ReferenceQueue.remove(java.base@11.0.7/ReferenceQueue.java:155)
        - waiting to re-lock in wait() <0x0000000089c25880> (a java.lang.ref.ReferenceQueue$Lock)
        at jdk.internal.ref.CleanerImpl.run(java.base@11.0.7/CleanerImpl.java:148)
        at java.lang.Thread.run(java.base@11.0.7/Thread.java:834)
        at jdk.internal.misc.InnocuousThread.run(java.base@11.0.7/InnocuousThread.java:134)

"Thread-0" #13 prio=5 os_prio=0 cpu=0.00ms elapsed=46.53s tid=0x0000013cb113e000 nid=0x2328 waiting on condition  [0x00000013b18fe000]
   java.lang.Thread.State: TIMED_WAITING (sleeping)
        at java.lang.Thread.sleep(java.base@11.0.7/Native Method)
        at DaemonThread.run(DaemonDemo2.java:9)

"Thread-1" #14 daemon prio=5 os_prio=0 cpu=0.00ms elapsed=46.53s tid=0x0000013cb113e800 nid=0x2974 waiting on condition  [0x00000013b19ff000]
   java.lang.Thread.State: TIMED_WAITING (sleeping)
        at java.lang.Thread.sleep(java.base@11.0.7/Native Method)
        at DaemonThread.run(DaemonDemo2.java:9)

"Thread-2" #15 prio=5 os_prio=0 cpu=0.00ms elapsed=46.53s tid=0x0000013cb112e800 nid=0x100c waiting on condition  [0x00000013b1aff000]
   java.lang.Thread.State: TIMED_WAITING (sleeping)
        at java.lang.Thread.sleep(java.base@11.0.7/Native Method)
        at DaemonThread.run(DaemonDemo2.java:9)

"DestroyJavaVM" #16 prio=5 os_prio=0 cpu=109.38ms elapsed=46.53s tid=0x0000013c91295000 nid=0x2160 waiting on condition  [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"VM Thread" os_prio=2 cpu=0.00ms elapsed=46.57s tid=0x0000013cb071c800 nid=0x120c runnable

"GC Thread#0" os_prio=2 cpu=0.00ms elapsed=46.60s tid=0x0000013c912ab000 nid=0x25cc runnable

"G1 Main Marker" os_prio=2 cpu=0.00ms elapsed=46.60s tid=0x0000013c912d5800 nid=0x2570 runnable

"G1 Conc#0" os_prio=2 cpu=0.00ms elapsed=46.60s tid=0x0000013c912d6800 nid=0x2db0 runnable

"G1 Refine#0" os_prio=2 cpu=0.00ms elapsed=46.60s tid=0x0000013c9137e000 nid=0xe98 runnable

"G1 Young RemSet Sampling" os_prio=2 cpu=0.00ms elapsed=46.60s tid=0x0000013cb0580800 nid=0x18c8 runnable
"VM Periodic Task Thread" os_prio=2 cpu=0.00ms elapsed=46.53s tid=0x0000013cb113c800 nid=0xd48 waiting on condition

JNI global refs: 5, weak refs: 0

