(use 'autodoc-collect.collect-info)
(collect-info-to-file 
  ;; Clojure repo directory
  "../../repo/"

  ;; Relative path in repo to Clojure source
  "src/clj"

  ;; Analyze these namespaces 
  "clojure.core:clojure.core.protocols:clojure.core.reducers:clojure.core.server:clojure.data:clojure.datafy:clojure.edn:clojure.inspector:clojure.instant:clojure.java.browse:clojure.java.io:clojure.java.javadoc:clojure.java.shell:clojure.main:clojure.math:clojure.pprint:clojure.reflect:clojure.repl:clojure.set:clojure.stacktrace:clojure.string:clojure.template:clojure.test:clojure.walk:clojure.xml:clojure.zip"

  ;; Skip these namespaces
  "clojure/core.clj:clojure/parallel.clj" 

  ;; Trim prefix - don't set
  nil
 
  ;; Output analysis data file 
  "analysis.edn"

  ;; Branch name
  "clojure-1.11.2")
