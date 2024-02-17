package day21_multiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {
    public static void main(String[] args) {

        String[] group1 = {"James", "Daniel", "Roman", "Oleg"};//4 names
        String[] group2 = {"Lena", "Lana", "Luna"};//3 names
        String[] group3 = {"Sasha", "Misha", "Moysha", "Igor", "Nastya"};//5 names
        String[] group4 = {"Oksana", "Laima"};//2 names

        String[][] groups = {group1, group2, group3, group4};
        // i                  0      1      2      3

        for (int i = 0; i < groups.length; i++) {
            String[] eachGroup = groups[i];//assigned in a single dimention array again
            System.out.println(Arrays.toString(eachGroup));
            for (int j = 0; j < eachGroup.length; j++) {
                String eachStudent = eachGroup[j];
                System.out.println(eachStudent);
            }
        }
        System.out.println("__________________________________________________________");

        for (String[] eachGroup : groups) {
            System.out.println(Arrays.toString(eachGroup));
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }
        }
        /*
[James, Daniel, Roman, Oleg]
James
Daniel
Roman
Oleg
[Lena, Lana, Luna]
Lena
Lana
Luna
[Sasha, Misha, Moysha, Igor, Nastya]
Sasha
Misha
Moysha
Igor
Nastya
[Oksana, Laima]
Oksana
Laima
 */
        System.out.println("________________________________________________________");
        for (int i = groups.length - 1; i >= 0; i--) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

        for (String eachStudent:eachGroup){
            System.out.println(eachStudent);

        }}
    /*
[Oksana, Laima]
Oksana
Laima
[Sasha, Misha, Moysha, Igor, Nastya]
Sasha
Misha
Moysha
Igor
Nastya
[Lena, Lana, Luna]
Lena
Lana
Luna
[James, Daniel, Roman, Oleg]
James
Daniel
Roman
Oleg
     */
    System.out.println("__________________________________________________________");

        System.out.println(groups);
        System.out.println(Arrays.toString(groups));//toString()==> for single dimensional arrays ONLY
        System.out.println(Arrays.deepToString(groups));//method is design to converting multi-dimensional array into String

/*
[[Ljava.lang.String;@3f0ee7cb
[[Ljava.lang.String;@75bd9247, [Ljava.lang.String;@7d417077, [Ljava.lang.String;@7dc36524, [Ljava.lang.String;@35bbe5e8]
[[James, Daniel, Roman, Oleg], [Lena, Lana, Luna], [Sasha, Misha, Moysha, Igor, Nastya], [Oksana, Laima]]
 */
    }}




