# 3. Git — контроль версій

## Навіщо потрібен контроль версій?

Контроль версій потрібен для того, щоб зберігати історію змін проєкту. Він дозволяє побачити, що змінилося, навіщо це було зроблено, хто зробив зміну та як поєднати роботу кількох людей.

Git не є просто резервною копією. Резервна копія повертає попередній файл, а Git зберігає історію станів проєкту.

## Основні команди

```bash
git --version

git config --global user.name "Заболотня Валерія"
git config --global user.email "ВАША_ПОШТА_GITHUB"

git config --list
git config --list --show-origin | grep user

mkdir -p /tmp/identity-test
cd /tmp/identity-test
git init
echo "first" > a.txt
git add a.txt
git commit -m "first commit"
git log --format='%h %an <%ae> %s'
```

Для навчального тесту identity можна змінити тільки для поточного репозиторію:

```bash
git config user.email "someone-else@example.com"
echo "second" >> a.txt
git commit -am "second commit"
git log --format='%h %an <%ae> %s'
```

Після цього поверніться до основного проєкту.

## Відповіді на питання з практичної

**Яку з чотирьох проблем розв'язує `git log`?**  
`git log` допомагає побачити історію змін, зокрема хто і коли створив коміти та які повідомлення вони мають.

**Яку проблему розв'язує `git diff`?**  
`git diff` показує, що саме змінилося у файлах.

**Яка проблема не має розв'язку до пізніших занять?**  
Проблема поєднання одночасної роботи кількох людей потребує подальшої роботи з branches, merges та pull requests.

## Послідовність здачі

```bash
git status
git add .
git commit -m "Complete practical 1"
git push
```
