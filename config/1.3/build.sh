#!/bin/bash

set -e

# Run autodoc-collect
git -C ../../repo checkout 1.3.x
rm -f analysis.edn
echo "Analyzing"
cat collect.clj | clojure -C:collect -

# Run autodoc
echo "Building"
cat build.clj | clojure -R:build -
