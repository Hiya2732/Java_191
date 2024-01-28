package com.company;
import java.util.Scanner;
public class movies{
    public static void main(String[] arg){
            Scanner s=new Scanner(System.in);
            System.out.println("Enter no. of films: ");
            int num=s.nextInt();
            film[] arr=new film[num];
            for(int i=0;i<num;i++){
                System.out.println("Enter the details of film "+(i+1));
                arr[i]=new film();
                arr[i].getData();

            }
            System.out.println("Enter the language of the film to be searched ");
            String language_film;
            language_film=s.next();
            for(int i=0;i<num;i++){
                arr[i].display(language_film);

            }
        }
    }
    class film{
        Scanner s=new Scanner(System.in);
        String fname,pcom,lang;
        int fid,nof;
        public void getData(){
            System.out.println("Enter the name of the film");
            fname=s.next();
            System.out.println("Enter the id of the film");
            fid=s.nextInt();
            System.out.println("Enter the no. of frames of the film");
            nof=s.nextInt();
            System.out.println("Enter the name of production company of the film");
            pcom=s.next();
            System.out.println("Enter the language of the film");
            lang=s.next();
        }
        public void display(String flang){
            if(lang.equalsIgnoreCase(flang)==true) {
                System.out.println("The film based on the language searched is "+fname);
            }
        }
    }
