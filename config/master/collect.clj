(use 'autodoc-collect.collect-info)
(collect-info-to-file 
  ;; Clojure repo directory
  "../../repo/"

  ;; Relative path in repo to Clojure source
  "src/clj"

  ;; Analyze these namespaces 
  "clojure.core:clojure.core.protocols:clojure.core.reducers:clojure.core.server:clojure.inspector:clojure.main:clojure.pprint:clojure.repl:clojure.set:clojure.stacktrace:clojure.string:clojure.template:clojure.test:clojure.walk:clojure.xml:clojure.zip:clojure.java.browse:clojure.java.io:clojure.java.javadoc:clojure.java.shell:clojure.data:clojure.reflect:clojure.edn:clojure.instant"

  ;; Skip these namespaces
  "clojure/core.clj:clojure/core_instant18.clj:clojure/parallel.clj" 

  ;; Trim prefix - don't set
  nil
 
  ;; Output analysis data file 
  "analysis.edn"

  ;; Branch name
  "master")
