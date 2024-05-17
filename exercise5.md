# Exercise 5
### Why are logging libraries used?
- To monitor an application 
- to debug and fix issues
- to review the history of an application and where a problem occurred
- Maintenance of an app in production
### Which Loglevel are there in Log4J and why do they exist
1. **OFF**: no logging at all
2. **FATAL**: only severe errors that causes the application to break down
3. **ERROR**: logs error events that are caused but the application continues running
4. **WARN**: logs potentially harmful situations and warnings that don't cause problems immediately but could be leading to errors in the future
5. **INFO**: informational messages that log the process
6. **DEBUG**: used to debug an application and find an issue but doesn't trace all of the information
7. **TRACE**: traces the whole execution of the program
8. **ALL**: logs all messages

### What configuration options are there in log4J?
Via Source-code, via XML file or a property file
Layout Options like SimpleLayout, PatternLayout, HTMLLayout or XMLLayout

Filters which only log specific LogLevels

Where the log should be saved:
- ConsoleAppender: log output in the console
- FileAppender: log output in a file
- RollingFileAppender: Logs output in a file and rolls the file over afer a certain size or date
- SocketAppender: logs to a remote server via Sockets

## Images
![ex5_1.png](resources%2Fimages%2Fex5_1.png)


![ex5_2.png](resources%2Fimages%2Fex5_2.png)


![ex5_3.png](resources%2Fimages%2Fex5_3.png)


![ex5_4.png](resources%2Fimages%2Fex5_4.png)