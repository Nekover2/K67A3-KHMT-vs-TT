#!/bin/bash

read -p "Enter a number (just ONE, not 2 or more): " _num;

_sum=0;

while [[ _num -gt 0 ]]; do

	_tmp=$((_num%10));
	_num=$((_num/10));
	_sum=$((_sum+_tmp));
done; 

echo "Result: $_sum";