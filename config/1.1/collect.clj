(use 'autodoc-collect.collect-info)
(collect-info-to-file 
  ;; Clojure repo directory
  "../../repo/"

  ;; Relative path in repo to Clojure source
  "src/clj"

  ;; Analyze these namespaces 
  "clojure.core:clojure.inspector:clojure.main:clojure.set:clojure.stacktrace:clojure.template:clojure.test:clojure.walk:clojure.xml:clojure.zip"

  ;; Skip these namespaces
  "clojure/core.clj:clojure/parallel.clj" 

  ;; Trim prefix - don't set
  nil
 
  ;; Output analysis data file 
  "analysis.edn"

  ;; Branch name
  "v1.1")