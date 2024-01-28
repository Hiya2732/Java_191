//package com.company;
import java.io.*;
public class file1
{
public static void main(String[] args)
{
    try{
        File f=new File("firstfile.txt");
        if(f.createNewFile()){
            System.out.println("new file created");

        }
        else{
            System.out.println("file already exists");
        }
    } catch (IOException e){
        e.printStackTrace();
    }
}
}
