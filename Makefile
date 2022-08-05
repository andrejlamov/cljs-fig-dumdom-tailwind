.PHONY: watch

TAILWIND_VERSION=v3.1.8

tailwindcss:
	curl -sLO https://github.com/tailwindlabs/tailwindcss/releases/download/$(TAILWIND_VERSION)/tailwindcss-macos-x64
	mv tailwindcss-macos-x64 tailwindcss
	chmod +x tailwindcss

watch: tailwindcss
	./tailwindcss -i ./resources/public/input.css -o ./target/public/tailwind-out/output.css --watch

