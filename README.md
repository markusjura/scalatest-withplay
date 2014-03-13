Project to demonstrate ScalaTest exceptions. Configuration
- Play 2.2.2
- ScalaTest 2.1.0

Run the tests in the activator consoleto see the exceptions:
```
$ test-only ApplicationSpec
```

On a failed test you reiceve the following exception:
```
Exception in thread "Thread-10" java.io.InvalidClassException: org.specs2.execute.Error; no valid constructor
	at java.io.ObjectStreamClass$ExceptionInfo.newInvalidClassException(ObjectStreamClass.java:150)
	at java.io.ObjectStreamClass.checkDeserialize(ObjectStreamClass.java:768)
	at java.io.ObjectInputStream.readOrdinaryObject(ObjectInputStream.java:1772)
	at java.io.ObjectInputStream.readObject0(ObjectInputStream.java:1350)
	at java.io.ObjectInputStream.defaultReadFields(ObjectInputStream.java:1990)
	at java.io.ObjectInputStream.readSerialData(ObjectInputStream.java:1915)
	at java.io.ObjectInputStream.readOrdinaryObject(ObjectInputStream.java:1798)
	at java.io.ObjectInputStream.readObject0(ObjectInputStream.java:1350)
	at java.io.ObjectInputStream.defaultReadFields(ObjectInputStream.java:1990)
	at java.io.ObjectInputStream.readSerialData(ObjectInputStream.java:1915)
	at java.io.ObjectInputStream.readOrdinaryObject(ObjectInputStream.java:1798)
	at java.io.ObjectInputStream.readObject0(ObjectInputStream.java:1350)
	at java.io.ObjectInputStream.defaultReadFields(ObjectInputStream.java:1990)
	at java.io.ObjectInputStream.readSerialData(ObjectInputStream.java:1915)
	at java.io.ObjectInputStream.readOrdinaryObject(ObjectInputStream.java:1798)
	at java.io.ObjectInputStream.readObject0(ObjectInputStream.java:1350)
	at java.io.ObjectInputStream.readObject(ObjectInputStream.java:370)
	at org.scalatest.tools.Framework$ScalaTestRunner$Skeleton$1$React.react(Framework.scala:903)
	at org.scalatest.tools.Framework$ScalaTestRunner$Skeleton$1.run(Framework.scala:892)
	at java.lang.Thread.run(Thread.java:744)
```

