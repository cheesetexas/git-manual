public class Main {
    public static void main(String[] args) {

        // Set your account's default identity.
        /**/
        System.out.println("git config --global user.email \"you@example.com\"");
        System.out.println("git config --global user.name \"Your Name\"");

        // Clone a repository into a new directory
        System.out.println("git clone xxx.git");

        // Create an empty Git repository or reinitialize an existing one
        System.out.println("git init");

        // Add file contents to the index
        System.out.println("git add .");

        // Record changes to the repository
        System.out.println("git commit -m \"xxx\"");

        // Show the working tree status
        System.out.println("git status");

        // Show changes between commits, commit and working tree, etc
        System.out.println("git diff");

        // Show commit logs
        System.out.println("git log");
        System.out.println("git log --pretty=oneline");
        /*
         * %h simplified hash
         * %an author name
         * %ar modified time (xxx ago)
         * %ad modified time (timestamp)
         * %s commit message*/
        System.out.println("git log --pretty=format:\"%h-%an, %ar|%ad:%s\"");
        System.out.println("git log --graph");

        // List, create or delete branches
        System.out.println("git branch test");
        System.out.println("git branch --list");

        // Switch to an existing branch or a new branch
        System.out.println("git checkout test");
        System.out.println("git checkout -b test1");
        System.out.println("git checkout -b test1 origin/test1");
        System.out.println("git checkout --track origin/test1");

        // Join two or more development histories together
        System.out.println("git merge test1");

        // Update remote refs along with associated objects
        System.out.println("git push -u origin master");
        System.out.println("git push origin test1");

        // Download objects and refs from another repository
        System.out.println("git fetch");

        // Store the uncommitted changes before switching to another branch
        System.out.println("git stash");
        System.out.println("git stash apply");

        // Reset current HEAD to the specified state
        System.out.println("git reset head~ --soft"); // --soft只回到暂存区，--hard直接回到上一次提交的状态（数据会丢失）
    }
}