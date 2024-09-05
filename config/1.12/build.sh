#!/bin/bash

set -e

branch=clojure-1.12.0

# Run autodoc-collect
(cd ../../repo && git checkout "$branch")
rm -f analysis.edn
echo "Analyzing $branch"
cat collect.clj | clojure -M:collect -

# Run autodoc
echo "Building $branch"
cat build.clj | clojure -M:build -
