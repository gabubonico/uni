#!/bin/bash

if [ -f $1 ] && [ -x $1 ]
then 
	echo "$1 es un fichero ejecutable"
else
	echo "$1 NO es un fichero ejecutable"
fi
