# slick-leak-demo

Quick and dirty demo of a classloader leak.

## Instructions

1. Set java options -XX:MaxMetaspaceSize=128m (seems to be a reasonable size for this demo)
2. Start sbt
3. Run "test" several times until an OOME is thrown
