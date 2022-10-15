# Bash Scripting Roadmap

## Shell and Shell scripting

### Shell

Shell is a macro processor that uses commands to interact with the operating system (kernel) which can retrieve, process, and store information on a computer.

### Shell Scripting

Shell scripting is the process of compiling shell commands into a new file using a text editor.

## Bash and Bash Script

### Bash

Bash (Bourne-Again Shell) is a Unix shell and a command language interpreter that reads shell commands and interacts with the operating system to execute them

### Bash Script

A bash script is the compilation of bash commands or bash functions saved as an executable bash script file generally with the .sh extension.

## Importance and Benifits of Bash Scripting

- Well-structured commands
- Task Automation
- Transparency
- Transferability
- Efficiency

## Requirements

- A computer with bash installed (preferred linux or mac)

## Step 1

- Getting Familiar with Command Line

> The best way to learn to work in the command line is to practice and work with many different commands.   
Try doing your everyday task from command line rather than GUI.

## Step 2

- Writing, Checking & Executing Bash Scripts

### Writing the actual bach scripts

*Note: bash script starts with `#!/bin/bash` in the first line of script file.*   
Write the same commands that you used in command line but in a file line by lines.

For eg: A bash script to create a file named `learnbash.txt` and a directory named `ilovebash`

```
#!/bin/bash

touch learnbash.txt
mkdir ilovebash
```
### Checking your bash script

There's a program/tool called [shellcheck](https://www.shellcheck.net) which helps to find if there's any issue with the script and determine if it's a good or a bad script.

### Executeing the bash script

To execute or run a bash script you first need to give an executable permission to that script file.   
So learn about files and directory permissions.

## Step 3

- Get Creative & Practice

If you want to become good at anything, practice is the way to go.   
Automate your daily tasks writing bash scripts.

## Some basic commands to learn for bash scripting

These are only some basic commands. There are a lot more commands which you'll learn later automatically according to your needs.

- awk
- cat
- chmod
- cp
- curl
- cut
- diff
- echo
- find
- grep
- head
- locate
- ls
- man
- mkdir
- mv
- rm
- sed
- tail
- tar
- unzip
- wget
- whereis
- which
- whoami
- zip

## Important concepts to learn

- File Names and Permissions
- Variables and Comments
- Input and Output (Reading and Writing Files)
- Arguments
- Functions
- Decision Making
- String and Numeric Comparisons
- File test operators
- append and prepend
- Logical `AND` `OR` operator
- Arithmetic operations
- Loops
    - While loop
    - Until loop
    - For loop
    - Select loop
- Conditional Statements
    - if-else statement
    - case-esac statement
    - break-continue statement

## Useful Resources and Links

Find the name of a program if you only know the command name: <https://command-not-found.com>

Files and directory permission: <https://chmodcommand.com>

Linux Documentations: <https://linux.die.net>

GNU Bash manual: <https://www.gnu.org/software/bash/manual>

Command line tutorials: <https://www.youtube.com/user/TheFrugalComputerGuy>

Shell Scripting Tutorial: <https://www.youtube.com/playlist?list=PLS1QulWo1RIYmaxcEqw5JhK3b-6rgdWO_>

