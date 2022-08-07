TW_VERSION=v3.1.8
TW_PATH=.tailwind/tailwindcss-$(TW_VERSION)
TW_CMD=$(TW_PATH) -i ./resources/public/input.css -o ./target/public/tailwind-out/output.css

.PHONY: tailwind-watch dev-repl advanced-compilation

$(TW_PATH):
	mkdir -p .tailwind
	curl -sL https://github.com/tailwindlabs/tailwindcss/releases/download/$(TW_VERSION)/tailwindcss-macos-x64 -o $(TW_PATH)
	chmod +x $(TW_PATH)

tailwind-watch: $(TW_PATH)
	./$(TW_CMD) --watch

dev-repl:
	clojure -A:build-dev

advanced-compilation:
	clojure -m figwheel.main -O advanced --build-once dev
	./$(TW_CMD)
