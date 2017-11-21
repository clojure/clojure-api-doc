#!/bin/bash

set -e

# Run autodoc-collect
git -C ../../repo co master
rm -f analysis.edn
echo "Analyzing"
cat collect.clj | clojure -

# Run autodoc
echo "Building"
cat build.clj | clojure -
