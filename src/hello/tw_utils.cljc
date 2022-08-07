(ns hello.tw-utils
  (:require [clojure.string :as s]))

(defn normalize [& args]
  (let [class-list (->> args
                        (flatten)
                        (filter (fn [v] (-> v boolean true?)))
                        (map (fn [k] (let [v (if (keyword? k) (name k)
                                                 k)]
                                       (s/split v #"\s+"))))
                        (flatten)
                        (map s/trim)
                        (distinct))]

    (s/join " " class-list)))

(defn tw [& args]
  (let [bl (drop-last args)
        l (last args)]
    (if (map? l)
      (merge {:class (normalize bl)} l)
      {:class (normalize args)})))

