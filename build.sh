#!/bin/bash

set -e

cd clojure-api-doc

rm -rf repo-docs/*

# Copy stable site files
echo "Copying static site files"
cp -R site/* repo-docs

# Build all branches
for branch in config/*/
do
  cd "$branch"
  ./build.sh
  cd ../..
done
