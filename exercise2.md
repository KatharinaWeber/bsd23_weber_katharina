# Exercise 2
### Beschreibung: 
In this exercise we have configured our Git-Account and made a repository. Also we made our first git adds, commits, pull and pushes.
## Git commands
| Command    | Description    |
| ---------- | ----------------|
| git config | used to configure the Git installation and account information like username and email 
| git init   | initializes new Git repository and creates .git folder
| git commit | records changes to the repository to save the changes permanently -m lets you add a message to the commit so that you know what is different in the new version.  affected data: project files
| git status | gives you the current status of the working directory and shows you if files are modefied, untracked, staged or committed.
| git add    | prepares changes to be included in the next commit affected data:  puts changes into the staging area
| git log    | displays  the log of commits, commit messages, authors and date in the repository
| git diff   | shows the differences between changes made in the working directory and the staging area 
| git pull   | used to get changes from a remote repository and merges it into the current branch, affected data: locally
| git push   | used to put changes from a local repository into a remote one, affected data: remote repository

## Änderung des git status bei .gitignore
Nun werden *.html und *.pdf Dateien nicht mehr als untracked file angezeigt