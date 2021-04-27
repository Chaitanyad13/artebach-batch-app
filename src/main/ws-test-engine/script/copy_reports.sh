#!/bin/sh

#Copy a file from one directory to Another

srcpath=/NAS_SPOOL/MIDDLEDATA/ubz_sips_internal/ubz-artebatch
dstpath=/NAS_SHARE/MIDDLEDATA/ubz_sips_internal/ubz-artebatch/src
echo $srcpath
echo $dstpath

if [ ! -d "$srcpath" ]; then
     echo "Source path: $srcpath doesn't exist"
     exit 1
fi
mkdir -p "$dstpath"
find $srcpath -name 'MAILFILE.ubz-reports.*' -exec cp -t $dstpath "{}" +
