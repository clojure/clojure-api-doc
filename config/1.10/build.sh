#!/bin/bash

set -e

branch=clojure-1.10.1

# Run autodoc-collect
(cd ../../repo && git checkout "$branch")
rm -f analysis.edn
echo "Analyzing $branch"
cat collect.clj | clojure -C:collect -

# Run autodoc
echo "Building $branch"
cat build.clj | clojure -R:build -
