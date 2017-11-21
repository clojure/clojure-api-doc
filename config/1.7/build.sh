#!/bin/bash

set -e

# Run autodoc-collect
git -C ../../repo checkout clojure-1.7.0
rm -f analysis.edn
echo "Analyzing"
cat collect.clj | clojure -

# Run autodoc
echo "Building"
cat build.clj | clojure -R:build -
