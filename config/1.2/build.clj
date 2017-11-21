(require '[autodoc.build-html :as h] 
         '[autodoc.params :as p]
         '[autodoc.doc-files :as d]
         '[clojure.edn :as e]) 
(import [java.io PushbackReader FileReader File]) 

(defn edn-read [f]
  (let [EOF (Object.)]
    (with-open [rdr (PushbackReader. (FileReader. (File. f)))]
      (e/read {:eof EOF} rdr))))

(def shared (edn-read "../params.clj"))

(p/merge-params
  (merge shared    
    {:root (.getAbsolutePath (File. "../../repo/"))
     :template-dir "old-templates"}))

(h/make-all-pages 
  {:name "1.2.x" :version "v1.2" :status "legacy"}
  (:branches shared)
  (edn-read "analysis.edn"))

(d/xform-tree "../../repo/doc" "../../repo-docs/branch-1.2.x/doc")