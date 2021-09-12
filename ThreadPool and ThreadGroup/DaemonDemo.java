class DaemonThread extends Thread {

	public void run() {

		for(int i = 0; i < 5000; i++) {

			try {

				Thread.sleep(5000);
			} catch(InterruptedException ie) {

			}
			System.out.println(Thread.currentThread().getName());
		}
	}	
}

class DaemonDemo {

	public static void main(String[] args) {

		DaemonThread dt1 = new DaemonThread();
		DaemonThread dt2 = new DaemonThread();
		DaemonThread dt3 = new DaemonThread();

		dt1.start();
		dt2.start();
		dt3.start();
	}
}

/*
Microsoft Windows [Version 10.0.19043.1023]
(c) Microsoft Corporation. All rights reserved.

C:\Users\I-Net>D:

D:\>cd D:\Java\ThreadPool and ThreadGroup

D:\Java\ThreadPool and ThreadGroup>jps -v
13104 Jps -Dapplication.home=C:\Program Files\Java\jdk-11.0.7 -Xms8m -Djdk.module.main=jdk.jcmd
1984 DaemonDemo

D:\Java\ThreadPool and ThreadGroup>jstack 1984
2021-06-22 15:09:02
Full thread dump Java HotSpot(TM) 64-Bit Server VM (11.0.7+8-LTS mixed mode):

Threads class SMR info:
_java_thread_list=0x00000169769d9690, length=13, elements={
0x0000016975fd7000, 0x0000016975fe1800, 0x0000016976841800, 0x0000016976845000,
0x0000016976847000, 0x000001697684b800, 0x000001697684e000, 0x00000169769cc800,
0x00000169769f0800, 0x00000169769dd000, 0x00000169769de000, 0x00000169769df000,
0x0000016955340000
}

"Reference Handler" #2 daemon prio=10 os_prio=2 cpu=0.00ms elapsed=73.18s tid=0x0000016975fd7000 nid=0x8ec waiting on condition  [0x00000009bf4fe000]
   java.lang.Thread.State: RUNNABLE
        at java.lang.ref.Reference.waitForReferencePendingList(java.base@11.0.7/Native Method)
        at java.lang.ref.Reference.processPendingReferences(java.base@11.0.7/Reference.java:241)
        at java.lang.ref.Reference$ReferenceHandler.run(java.base@11.0.7/Reference.java:213)

"Finalizer" #3 daemon prio=8 os_prio=1 cpu=0.00ms elapsed=73.18s tid=0x0000016975fe1800 nid=0x18ac in Object.wait()  [0x00000009bf5fe000]
   java.lang.Thread.State: WAITING (on object monitor)
        at java.lang.Object.wait(java.base@11.0.7/Native Method)
        - waiting on <0x0000000089d08fa8> (a java.lang.ref.ReferenceQueue$Lock)
        at java.lang.ref.ReferenceQueue.remove(java.base@11.0.7/ReferenceQueue.java:155)
        - waiting to re-lock in wait() <0x0000000089d08fa8> (a java.lang.ref.ReferenceQueue$Lock)
        at java.lang.ref.ReferenceQueue.remove(java.base@11.0.7/ReferenceQueue.java:176)
        at java.lang.ref.Finalizer$FinalizerThread.run(java.base@11.0.7/Finalizer.java:170)

"Signal Dispatcher" #4 daemon prio=9 os_prio=2 cpu=0.00ms elapsed=73.17s tid=0x0000016976841800 nid=0x3384 runnable  [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"Attach Listener" #5 daemon prio=5 os_prio=2 cpu=0.00ms elapsed=73.17s tid=0x0000016976845000 nid=0x248c waiting on condition  [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"C2 CompilerThread0" #6 daemon prio=9 os_prio=2 cpu=15.63ms elapsed=73.17s tid=0x0000016976847000 nid=0x24cc waiting on condition  [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE
   No compile task

"C1 CompilerThread0" #9 daemon prio=9 os_prio=2 cpu=31.25ms elapsed=73.17s tid=0x000001697684b800 nid=0x2520 waiting on condition  [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE
   No compile task

"Sweeper thread" #10 daemon prio=9 os_prio=2 cpu=0.00ms elapsed=73.17s tid=0x000001697684e000 nid=0x1620 runnable  [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"Service Thread" #11 daemon prio=9 os_prio=0 cpu=0.00ms elapsed=73.14s tid=0x00000169769cc800 nid=0x2f5c runnable  [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"Common-Cleaner" #12 daemon prio=8 os_prio=1 cpu=0.00ms elapsed=73.14s tid=0x00000169769f0800 nid=0x24c4 in Object.wait()  [0x00000009bfdfe000]
   java.lang.Thread.State: TIMED_WAITING (on object monitor)
        at java.lang.Object.wait(java.base@11.0.7/Native Method)
        - waiting on <0x0000000089c25770> (a java.lang.ref.ReferenceQueue$Lock)
        at java.lang.ref.ReferenceQueue.remove(java.base@11.0.7/ReferenceQueue.java:155)
        - waiting to re-lock in wait() <0x0000000089c25770> (a java.lang.ref.ReferenceQueue$Lock)
        at jdk.internal.ref.CleanerImpl.run(java.base@11.0.7/CleanerImpl.java:148)
        at java.lang.Thread.run(java.base@11.0.7/Thread.java:834)
        at jdk.internal.misc.InnocuousThread.run(java.base@11.0.7/InnocuousThread.java:134)

"Thread-0" #13 prio=5 os_prio=0 cpu=0.00ms elapsed=73.12s tid=0x00000169769dd000 nid=0x2470 waiting on condition  [0x00000009bfeff000]
   java.lang.Thread.State: TIMED_WAITING (sleeping)
        at java.lang.Thread.sleep(java.base@11.0.7/Native Method)
        at DaemonThread.run(DaemonDemo.java:9)

"Thread-1" #14 prio=5 os_prio=0 cpu=0.00ms elapsed=73.12s tid=0x00000169769de000 nid=0x440 waiting on condition  [0x00000009bffff000]
   java.lang.Thread.State: TIMED_WAITING (sleeping)
        at java.lang.Thread.sleep(java.base@11.0.7/Native Method)
        at DaemonThread.run(DaemonDemo.java:9)

"Thread-2" #15 prio=5 os_prio=0 cpu=0.00ms elapsed=73.12s tid=0x00000169769df000 nid=0x1618 waiting on condition  [0x00000009c00ff000]
   java.lang.Thread.State: TIMED_WAITING (sleeping)
        at java.lang.Thread.sleep(java.base@11.0.7/Native Method)
        at DaemonThread.run(DaemonDemo.java:9)

"DestroyJavaVM" #16 prio=5 os_prio=0 cpu=93.75ms elapsed=73.12s tid=0x0000016955340000 nid=0x32fc waiting on condition  [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"VM Thread" os_prio=2 cpu=0.00ms elapsed=73.18s tid=0x0000016975fb3800 nid=0x2a4c runnable

"GC Thread#0" os_prio=2 cpu=0.00ms elapsed=73.21s tid=0x0000016955356000 nid=0x21b8 runnable

"G1 Main Marker" os_prio=2 cpu=0.00ms elapsed=73.21s tid=0x0000016955385000 nid=0xd80 runnable

"G1 Conc#0" os_prio=2 cpu=0.00ms elapsed=73.21s tid=0x0000016955386800 nid=0x1cc runnable

"G1 Refine#0" os_prio=2 cpu=0.00ms elapsed=73.21s tid=0x000001695542e800 nid=0x1740 runnable

"G1 Young RemSet Sampling" os_prio=2 cpu=0.00ms elapsed=73.21s tid=0x0000016975e19800 nid=0x2304 runnable
"VM Periodic Task Thread" os_prio=2 cpu=0.00ms elapsed=73.14s tid=0x00000169769ef800 nid=0xc48 waiting on condition

JNI global refs: 5, weak refs: 0

*/