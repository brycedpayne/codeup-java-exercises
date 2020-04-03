package util;

//import util.Input; //not necessary if in same package.

public class InputTest {
    public static void main(String[] args){

        Input input = new Input(); //init for new Input instance.
//        System.out.println(input.getString()); //method call
//        System.out.println(input.yesNo()); //method call
//        System.out.println(input.getInt(1,10)); //method call
//        System.out.println(input.getInt()); //method call
//        System.out.println(input.getDouble(1.0,10.0)); //method call
//        System.out.println(input.getDouble()); //method call
        System.out.println(input.getBinary());
        System.out.println(input.getHex());
//        System.out.println(input.intToBin());
//        System.out.println(input.intToHex());
//        int[] arr = {10,7,5,6};
//        System.out.println(input.addCheck(arr,18));
    }
}
