#!/bin/sh

# Delete file in directory/SubDirectory
Filepath=/NAS_SPOOL/MIDDLEDATA/ubz_sips_internal/ubz-artebatch
echo $Filepath
rm -rf $Filepath/*
