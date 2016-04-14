# Java Interview Questions #

This project is designed to test your skills as a back-end Java developer,
using the same tools and technologies our team employs on a daily basis.

This project contains a number of unit-tested challenges designed to make sure 
you have at least a basic familiarity with Java and the ability to solve general 
proramming problems.

## Necessary Tools ##

The majority of the software my team develops runs on Java and is built with
Maven. This project is no different. To get started, make sure you have 
[Java version 1.8.45 or later](https://java.com/en/download/) installed on 
your machine. Then, [download](https://maven.apache.org/download.cgi) and
[install](https://maven.apache.org/install.html) Apache Maven 3.3 or later.

When installation is complete, you should be able to run the following 
commands and see something similar to the following output:

```
> java -version
java version "1.8.0_45"
Java(TM) SE Runtime Environment (build 1.8.0_45-b14)
Java HotSpot(TM) 64-Bit Server VM (build 25.45-b02, mixed mode)

> mvn -v
Apache Maven 3.3.9 (bb52d8502b132ec0a5a3f4c09453c07478323dc5; 2015-11-10T11:41:47-05:00)
Maven home: /Users/thomas/Applications/bin/maven/3.3.9
Java version: 1.8.0_45, vendor: Oracle Corporation
Java home: /Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre
Default locale: en_US, platform encoding: UTF-8
OS name: "mac os x", version: "10.11.3", arch: "x86_64", family: "mac"
```

You'll also need an IDE. We usually use [Netbeans](https://netbeans.org/downloads/),
but we don't mandate it. [Eclipse](https://eclipse.org/downloads/) is fine if
you can convince it to read Maven projects, or you could use 
[IntelliJ](https://www.jetbrains.com/idea/download/), [Sublime](https://www.sublimetext.com/),
[Notepad++](https://notepad-plus-plus.org/download/v6.9.1.html), [vim](http://www.vim.org/),
[emacs](https://www.gnu.org/software/emacs/), or whatever else you like to code in.

## Using this project ##

To use this project, clone it:

`git clone https://github.com/thomasgalvin/JavaChallenge.git`

And then build it:

```
cd JavaChallenge
mvn clean install 
```

This will build some utilities needed by the unit tests. After that, we'll have 
you open up some of the subprojects in an IDE (or not, it's up to you), and let 
you work through them. 