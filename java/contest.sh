#!/bin/sh

# This script streamlines the process of compiling and running a Java program.
# It requires 2 files to exist in the same directory: actual java file containing a 
# class of the same name (by default, the script looks for ContestProblem.java containing
# the ContestProblem class), and an input file also of the same name, but with *.in as 
# the extension (by default, ContestProblem.in), which is redirected to the Java program.
# 
# This script can be used in two ways:
#
# 1: (requires ContestProblem.java and ContestProblem.in to be in the same folder)
# 	$ ./contest.sh
#
# 2: (requires ProblemA.java and ProblemA.in to be in the same folder)
#	$ ./contest.sh ProblemA
#
#
# Copyright 2017 Trevor Masters
# 
#    Licensed under the Apache License, Version 2.0 (the "License");
#    you may not use this file except in compliance with the License.
#    You may obtain a copy of the License at
# 
#        http://www.apache.org/licenses/LICENSE-2.0
# 
#    Unless required by applicable law or agreed to in writing, software
#    distributed under the License is distributed on an "AS IS" BASIS,
#    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
#    See the License for the specific language governing permissions and
#    limitations under the License.
#  
# @author: Trevor Masters

echo "Compiling..."
if [ $# -eq 1 ];then
	NAME=$1
else
	NAME="ContestProblem"
fi
javac -encoding UTF-8 -sourcepath . -d . "$NAME.java"
OUT=$?
if [ $OUT -eq 0 ];then
	echo "Compile Successful!"
	echo "Running..."
	echo "----------------------------------------"
	java $NAME -XX:+UseSerialGC -Xss64m < "$NAME.in" 
	OUTT=$?
	if [ $OUTT -eq 0 ];then
		echo "----------------------------------------"
		echo "Done! Program returned exit code $OUTT"
	else
		echo "----------------------------------------"
		echo "Error! Program returned exit code $OUTT"
	fi
else
	echo "Compile Failed!"
	echo "Execution Cancelled!"
fi
