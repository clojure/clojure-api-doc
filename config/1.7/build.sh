#!/bin/bash

set -e

branch=clojure-1.7.0

# Run autodoc-collect
git -C ../../repo checkout "$branch"
rm -f analysis.edn
echo "Analyzing $branch"
cat collect.clj | clojure -C:collect -

# Run autodoc
echo "Building $branch"
cat build.clj | clojure -R:build -