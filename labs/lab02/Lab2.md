# Lab 2 - Using Git and Variable Types

## Introduction

This lab will teach you about setting up your own Git repo and publishing it to GitHub.  Additionally, it will give you the chance to see how variable assignment works in Java.

## Setting Up A Git Repo

Git is very useful, as it gives you two big benefits:

1. Sharing code is very easy
2. You can "time-travel" by making save points in your code.  Just like a save point in a video game, you can go back to an earlier point in development.

Set up Git and GitHub on your machine using the instructions here: https://help.github.com/articles/set-up-git/

Now create a repository (often referred to as a _repo_) using the instructions here: https://help.github.com/articles/create-a-repo/ This repo should be called "Lab2".  This one will be public.  _One difference:_ On step 7 of "Commit Your First Change", do not create a Pull Request.  Just commit directly to Master.

After following the steps above, go back to your repo's home (https://github.com/<your user name>/Lab2).  If you scroll to the bottom, you should see the message you typed in the README.md file.

Congratulations, you now have a git repo!  However, it only exists on GitHub.  We need to make a link to it on our local machine.

On your local machine, make a directory where you would like the repo to exist locally, for example, your home directory.

```
cd ~
```

Now let's clone the repository to a subdirectory under this directory.  Replace my git username ("laboon") with your own username.

```
git clone git@github.com:laboon/lab2.git
```

This will create a subdirectory.  Go to it and look around.

```
cd lab2
ls -l
```

There's the README.md file you created!  This is showing you the last "save pointed" (a/k/a "committed") version.

Modify the README.md file using your favorite text editor.

```
vi README.md
```

or

```
emacs -nw README.md
```

or

```
sublime README.md
```

or whatever.  At the end of the file, add the sentence:

```
Ducks like to quack, but quacks don't like to duck.
```

and save the file.  If you refresh the GitHub site, it's not there - the changes were only made locally.  In fact, since they haven't been committed, the changes are just kind of floating out there.  You can see them, but from git's perspective, they don't really exist.  Take a look at what git is seeing by typing:

```
git status
```

It will tell you something along these lines:

```
On branch master
Your branch is up-to-date with 'origin/master'.

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

	modified:   README.md
```

This means that you have a file which you made changes to, but is not committed.

If you type:

```
git diff
```

It will show you which lines were edited, added, or deleted.

Let's now commit all of our changes with the following command:

```
git commit -a -m "Added duck info"
```

This commits all of our changes (that is what the -a flag means) with the message "Added duck info".  We can look back into the past of this repo with the command:

```
git log
```

So let's try that now.  You should see output similar to the following:

```
commit fe813a4d1fd912958520a838318b462402718167
Author: laboon <laboon@gmail.com>
Date:   Fri Sep 11 15:43:08 2015 -0400

    Added duck info

commit 30c53ecdc89e5c3f808549865a4e33922454b44a
Author: Bill Laboon <laboon@users.noreply.github.com>
Date:   Fri Sep 11 14:51:36 2015 -0400

    Initial commit

```

That long string of letters and numbers is actually a hexadecimal (base 16) number which uniquely identifies that commit.  It's called a SHA (rhymes with "baa"), after the hashing algorithm used to create it. Think of it as a PeopleSoft number or SSN for your commit.  If you want to look at what a commit consists of, you can `show` it by using the show command with the SHA.  Try the following command, but use one of the SHAs that your computer shows - this particular one won't work.

```
git show 30c53ecdc89e5c3f808549865a4e33922454b44a
```

Make a new file using your text editor, called Test.java.  Copy and paste the following text to it:

```
public class Test {

    public static void main(String[] args) {
        System.out.println("Test!");
    }

}
```

Now type:

```
git status
```

You will see a message like:

```
Untracked files:
  (use "git add <file>..." to include in what will be committed)

	Test.java
```

We need to tell git which files we want it to track.  So type:

```
git add Test.java
```

Later, if you decide you don't want git to track a file anymore, you can use `rm` instead of `add` to remove it.

Now let us see the status again:

```
git status
```

You should see:

```
Changes to be committed:
  (use "git reset HEAD <file>..." to unstage)

	new file:   Test.java
```

After adding, we will need to commit again.  We have made a change but not committed it.  Until we commit it, it's not really part of git.

```
git commit -a -m "added Test.java"
```

If you go back to the GitHub repo, you will notice that Test.java is not there, nor are our changes to README.md.  All changes were made locally.  We need to "push" our changes up to the GitHub server:

```
git push origin master
```

Git will inform you that it has succeeded:

```
Counting objects: 8, done.
Delta compression using up to 2 threads.
Compressing objects: 100% (3/3), done.
Writing objects: 100% (6/6), 501 bytes | 0 bytes/s, done.
Total 6 (delta 0), reused 0 (delta 0)
To git@github.com:laboon/lab2.git
   30c53ec..5bc5379  master -> master
```

Now if you look at the repo page on GitHub, you will see Test.java.  Your local machine's copy and the copy on GitHub are in sync.

Make a few more changes and commits to Test.java, and push up to GitHub.  


## Fixing and Running The Program

Copy and paste the Java program `Lab2.java` into a file with the same name to your git repo.  Compile and run the file to ensure that it works; the nursery rhyme "As I Was Going to St. Ives" should display upon your console.  After that, `git add` the file and commit this with a message like "initial input".

In the file, there are three numbered problems.  After you have fixed each one, save the file and commit the changes with an appropriate message.

The first problem is to edit each of the six variable declaration/assignments so that the program both compiles and gives the correct answer.  Note that the man should be going to St. Ives, so set that variable appropriately.  Also note that there may be more than one thing wrong with a single statement!

The second is to calculate exactly how many entities (men, wives, sacks, cats, and kittens) are going to St. Ives, and put this value in the variable _total_.

The third and final problem is to print out "Number going to St. Ives is ", followed by the number you calculated and put in the variable _total_.

Once you have solved all of the problems, push to GitHub.

