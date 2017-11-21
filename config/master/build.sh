#!/bin/bash

set -e

branch=master

# Run autodoc-collect
git -C ../../repo co "$branch"
rm -f analysis.edn
echo "Analyzing $branch"
cat collect.clj | clojure -C:collect -

# Run autodoc
echo "Building $branch"
cat build.clj | clojure -R:build -