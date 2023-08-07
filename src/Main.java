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

        // Reset current HEAD to the specified state
        System.out.println("git reset head~ --soft");

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

        // Switch to branch
        System.out.println("git checkout test");
    }
}