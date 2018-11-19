#!/bin/bash

for x in {2..9}
do
	for y in {1..9}
	do
		echo $x x $y = `expr $x \* $y`
	done
done


