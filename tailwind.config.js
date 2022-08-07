function extract_hiccup_shortform(content) {
  return content.match(/[^<>"'.`\s]*[^<>"'.`\s:]/g) || []
}

module.exports = {
  content: {
    files: ["./target/public/cljs-out/dev/hello/**/*.{js,cljs,cljc,clj}"],
    extract: {
       cljs: extract_hiccup_shortform,
       clj: extract_hiccup_shortform,
       cljc: extract_hiccup_shortform
    }
  }
  ,
  theme: {
    extend: {},
  },
  plugins: [],
}
