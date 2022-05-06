CLASSPATH=lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar:.
javac -cp $CLASSPATH MarkdownParseTest.java
java -cp $CLASSPATH org.junit.runner.JUnitCore MarkdownParseTest