# what
cljs + figwheel + dumdom + tailwind standalone cli

# how
## fig
`cider-jack-in-cljs` in emacs or start a figwheel dev repl

``` shell
make dev-repl
```
## tailwind

start tailwind watcher for optimized css output

``` shell
make tailwind-watch
```

## google closure
compile advanced google closure bundle 


``` shell
make advanced-compilation
```

(obs it will overwrite the development js file in cljs-out)
