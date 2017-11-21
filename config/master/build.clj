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
    {:root (str (.getAbsolutePath (File. "../../repo")) "/")
     :output-path (str (.getAbsolutePath (File. "../../repo-docs")) "/")
     :template-dir "templates"}))

(let [branch-info {:name "master" :version "v1.9" :status "in development"}
      all-branch-info (:branches shared)]

  (d/xform-tree "../../repo/doc" "../../repo-docs/branch-master/doc")
  (h/make-all-pages branch-info all-branch-info (edn-read "analysis.edn")))