On a succeeded test you receive the following exception:
```
[info] - should render the index page
Reporter completed abruptly with an exception after receiving event: TestSucceeded(Ordinal(0, 6),ApplicationSpec,ApplicationSpec,Some(ApplicationSpec),Application should render the index page,render the index page,Vector(),Some(358),Some(IndentedText(- should render the index page,should render the index page,1)),Some(LineInFile(18,ApplicationSpec.scala)),Some(ApplicationSpec),None,main-ScalaTest-running-ApplicationSpec,1394701293776).
java.net.SocketException: Broken pipe
	at java.net.SocketOutputStream.socketWrite0(Native Method)
	at java.net.SocketOutputStream.socketWrite(SocketOutputStream.java:113)
	at java.net.SocketOutputStream.write(SocketOutputStream.java:159)
	at java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1876)
	at java.io.ObjectOutputStream$BlockDataOutputStream.setBlockDataMode(ObjectOutputStream.java:1785)
	at java.io.ObjectOutputStream.writeNonProxyDesc(ObjectOutputStream.java:1285)
	at java.io.ObjectOutputStream.writeClassDesc(ObjectOutputStream.java:1230)
	at java.io.ObjectOutputStream.writeOrdinaryObject(ObjectOutputStream.java:1426)
	at java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1177)
	at java.io.ObjectOutputStream.writeFatalException(ObjectOutputStream.java:1576)
	at java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:350)
	at org.scalatest.tools.SocketReporter.apply(SocketReporter.scala:31)
	at org.scalatest.DispatchReporter$Propagator$$anonfun$run$1.apply(DispatchReporter.scala:240)
	at org.scalatest.DispatchReporter$Propagator$$anonfun$run$1.apply(DispatchReporter.scala:239)
	at scala.collection.immutable.List.foreach(List.scala:318)
	at org.scalatest.DispatchReporter$Propagator.run(DispatchReporter.scala:239)
	at java.lang.Thread.run(Thread.java:744)
Reporter completed abruptly with an exception after receiving event: ScopeClosed(Ordinal(0, 7),Application,NameInfo(ApplicationSpec,ApplicationSpec,Some(ApplicationSpec),None),Some(MotionToSuppress),Some(LineInFile(12,ApplicationSpec.scala)),None,main-ScalaTest-running-ApplicationSpec,1394701293777).
java.net.SocketException: Broken pipe
	at java.net.SocketOutputStream.socketWrite0(Native Method)
	at java.net.SocketOutputStream.socketWrite(SocketOutputStream.java:113)
	at java.net.SocketOutputStream.write(SocketOutputStream.java:159)
	at java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1876)
	at java.io.ObjectOutputStream$BlockDataOutputStream.setBlockDataMode(ObjectOutputStream.java:1785)
	at java.io.ObjectOutputStream.writeNonProxyDesc(ObjectOutputStream.java:1285)
	at java.io.ObjectOutputStream.writeClassDesc(ObjectOutputStream.java:1230)
	at java.io.ObjectOutputStream.writeOrdinaryObject(ObjectOutputStream.java:1426)
	at java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1177)
	at java.io.ObjectOutputStream.writeFatalException(ObjectOutputStream.java:1576)
	at java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:350)
	at org.scalatest.tools.SocketReporter.apply(SocketReporter.scala:31)
	at org.scalatest.DispatchReporter$Propagator$$anonfun$run$1.apply(DispatchReporter.scala:240)
	at org.scalatest.DispatchReporter$Propagator$$anonfun$run$1.apply(DispatchReporter.scala:239)
	at scala.collection.immutable.List.foreach(List.scala:318)
	at org.scalatest.DispatchReporter$Propagator.run(DispatchReporter.scala:239)
	at java.lang.Thread.run(Thread.java:744)
Reporter completed abruptly with an exception after receiving event: SuiteCompleted(Ordinal(0, 8),ApplicationSpec,ApplicationSpec,Some(ApplicationSpec),Some(1004),Some(MotionToSuppress),Some(TopOfClass(ApplicationSpec)),None,None,main,1394701293781).
java.net.SocketException: Broken pipe
	at java.net.SocketOutputStream.socketWrite0(Native Method)
	at java.net.SocketOutputStream.socketWrite(SocketOutputStream.java:113)
	at java.net.SocketOutputStream.write(SocketOutputStream.java:159)
	at java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1876)
	at java.io.ObjectOutputStream$BlockDataOutputStream.setBlockDataMode(ObjectOutputStream.java:1785)
	at java.io.ObjectOutputStream.writeNonProxyDesc(ObjectOutputStream.java:1285)
	at java.io.ObjectOutputStream.writeClassDesc(ObjectOutputStream.java:1230)
	at java.io.ObjectOutputStream.writeOrdinaryObject(ObjectOutputStream.java:1426)
	at java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1177)
	at java.io.ObjectOutputStream.writeFatalException(ObjectOutputStream.java:1576)
	at java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:350)
	at org.scalatest.tools.SocketReporter.apply(SocketReporter.scala:31)
	at org.scalatest.DispatchReporter$Propagator$$anonfun$run$1.apply(DispatchReporter.scala:240)
	at org.scalatest.DispatchReporter$Propagator$$anonfun$run$1.apply(DispatchReporter.scala:239)
	at scala.collection.immutable.List.foreach(List.scala:318)
	at org.scalatest.DispatchReporter$Propagator.run(DispatchReporter.scala:239)
	at java.lang.Thread.run(Thread.java:744)
Reporter completed abruptly with an exception after receiving event: RunCompleted(Ordinal(0, 9),Some(1154),Some(Summary(1,1,0,0,0,1,0,0)),None,None,None,main,1394701293788).
java.net.SocketException: Broken pipe
	at java.net.SocketOutputStream.socketWrite0(Native Method)
	at java.net.SocketOutputStream.socketWrite(SocketOutputStream.java:113)
	at java.net.SocketOutputStream.write(SocketOutputStream.java:159)
	at java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1876)
	at java.io.ObjectOutputStream$BlockDataOutputStream.setBlockDataMode(ObjectOutputStream.java:1785)
	at java.io.ObjectOutputStream.writeNonProxyDesc(ObjectOutputStream.java:1285)
	at java.io.ObjectOutputStream.writeClassDesc(ObjectOutputStream.java:1230)
	at java.io.ObjectOutputStream.writeOrdinaryObject(ObjectOutputStream.java:1426)
	at java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1177)
	at java.io.ObjectOutputStream.writeFatalException(ObjectOutputStream.java:1576)
	at java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:350)
	at org.scalatest.tools.SocketReporter.apply(SocketReporter.scala:31)
	at org.scalatest.DispatchReporter$Propagator$$anonfun$run$1.apply(DispatchReporter.scala:240)
	at org.scalatest.DispatchReporter$Propagator$$anonfun$run$1.apply(DispatchReporter.scala:239)
	at scala.collection.immutable.List.foreach(List.scala:318)
	at org.scalatest.DispatchReporter$Propagator.run(DispatchReporter.scala:239)
	at java.lang.Thread.run(Thread.java:744)
Reporter completed abruptly with an exception on invocation of the dispose method.
java.net.SocketException: Broken pipe
	at java.net.SocketOutputStream.socketWrite0(Native Method)
	at java.net.SocketOutputStream.socketWrite(SocketOutputStream.java:113)
	at java.net.SocketOutputStream.write(SocketOutputStream.java:159)
	at java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1876)
	at java.io.ObjectOutputStream$BlockDataOutputStream.flush(ObjectOutputStream.java:1821)
	at java.io.ObjectOutputStream.flush(ObjectOutputStream.java:718)
	at org.scalatest.tools.SocketReporter.dispose(SocketReporter.scala:37)
	at org.scalatest.DispatchReporter$.propagateDispose(DispatchReporter.scala:312)
	at org.scalatest.DispatchReporter$Propagator$$anonfun$run$2.apply(DispatchReporter.scala:251)
	at org.scalatest.DispatchReporter$Propagator$$anonfun$run$2.apply(DispatchReporter.scala:250)
	at scala.collection.immutable.List.foreach(List.scala:318)
	at org.scalatest.DispatchReporter$Propagator.run(DispatchReporter.scala:250)
	at java.lang.Thread.run(Thread.java:744)
```

The exception are not thrown if all tests pass.