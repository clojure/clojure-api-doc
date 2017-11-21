#!/bin/bash

set -e

# Create or refresh repo
if [[ ! -d repo ]]; then
  echo "Creating new clojure repo area"
  git clone https://github.com/clojure/clojure.git repo
else
  echo "Refreshing clojure repo area"
  git -C repo fetch
fi

# Create or clean output directory
if [[ ! -d repo-docs ]]; then
  echo "Creating new clojure gh-pages area"
  git clone https://github.com/clojure/clojure.git repo-docs
  git -C repo-docs co gh-pages
else
  echo "Refreshing clojure gh-pages area"	  
  git -C repo-docs fetch
fi
rm -rf repo-docs/*

# Copy stable site files
echo "Copying static site files"
cp -R site/* repo-docs

# Build all branches
for branch in config/*
do
  echo "Building $branch"
  cd "$branch"
  ./build.sh
  cd ../..
done	

# Commit
echo "Committing updated gh-pages branch"
# cd repo-docs
# git -C repo-docs commit -a -m "Update docs"
# git -C repo-docs push
