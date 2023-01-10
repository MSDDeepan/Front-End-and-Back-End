import java.util.*;
import java.io.*;

public class Employee
{
public static void main(String[]args) throws Exception {

    ArrayList<String> ar = new ArrayList<>();
    ArrayList<String> ar1 = new ArrayList<>();
    ArrayList<String> ar2 = new ArrayList<>();
    ArrayList<String> ar3 = new ArrayList<>();
    ArrayList<String> ar4 = new ArrayList<>();
    ArrayList<String> ar5 = new ArrayList<>();
    for (int i = 0; i <6; i++) {
        if (i == 0)
        {
            File f = new File("/Users/nagadeepan/IdeaProjects/assignment-1/src/employees.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine())
            {

                String ss = sc.nextLine().trim();
                String[] x = ss.split(",");
                ar.add(x[i]);

            }
        }
        else if (i == 1)
        {
            File f = new File("/Users/nagadeepan/IdeaProjects/assignment-1/src/employees.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine())
            {

                String ss = sc.nextLine().replaceAll("( )+", " ");
                String sss = ss.trim().replaceAll(" +", " ");
                String[] x = ss.split(",");

                ar1.add(x[i]);

            }
        }
        else if (i == 2) {
            File f = new File("/Users/nagadeepan/IdeaProjects/assignment-1/src/employees.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine())
            {

                String ss = sc.nextLine().replaceAll("( )+", " ");
                String sss = ss.trim().replaceAll(" +", " ");
                String[] x = ss.split(",");

                ar2.add(x[i]);

            }
        }
        else if (i == 3)
        {
            File f = new File("/Users/nagadeepan/IdeaProjects/assignment-1/src/employees.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine())
            {

                String ss = sc.nextLine().replaceAll("( )+", " ");
                String sss = ss.trim().replaceAll(" +", " ");
                String[] x = ss.split(",");

                ar3.add(x[i]);

            }
        }
        else if (i == 4) {
            File f = new File("/Users/nagadeepan/IdeaProjects/assignment-1/src/employees.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine())
            {

                String ss = sc.nextLine().replaceAll("( )+", " ");
                String sss = ss.trim().replaceAll(" +", " ");
                String[] x = ss.split(",");

                ar4.add(x[i]);

            }
        }
        else {
            File f = new File("/Users/nagadeepan/IdeaProjects/assignment-1/src/employees.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {

                String ss = sc.nextLine().replaceAll("( )+", " ");
                String sss = ss.trim().replaceAll(" +", " ");
                String[] x = ss.split(",");

                ar5.add(x[i]);

            }


        }


    }
    ar.remove(0);
    ar1.remove(0);
    ar2.remove(0);
    ar3.remove(0);
    ar4.remove(0);
    ar5.remove(0);
    ArrayList<String> ee=new ArrayList<>();
    ArrayList<String> eee=new ArrayList<>();
    ArrayList<String> eeee=new ArrayList<>();
    for(int i=0;i<ar.size();i++)
    {

        String z = "DEV;";
        String zz=ar5.get(i).trim();


        if (z.equals(zz))
        {
            String h=ar1.get(i)+ar2.get(i);
            ee.add(h);
        }
    }
    String d=ee.toString();

    try {
        FileWriter fw = new FileWriter("DEV.txt");
        fw.write(d);
        fw.close();
    }
    catch (Exception e) {
        System.out.println("error");
    }
    for(int i=0;i<ar.size();i++)
    {

        String s = "QA;";
        String ss=ar5.get(i).trim();


        if (s.equals(ss))
        {
            String h=ar1.get(i)+ar2.get(i);
            eee.add(h);
        }
    }
    String dd=eee.toString();

    try {
        FileWriter fw = new FileWriter("QA.txt");
        fw.write(dd);
        fw.close();
    }
    catch (Exception e) {
        System.out.println("error");
    }
    for(int i=0;i<ar.size();i++)
    {

        String t = "MANAGER;";
        String tt=ar5.get(i).trim();


        if (t.equals(tt))
        {
            String h=ar1.get(i)+ar2.get(i);
            eeee.add(h);
        }
    }
    String ddd=eeee.toString();

    try {
        FileWriter fw = new FileWriter("MANAGER.txt");
        fw.write(ddd);
        fw.close();
    }
    catch (Exception e) {
        System.out.println("error");
    }


}


}




