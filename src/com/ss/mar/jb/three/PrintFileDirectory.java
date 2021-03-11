package com.ss.mar.jb.three;

import java.io.File;
import java.util.Scanner;


public class PrintFileDirectory {
    /**
     * Prints file directory specified by user as a tree.
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String filesPath;
        StringBuffer tree = new StringBuffer();
        int indent = 0;

        //Get User to input path
        System.out.println("Please enter Directory path to print directory tree:");
        filesPath = userInput.nextLine();
        File directoryPath = new File(filesPath);

        try {
            getFolderTree(directoryPath, indent, tree);
        } catch (Exception e) {
            System.out.println("Incorrect Filepath. Please try again.");
            e.printStackTrace();
        }

        System.out.println(tree.toString());

    }

    /**
     * Builds tree directory from  using StringBuffer.
     *
     * @param filePath - Filepath of directory to be displayed
     * @param indent   - Int value representing the initial indents on tree branch
     * @param tree     - StringBuffer where tree directory is saved to.
     * @throws Exception - Throws exception if filepath is not a directory
     */
    public static void getFolderTree(File filePath, int indent, StringBuffer tree) throws Exception {
        if (!filePath.isDirectory()) {
            System.out.println("Filepath is not a Directory.");
            throw new Exception();
        }
        File[] fileLists = filePath.listFiles();

        if (fileLists != null) {
            tree.append(treeIndents(indent));
            tree.append("*--");
            tree.append(filePath.getName());
            tree.append("/");
            tree.append("\n");
            for (File file : fileLists) {
                if (file.isDirectory()) getFolderTree(file, indent + 1, tree);
                else getFileBranch(file, indent + 1, tree);
            }
        }
    }

    /**
     * Appends File Name as branch to tree directory
     *
     * @param branch - File name
     * @param indent - how deep the file is embedded from original filepath
     * @param tree   - StringBuffer of current tree directory
     */
    public static void getFileBranch(File branch, int indent, StringBuffer tree) {
        tree.append(treeIndents(indent));
        tree.append("--");
        tree.append(branch.getName());
        tree.append("\n");
    }

    /**
     * Adds to tree buffer the number of indents representing how nested file is in from filepath
     *
     * @param indent - how deep the file is embedded from original filepath
     * @return string to show how embedded a file is.
     */
    public static String treeIndents(int indent) {
        return "| ".repeat(Math.max(0, indent));
    }

}
