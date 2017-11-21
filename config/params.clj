{ ;; Build parameters shared across all branches
  :name "Clojure"
  :page-title "Clojure Core API Reference"
  :copyright "Copyright 2007-2017 Rich Hickey"
  :web-home "https://clojure.github.io/clojure/"
  :external-doc-tmpdir "tmp"
  :file-prefix ""
  :build-json-index false
  :build-raw-index false
  :scm-tool "git"
  :branches [{:name "clojure-1.8.0" :version "v1.8" :status "stable"}
             {:name "master" :version "v1.9" :status "in development"}
             {:name "clojure-1.7.0" :version "v1.7" :status "legacy"}
             #_{:name "clojure-1.6.0" :version "v1.6" :status "legacy"}
             #_{:name "clojure-1.5.0" :version "v1.5" :status "legacy"}
             #_{:name "clojure-1.4.0" :version "v1.4" :status "legacy"}
             #_{:name "1.3.x" :version "v1.3" :status "legacy"}
             #_{:name "1.2.x" :version "v1.2" :status "legacy"}
             #_{:name "1.1.x" :version "v1.1" :status "legacy"}]
}
