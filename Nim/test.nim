import std/terminal
import std/[os, strutils]

for i in 0..100:
  stdout.styledWriteLine(fgRed, "0% ", fgWhite, '#'.repeat i, if i > 50: fgGreen else: fgYellow, "\t", $i , "%")
  sleep 42
  cursorUp 1
  eraseLine()

stdout.resetAttributes()