# 2. DevOps — термінал і файлова система

Цей розділ підготовлено за матеріалами практичної роботи.

## Виконані команди

```bash
echo $SHELL
ps -p $$
which zsh
which bash

pwd
ls
ls -l
ls -la

mkdir -p ~/dev/terminal-lab/src/main
cd ~/dev/terminal-lab
pwd

cd src/main
pwd

cd ../..
pwd
cd ~
pwd

cd ~/dev/terminal-lab
ls src/main
cd src
ls src/main
ls main
ls ~/dev/terminal-lab/src/main

mkdir -p ~/dev/terminal-lab/lecture-{01..16}
ls ~/dev/terminal-lab

uname -a
uname -s
df -h ~
du -sh ~/dev/terminal-lab
```

## Короткий висновок

Термінал дозволяє виконувати дії з файлами та текою командами. `pwd` показує поточне місце, `ls` показує вміст теки, `cd` змінює поточну теку, а `mkdir` створює теки.

Абсолютний шлях починається від кореня файлової системи, а відносний шлях залежить від поточної теки. Параметр `-p` у `mkdir` дозволяє створювати вкладені теки одразу.

Термінал зручний тоді, коли одну і ту саму дію треба повторювати багато разів або точно записати послідовність дій.
