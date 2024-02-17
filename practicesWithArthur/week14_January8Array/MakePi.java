package week14_January8Array;

import java.util.Arrays;

public class MakePi {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(makePi()));
    }
    public static int[] makePi() {
 /*

 ---How To DECLARE An Array In Java?
		In Java, a one-dimensional array is declared in one of the following ways:

		Here the ‘data_type’ specifies the type of data the array will hold.
		The ‘data_type’ can be a primitive data type or any derived type.
		For Example, an array piArray of type integer is declared as follows:

		data_type[] array_name; ----->  int[] piArray; or
		data_type array_name[]; ----->  int piArray[];



		This means that the array piArray will hold the elements of data type int.

		Note that as the arrays in Java are dynamically allocated,
		we do not specify any dimension or size of the array with the declaration.
		The above declaration tells the compiler that
		there is an array variable ‘piArray’ of type int
		which will be storing the integer type values in it.

		The compiler does not know the size or actual values stored in an array.
		It will only know that after we initialize the array.

 ---How To INSTANTIATE And INITIALIZE An Array In Java?
		We have already declared an array in the previous section. But this is just
		a reference.
		In order to use the above-declared array variable, you need to instantiate it
		and then provide values for it. The array is instantiated using ‘new’.

		The general syntax of instantiating is as follows:

		array_name = new data_type [size];
		In the above statement, array_name is the name of the array being instantiated.

		data_type=> type of elements the array is going to store

		size=> the number of elements that will be stored in array
		Hence when you use new with the array, you are actually allocating the array
		with the data type and the number of elements.

		So the above-declared array myarray can be instantiated as follows:

		piArray = new int[3]
		Thus creating an array in Java involves two steps as shown below:

		int[] piArray;          //declaration
		piArray = new int[3];  //instantiation

		Once the array is created, you can initialize it with values as follows:

		piArray[0] = 3;
		piArray[1] = 1;
		piArray[2] = 4;….and so on until all elements are initialized.
		The expression in the square brackets above is called the index of the array.
		The index of the array is used to access the actual value of the elements
		i.e. the above array myarray of 10 int elements will have indices numbered
		from 0 to 9.
		You can access the element of the array at a particular position by
		specifying the index as above.

		Note that the array index always starts from 0.
		Alternatively, you can also do the initialization using a loop which
		we will see later on.  */


        // solution1(separetely declaration, instantiation and initialization)

        // ---Declare an Array:
        //int [] piArray  //or int piArray []

        //---Instantiate an Array:
        // piArray=new int [3];

        //---Initialize an Array:
        // piArray[0]=3;
        // piArray[1]=1;
        // piArray[2]=4;
        // return piArray;

        //solution2(declaration+instantiation together and then initialization)
        // int piArray []=new int [3];
        // piArray[0]=3;
        // piArray[1]=1;
        // piArray[2]=4;
        // return piArray;

        //solution3(declaration+instantiation+initialization)
        // int [] piArray = new int [] {3,1,4};
        // return piArray;

        //solution4(direct return with array literal)
        return new int[]{3, 1, 4};
    }
}
