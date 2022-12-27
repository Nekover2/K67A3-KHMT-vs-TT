#!/bin/bash

_count=`cat test.txt | grep -Eio "^(static)[a-zA-Z0-9]{0}" | wc -l`;

echo "Word Count: $_count"; 