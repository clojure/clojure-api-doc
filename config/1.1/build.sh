#!/bin/bash

set -e

branch=1.1.x

# Run autodoc-collect
(cd ../../repo && git checkout "$branch")
rm -f analysis.edn
echo "Analyzing $branch"
clojure -Spath
clojure -M:collect collect.clj

# Run autodoc
echo "Building $branch"
clojure -M:build build.clj
