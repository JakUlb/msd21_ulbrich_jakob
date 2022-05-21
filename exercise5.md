#Exercise 4 - Branches and Logging
>##Why use logging libraries?
>###Development
> When developing code a huge amount of information has to be put out to understand the flow of the program and to detect possible errors.
> To do this many people put print statements in multiple parts of the code to check program behavior.
> logging libraries make this more efficient by delivering interfaces that let you choose detail of information and much more.
> 
> ### Software in use
> When software is deployed on the production systems, errors can occur, having logs of program flow makes troubleshooting possible and faster

##LogLevels of Log4J
1. All
2. Trace
3. Debug 
4. Info
5. Warn
6. Error
7. Fatal
8. OFF <br>
Levels let you set the detail of your logging information <br>
Hierarchy of Levels works from left to right. E.g.: if level Info is chosen INFO as well as everything right from it will be logged(except for OFF of course) <br>
ALL < DEBUG < INFO < WARN < ERROR < FATAL < OFF.
<br>

>##Configuration of logging in Log4J
>Log4j logging provides customization options.
> To do this so-called property files can be created.
> originally .property was the file type of choice but nowadays a switch to .xml has happened.
><br>
> you can configure formatting of logging messages, where logs get written(e.g. Console or textfile), what logging level gets written and if logs get overwritten or appended and much more.
> <br>
> you can find an example of log4j2.xml property file in the readme
