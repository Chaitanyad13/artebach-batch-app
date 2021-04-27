#!/bin/sh

# Delete file in directory/SubDirectory
Filepath_src=/NAS_SHARE/MIDDLEDATA/ubz_sips_internal/ubz-artebatch/src
Filepath_processed=/NAS_SHARE/MIDDLEDATA/ubz_sips_internal/ubz-artebatch/processedFiles
echo $Filepath
# Maximum days retention for reports
MAXDAYS=7

find $Filepath_src/* -mtime +$MAXDAYS -exec rm -r {} \;
find $Filepath_processed/* -mtime +$MAXDAYS -exec rm -r {} \;