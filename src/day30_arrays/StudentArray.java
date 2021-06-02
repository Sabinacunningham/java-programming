package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {
        String[] student1 = new String[5];
        student1[0] = "AD1234";
        student1[1] = "Adam";
        student1[2] = "Smith";
        student1[3] = "B22";
        student1[4] = " 23430584309";// useful when you didn't know your values, coming from different array

        String[] student2 = {"MK44421", "Mike", "Bloomberg", "B22", " 702-432-1234"};

        System.out.println("student1 id = " + student1[0]);
        System.out.println("student1 firstName = " + student1[1]);
        System.out.println("student1 lastName = " + student1[2]);
        System.out.println("student1 batch num =" + student1[3]);
        System.out.println("student1 mobile num =" + student1[4]);

        System.out.println("student data length: " + student1.length);
        if (student1.length == 5) {
            System.out.println("PASS: data array has correct length");
        } else {
            System.out.println("FAIL: data array has incorrect length");

        }

        if (student1.length == student2.length) {
            System.out.println("TRUE: PASS: data array length match");
        } else {
            System.out.println("FALSE: FAIL: data arrays length mismatch");
        }

        //check if student1 data array contains 5 items.
        //true:
        //print firstName and lastName in all uppercase
        //adam
        //"Adam" --> "ADAM"                    "Smith" --> "SMITH"
        System.out.println(student1[1].toUpperCase() + " " + student1[2].toUpperCase());

        //read mobile from array and store into variable
        String mobileNum = student1[4];
        System.out.println(mobileNum.length());
        System.out.println(mobileNum.startsWith("202")); //can use all of this because it is String; string manipulation


    }
}
