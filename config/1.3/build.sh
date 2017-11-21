#!/bin/bash

set -e

branch=1.3.x

# Run autodoc-collect
git -C ../../repo checkout "$branch"
rm -f analysis.edn
echo "Analyzing $branch"
cat collect.clj | clojure -C:collect -

# Run autodoc
echo "Building $branch"
cat build.clj | clojure -R:build -