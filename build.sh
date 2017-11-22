#!/bin/bash

set -e

# Create or refresh repo
if [[ ! -d repo ]]; then
  echo "Creating new clojure repo area"
  git clone git@github.com:clojure/clojure.git repo
else
  echo "Refreshing clojure repo area"
  (cd repo && git fetch && git reset --hard)
fi

# Create or clean output directory
if [[ ! -d repo-docs ]]; then
  echo "Creating new clojure gh-pages area"
  git clone git@github.com:clojure/clojure.git repo-docs
  (cd repo-docs && git checkout gh-pages)
else
  echo "Refreshing clojure gh-pages area"
  (cd repo-docs && git fetch && git reset --hard)
fi
rm -rf repo-docs/*

# Copy stable site files
echo "Copying static site files"
cp -R site/* repo-docs

# Build all branches
for branch in config/*/
do
  echo "Building $branch"
  cd "$branch"
  ./build.sh
  cd ../..
done	

# Commit
if [[ ! -z "$COMMIT" ]]; then
  echo "Committing updated gh-pages branch"
  cd repo-docs
  git add -u -v
  git commit -m "Autodoc commit"
  git config --global push.default simple
  git push
fi
